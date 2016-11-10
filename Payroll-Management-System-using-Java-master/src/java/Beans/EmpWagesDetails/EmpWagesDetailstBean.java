/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author JIGAR
 */
public class EmpWagesDetailstBean {
    private int ewagesid;
    private String type;
    private int employee_id;
    private String wages;
    private String effective_date;

    public int getEwagesid() {
        return ewagesid;
    }

    public void setEwagesid(int ewagesid) {
        this.ewagesid = ewagesid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getWages() {
        return wages;
    }

    public void setWages(String wages) {
        this.wages = wages;
    }

    public String getEffective_date() {
        return effective_date;
    }

    public void setEffective_date(String effective_date) {
        this.effective_date = effective_date;
    }

   

    @Override
    public String toString() {
        return "EmpWagesDeailtBean{" + "ewagesid=" + ewagesid + ", type=" + type + ", employee_id=" + employee_id + ", wages=" + wages + ", effective_date=" + effective_date + '}';
    }
    
    
    
}
