/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Beans.Policy.BreakPolicyVo;
import Beans.Department.DepartmentVo;
import DAO.ConnectionHandler;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class DepartmentModel {
    ConnectionHandler ch;
    public DepartmentModel() {
        ch=new ConnectionHandler();
    }

    public boolean DepartmentInsertDetails(DepartmentVo dv)
    {
        boolean result=false;

        String query="insert into department (department_name) values('"+dv.getDname()+"')";

        result=ch.insertQuery(query);
        return result;
    }

   public ArrayList DepartmentTableData(){
       ArrayList data=new ArrayList();
        String query="SELECT department_id,department_name,department_status from department ";

        System.out.println(query);
        data=ch.selectQuery(query);
        return data;
    }

    public ArrayList DepartmentSelectdate(String id){
       ArrayList data=new ArrayList();
        String query="SELECT department_id,department_name,department_status from department where department_id="+id;

        System.out.println(query);
        data=ch.selectQuery(query);
        return data;
    }

    public boolean DepartmentupdateData(DepartmentVo dv){
       String query="update  department set department_name='"+dv.getDname()+"',department_status='"+dv.getDstatus()+"' where department_id='"+dv.getId()+"'";

    
       System.out.println(query);
      boolean data=ch.executeUpdate(query);

       return data;
   }

public boolean  DepartmentDelete(String id)
    {
        String query="delete from department where department_id="+id;
        System.out.println("DELETE....."+query);
       boolean result=ch.executeUpdate(query);
        return result;
    }

 public boolean updatastatus(DepartmentVo dv){
       String query="update department set department_status='"+dv.getDstatus()+"' where department_id='"+dv.getId()+"'";
       System.out.println(query);
      boolean data=ch.executeUpdate(query);

       return data;
   }

}
