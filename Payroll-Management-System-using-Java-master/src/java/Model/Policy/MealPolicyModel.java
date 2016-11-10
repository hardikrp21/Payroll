/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Beans.Policy.MealPolicyVo;
import DAO.ConnectionHandler;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class MealPolicyModel {
ConnectionHandler ch;
    public MealPolicyModel() {
        ch=new ConnectionHandler();
    }
    public boolean MealpolicyInsertDetails(MealPolicyVo mpv)
    {
        boolean result=false;

        String query="insert into Meal_policy (meal_policy_name ,active_after ,meal_time ,minimum_punch_time ,maximum_punch_time ) values('"+mpv.getMpolicyname()+"','"+mpv.getMactiveafter()+"','"+mpv.getMmealtime()+"','"+mpv.getMmintime()+"','"+mpv.getMmaxtime()+"')";

        result=ch.insertQuery(query);
        return result;
    }

   public ArrayList MealpolicyTableData(){
       ArrayList data=new ArrayList();
        String query="SELECT mealpolicy_id,meal_policy_name ,active_after ,meal_time ,minimum_punch_time ,maximum_punch_time FROM meal_policy ";

        System.out.println(query);
        data=ch.selectQuery(query);
        return data;
    }

    public ArrayList MealpolicySelectdate(String id){
       ArrayList data=new ArrayList();
        String query="SELECT mealpolicy_id,meal_policy_name ,active_after ,meal_time ,minimum_punch_time ,maximum_punch_time FROM meal_policy where mealpolicy_id="+id;

        System.out.println(query);
        data=ch.selectQuery(query);
        return data;
    }

    public boolean MealpolicyupdateData(MealPolicyVo mpv){
       String query="update meal_policy set meal_policy_name='"+mpv.getMpolicyname()+"' ,active_after='"+mpv.getMactiveafter()+"' ,"
               + "meal_time='"+mpv.getMmealtime()+"' ,minimum_punch_time='"+mpv.getMmintime()+"' ,maximum_punch_time='"+mpv.getMmaxtime()+"' where mealpolicy_id='"+mpv.getId()+"'";

     // String query="update company_master set company_full_name='"+companyMasterVo.getCfullname()+"',company_short_name='"+companyMasterVo.getCshortname()+"'where company_id='"+companyMasterVo.getId()+"'";
       System.out.println(query);
      boolean data=ch.executeUpdate(query);

       return data;
   }

public boolean  MealpolicyDelete(String id)
    {
        String query="delete from meal_policy where mealpolicy_id="+id;
        System.out.println("DELETE....."+query);
       boolean result=ch.executeUpdate(query);
        return result;
    }


}
