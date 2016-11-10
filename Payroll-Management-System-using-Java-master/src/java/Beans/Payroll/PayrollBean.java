/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans.Payroll;

/**
 *
 * @author User
 */
public class PayrollBean {
private String sdate;
private String enddate;
private int id;
private int employees_id;
private String trasaction_date;
private double total_hours;
private double salary;


    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public int getEmployees_id() {
        return employees_id;
    }

    public void setEmployees_id(int employees_id) {
        this.employees_id = employees_id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTotal_hours() {
        return total_hours;
    }

    public void setTotal_hours(double total_hours) {
        this.total_hours = total_hours;
    }

    public String getTrasaction_date() {
        return trasaction_date;
    }

    public void setTrasaction_date(String trasaction_date) {
        this.trasaction_date = trasaction_date;
    }
    


}
