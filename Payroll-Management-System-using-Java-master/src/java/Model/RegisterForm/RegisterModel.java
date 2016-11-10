/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;



import Beans.Policy.BreakPolicyVo;
import Beans.CompanyMaster.CompanyMasterVo;
import Beans.UserMaster.UserMasterVo;
import Beans.EmployeeMaster.EmployeeBean;
import Beans.Policy.ExceptionPolicyVo;
import Beans.Policy.MealPolicyVo;
import DAO.ConnectionHandler;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class RegisterModel {

    ConnectionHandler ch;
    public RegisterModel() {
        ch=new ConnectionHandler();
    }



    

    public boolean InsertDetails(UserMasterVo userMasterVo)
    {
        boolean result=false;
       
        String query="insert into user_master(username, emailid, password, mobileno, address, city,state,country, pincode) values('"+userMasterVo.getUsername()+"',"
                + "'"+userMasterVo.getEmailid()+"','"+userMasterVo.getPassword()+"',"
                + "'"+userMasterVo.getMobileno()+"','"+userMasterVo.getAddress()+"','"+userMasterVo.getCity()+"','"+userMasterVo.getState()+"','"+userMasterVo.getCountry()+"','"+userMasterVo.getPincode()+"')";
        result=ch.insertQuery(query);
        return result;
    }

    public ArrayList tabledata(){
       ArrayList data=new ArrayList();
        String query="SELECT usermaster_id,username,emailid,password,mobileno,city,state,country,status FROM user_master WHERE username!='admin' ";

        System.out.println(query);
        data=ch.selectQuery(query);
        return data;
    }

   public boolean updatastatus(UserMasterVo userMasterVo){
       String query="update user_master set status='"+userMasterVo.getStatus()+"' where usermaster_id='"+userMasterVo.getId()+"'";
       System.out.println(query);
      boolean data=ch.executeUpdate(query);

       return data;
   }

//    public ArrayList getDataStatus(String id)
//    {
//        ArrayList data=new ArrayList();
//        String query="select usermaster_id,status from user_master where usermaster_id="+id;
//        System.out.println("getData1"+query);
//        data=ch.selectQuery(query);
//        System.out.println("ARR::"+data);
//
//        return data;
//    }



  









}
