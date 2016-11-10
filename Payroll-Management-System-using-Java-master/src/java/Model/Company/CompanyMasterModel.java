/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Beans.CompanyMaster.CompanyMasterVo;
import DAO.ConnectionHandler;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CompanyMasterModel {
     ConnectionHandler ch;
    public CompanyMasterModel() {
        ch=new ConnectionHandler();
    }

    public boolean CompanyDetails(CompanyMasterVo companyMasterVo)
    {


        String query="insert into company_master(company_full_name,company_short_name,company_address,company_city,company_state,company_country,company_zip_code,company_phone_no,company_fax_no) "
                + "values('"+companyMasterVo.getCfullname()+"','"+companyMasterVo.getCshortname()+"','"+companyMasterVo.getCaddress()+"','"+companyMasterVo.getCcity()+"','"+companyMasterVo.getCstate()+"',"
                + "'"+companyMasterVo.getCcountry()+"','"+companyMasterVo.getCzipcode()+"','"+companyMasterVo.getCphoneno()+"','"+companyMasterVo.getCfaxno()+"')";
                System.out.println(query);
  boolean result=false;
        result=ch.insertQuery(query);

        return result;

    }
    public boolean company(){


        return true;
    }

 public ArrayList Companytabledata(){
       ArrayList data=new ArrayList();
        String query="SELECT company_id,company_full_name,company_short_name,company_address,company_city,company_state,company_country,company_zip_code,company_phone_no,company_fax_no FROM company_master";

        System.out.println(query);
        data=ch.selectQuery(query);
        return data;
    }
  public ArrayList CompanySelectdate(String id){
       ArrayList data=new ArrayList();
        String query="SELECT company_id,company_full_name,company_short_name,company_address,company_city,company_state,company_country,company_zip_code,company_phone_no,company_fax_no FROM company_master where company_id="+id;

        System.out.println(query);
        data=ch.selectQuery(query);
        return data;
    }

 public boolean CompanyMasterupdate(CompanyMasterVo companyMasterVo ){
       String query="update company_master set company_full_name='"+companyMasterVo.getCfullname()+"',"
               + "company_short_name='"+companyMasterVo.getCshortname()+"',company_address='"+companyMasterVo.getCaddress()+"',"
               + "company_city='"+companyMasterVo.getCcity()+"',company_state='"+companyMasterVo.getCstate()+"',company_country='"+companyMasterVo.getCcountry()+"',"
               + "company_zip_code='"+companyMasterVo.getCzipcode()+"',company_phone_no='"+companyMasterVo.getCphoneno()+"',"
               + "company_fax_no='"+companyMasterVo.getCfaxno()+"' where company_id='"+companyMasterVo.getId()+"'";

     // String query="update company_master set company_full_name='"+companyMasterVo.getCfullname()+"',company_short_name='"+companyMasterVo.getCshortname()+"'where company_id='"+companyMasterVo.getId()+"'";
       System.out.println(query);
      boolean data=ch.executeUpdate(query);

       return data;
   }

 public boolean  CompanyDelete(String id)
    {
        String query="delete from company_master where company_id="+id;
        System.out.println("DELETE....."+query);
       boolean result=ch.executeUpdate(query);
        return result;
    }


}
