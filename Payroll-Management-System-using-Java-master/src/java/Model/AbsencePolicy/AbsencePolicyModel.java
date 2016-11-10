/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.AbsencePolicy;

import Beans.AbsencePolicy.AbsencePolicyBean;
import DAO.ConnectionHandler;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class AbsencePolicyModel {
    ConnectionHandler ch;

    public AbsencePolicyModel() {
        ch=new ConnectionHandler();
    }

    public String getpaystubaccountData()
    {
      List  policy_data=new ArrayList();
        String paystubaccountName="";
        try
        {
        String query="select pay_stub_account_id,pay_stub_name from pay_stub_account";
        policy_data=ch.selectQuery(query);
            System.out.println(query);
         paystubaccountName="<select name='paystubaccountData'>";
        for(int i=0;i< policy_data.size();i++)
        {
            List inner=(List) policy_data.get(i);
            if(inner.get(0).toString().equals("1"))
                paystubaccountName+="<option value='"+inner.get(0)+"' selected>"+inner.get(1)+"</option>";
            else
                paystubaccountName+="<option value='"+inner.get(0)+"'>"+inner.get(1)+"</option>";
        }
        paystubaccountName+="</select>";
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return paystubaccountName;
    }

    public boolean InsertPayStubAccount(AbsencePolicyBean bean)
    {


        String query="insert into  absence_policy (absence_policy_name,absence_policy_type,total_amount,pay_stub_account_id) values('"+bean.getAbsencePolicyName()+"','"+bean.getAbsencePolicyType()+"','"+bean.getTotalAmount()+"','"+bean.getPay_stub_account_id()+"')";
                System.out.println(query);
  boolean result=false;
        result=ch.insertQuery(query);
        System.out.println("Result"+result);
        return result;

    }

    public ArrayList AbsencePolicyTableData(){
       ArrayList data=new ArrayList();
        String query="SELECT absence_policy.absence_policy_id,absence_policy.absence_policy_name,absence_policy.absence_policy_type,absence_policy.total_amount,pay_stub_account.pay_stub_name FROM absence_policy INNER JOIN pay_stub_account ON absence_policy.pay_stub_account_id=pay_stub_account.pay_stub_account_id ";

        System.out.println(query);
        data=ch.selectQuery(query);
        return data;
    }



}
