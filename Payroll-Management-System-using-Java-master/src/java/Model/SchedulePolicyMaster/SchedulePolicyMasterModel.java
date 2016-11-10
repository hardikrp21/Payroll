/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.SchedulePolicyMaster;

import Beans.SchedulePolicyMaster.SchedulePolicyMasterBean;
import DAO.ConnectionHandler;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class SchedulePolicyMasterModel {
ConnectionHandler ch;
    public SchedulePolicyMasterModel() {
        ch=new ConnectionHandler();
    }

    public String getMealPolicyData()
    {
        ArrayList  policy_data=new ArrayList();
        String MealName="";
        try
        {
        String query="select mealpolicy_id,meal_policy_name from meal_policy";
        policy_data=ch.selectQuery(query);
            System.out.println(query);
         MealName="<select name='MealPolicyData'>";
        for(int i=0;i< policy_data.size();i++)
        {
            ArrayList inner=(ArrayList) policy_data.get(i);
            if(inner.get(0).toString().equals("1"))
                MealName+="<option value='"+inner.get(0)+"' selected>"+inner.get(1)+"</option>";
            else
                MealName+="<option value='"+inner.get(0)+"'>"+inner.get(1)+"</option>";
        }
        MealName+="</select>";
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return MealName;
    }

      public String getBreakPolicyData()
    {
        ArrayList  policy_data=new ArrayList();
        String BreakName="";
        try
        {
        String query="select break_policy_id,break_name from break_policy";
        policy_data=ch.selectQuery(query);
            System.out.println(query);
         BreakName="<select name='BreakPolicyData'>";
        for(int i=0;i< policy_data.size();i++)
        {
            ArrayList inner=(ArrayList) policy_data.get(i);
            if(inner.get(0).toString().equals("1"))
                BreakName+="<option value='"+inner.get(0)+"' selected>"+inner.get(1)+"</option>";
            else
                BreakName+="<option value='"+inner.get(0)+"'>"+inner.get(1)+"</option>";
        }
        BreakName+="</select>";
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return BreakName;
    }

      public String getAbsencePolicyData()
    {
      List  policy_data=new ArrayList();
        String AbsencePolicyName="";
        try
        {
        String query="select absence_policy_id,absence_policy_name from absence_policy";
        policy_data=ch.selectQuery(query);
            System.out.println(query);
        AbsencePolicyName="<select name='AbsencePolicyData'>";
        for(int i=0;i< policy_data.size();i++)
        {
            List inner=(List) policy_data.get(i);
            if(inner.get(0).toString().equals("1"))
                AbsencePolicyName+="<option value='"+inner.get(0)+"' selected>"+inner.get(1)+"</option>";
            else
                AbsencePolicyName+="<option value='"+inner.get(0)+"'>"+inner.get(1)+"</option>";
        }
        AbsencePolicyName+="</select>";
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return AbsencePolicyName;
    }

    public boolean InsertSchedulePolicy(SchedulePolicyMasterBean bean){
        boolean result=false;
        String query="insert into schedule_policy_master(schedule_policy_name,mealpolicy_id,break_policy_id,absence_policy_id) values ('"+bean.getSchedulepolicyname()+"',"+bean.getMealpolicy_id()+","+bean.getBreak_policy_id()+","+bean.getAbsence_policy_id()+")";
        result=ch.executeUpdate(query);
        System.out.println(query);
        return result;
    }

     public ArrayList SchedulePolicyTableData(){
       ArrayList data=new ArrayList();
        String query="SELECT schedule_policy_master.schedule_policy_id,schedule_policy_master.schedule_policy_name,meal_policy.meal_policy_name,break_policy.break_name FROM schedule_policy_master INNER JOIN meal_policy ON schedule_policy_master.mealpolicy_id=meal_policy.mealpolicy_id INNER JOIN break_policy ON schedule_policy_master.break_policy_id=break_policy.break_policy_id";

        System.out.println(query);
        data=ch.selectQuery(query);
        return data;
    }


    
}
