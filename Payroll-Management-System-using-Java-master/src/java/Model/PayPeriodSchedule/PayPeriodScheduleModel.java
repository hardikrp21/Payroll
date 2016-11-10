/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.PayPeriodSchedule;

import Beans.PayPeriodSchedule.PayPeriodScheduleBean;
import DAO.ConnectionHandler;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class PayPeriodScheduleModel {
    ConnectionHandler ch;

    public PayPeriodScheduleModel() {
        ch=new ConnectionHandler();

    }

    public boolean PayPeriodScheduleDetails(PayPeriodScheduleBean ppsb)
    {


        String query="insert into pay_period_schedule(pay_period_schedule_name,pay_period_type,transaction_date,pay_periods_from) "
                + "values('"+ppsb.getPay_period_schedule_name()+"','"+ppsb.getPay_period_type()+"','"+ppsb.getTransaction_date()+"','"+ppsb.getPay_periods_from()+"')";
                System.out.println(query);
  boolean result=false;
        result=ch.insertQuery(query);

        return result;

    }

 public ArrayList PayPeriodScheduletabledata(){
       ArrayList data=new ArrayList();
        String query="SELECT pay_period_schedule_id,pay_period_schedule_name,pay_period_type,transaction_date,pay_periods_from FROM pay_period_schedule";

        System.out.println(query);
        data=ch.selectQuery(query);
        return data;
    }
  public ArrayList PayPeriodScheduleSelectdate(String id){
       ArrayList data=new ArrayList();
        String query="SELECT pay_period_schedule_id,pay_period_schedule_name,pay_period_type,transaction_date,pay_periods_from FROM pay_period_schedule where pay_period_schedule_id="+id;

        System.out.println("selected data"+query);
        data=ch.selectQuery(query);
        return data;
    }

 public boolean PayPeriodScheduleupdate(PayPeriodScheduleBean ppsb ){
       String query="update pay_period_schedule set pay_period_schedule_name='"+ppsb.getPay_period_schedule_name()+"',pay_period_type='"+ppsb.getPay_period_type()+"',transaction_date='"+ppsb.getTransaction_date()+"',pay_periods_from='"+ppsb.getPay_periods_from()+"' where pay_period_schedule_id='"+ppsb.getId()+"'";

     // String query="update company_master set company_full_name='"+companyMasterVo.getCfullname()+"',company_short_name='"+companyMasterVo.getCshortname()+"'where company_id='"+companyMasterVo.getId()+"'";
       System.out.println(query);
      boolean data=ch.executeUpdate(query);

       return data;
   }

 public boolean  PayPeriodScheduleDelete(String id)
    {
        String query="delete from pay_period_schedule where pay_period_schedule_id="+id;
        System.out.println("DELETE....."+query);
       boolean result=ch.executeUpdate(query);
        return result;
    }


}
