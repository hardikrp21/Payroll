/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Beans.Policy.BreakPolicyVo;
import DAO.ConnectionHandler;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BreakPolicyModel {
ConnectionHandler ch;
    public BreakPolicyModel() {
        ch=new ConnectionHandler();

    }
    public boolean BreakpolicyInsertDetails(BreakPolicyVo bpv)
    {
        boolean result=false;

        String query="insert into break_policy (break_name ,active_after ,deduction_addition_time ,minimum_punch_time ,maximum_punch_time ) values('"+bpv.getBpolicyname()+"','"+bpv.getBactiveafter()+"','"+bpv.getBdeductiontime()+"','"+bpv.getBmintime()+"','"+bpv.getBmaxtime()+"')";

        result=ch.insertQuery(query);
        return result;
    }

   public ArrayList BreakpolicyTableData(){
       ArrayList data=new ArrayList();
        String query="SELECT break_policy_id,break_name ,active_after ,deduction_addition_time ,minimum_punch_time ,maximum_punch_time FROM break_policy ";

        System.out.println(query);
        data=ch.selectQuery(query);
        return data;
    }

    public ArrayList BreakpolicySelectdate(String id){
       ArrayList data=new ArrayList();
        String query="SELECT break_policy_id,break_name ,active_after ,deduction_addition_time ,minimum_punch_time ,maximum_punch_time FROM break_policy where break_policy_id="+id;

        System.out.println(query);
        data=ch.selectQuery(query);
        return data;
    }

    public boolean BreakpolicyupdateData(BreakPolicyVo bpv){
       String query="update break_policy set break_name='"+bpv.getBpolicyname()+"' ,active_after='"+bpv.getBactiveafter()+"' ,"
               + "deduction_addition_time='"+bpv.getBdeductiontime()+"' ,minimum_punch_time='"+bpv.getBmintime()+"' ,maximum_punch_time='"+bpv.getBmaxtime()+"' where break_policy_id='"+bpv.getId()+"'";

     // String query="update company_master set company_full_name='"+companyMasterVo.getCfullname()+"',company_short_name='"+companyMasterVo.getCshortname()+"'where company_id='"+companyMasterVo.getId()+"'";
       System.out.println(query);
      boolean data=ch.executeUpdate(query);

       return data;
   }

public boolean  BreakpolicyDelete(String id)
    {
        String query="delete from break_policy where break_policy_id="+id;
        System.out.println("DELETE....."+query);
       boolean result=ch.executeUpdate(query);
        return result;
    }

}
