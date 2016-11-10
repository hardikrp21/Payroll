/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Beans.Policy.ExceptionPolicyVo;
import DAO.ConnectionHandler;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ExceptionPolicyModel {
ConnectionHandler ch;
    public ExceptionPolicyModel() {
        ch=new ConnectionHandler();
    }

    public boolean ExceptionpolicyInsertDetails(ExceptionPolicyVo epv)
    {
        boolean result=false;

        String query="insert into exception_policy (exception_name,exception_code ,severity ,grace_time ,watch_window ,active_status ) values('"+epv.getEname()+"','"+epv.getEcode()+"','"+epv.getEseverity()+"','"+epv.getEgrancetime()+"','"+epv.getEwindow()+"','"+epv.getEstatus()+"')";

        result=ch.insertQuery(query);
        System.out.println("Excption"+query);
        return result;
    }

   public ArrayList ExceptionpolicyTableData(){
       ArrayList data=new ArrayList();
        String query="SELECT exception_policy_id,exception_name,exception_code ,severity ,grace_time ,watch_window ,active_status  FROM exception_policy ";

        System.out.println(query);
        data=ch.selectQuery(query);
        return data;
    }

    public ArrayList ExceptionpolicySelectdate(String id){
       ArrayList data=new ArrayList();
        String query="SELECT exception_policy_id,exception_name,exception_code ,severity ,grace_time ,watch_window ,active_status  FROM exception_policy where exception_policy_id="+id;

        System.out.println(query);
        data=ch.selectQuery(query);
        return data;
    }

    public boolean ExceptionpolicyupdateData(ExceptionPolicyVo epv){
       String query="update exception_policy set exception_name='"+epv.getEname()+"' ,exception_code ='"+epv.getEcode()+"',severity='"+epv.getEseverity()+"' ,grace_time='"+epv.getEgrancetime()+"' ,"
               + "watch_window='"+epv.getEwindow()+"' ,active_status='"+epv.getEstatus()+"' where exception_policy_id='"+epv.getId()+"'";

     // String query="update company_master set company_full_name='"+companyMasterVo.getCfullname()+"',company_short_name='"+companyMasterVo.getCshortname()+"'where company_id='"+companyMasterVo.getId()+"'";
       System.out.println(query);
      boolean data=ch.executeUpdate(query);

       return data;
   }

public boolean  ExceptionpolicyDelete(String id)
    {
        String query="delete from exception_policy where exception_policy_id="+id;
        System.out.println("DELETE....."+query);
       boolean result=ch.executeUpdate(query);
        return result;
    }


}
