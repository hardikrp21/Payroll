/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author JIGAR
 */
public class LeaveBeans {
    
    private int leave_id;
    private int employee_id;
    private int absence_policy_id;
    private String absent_days;

    public int getLeave_id() {
        return leave_id;
    }

    public void setLeave_id(int leave_id) {
        this.leave_id = leave_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getAbsence_policy_id() {
        return absence_policy_id;
    }

    public void setAbsence_policy_id(int absence_policy_id) {
        this.absence_policy_id = absence_policy_id;
    }

    public String getAbsent_days() {
        return absent_days;
    }

    public void setAbsent_days(String absent_days) {
        this.absent_days = absent_days;
    }

   

    @Override
    public String toString() {
        return "LeaveBeans{" + "leave_id=" + leave_id + ", employee_id=" + employee_id + ", absence_policy_id=" + absence_policy_id + ", absent_days=" + absent_days + '}';
    }
    
    
}
