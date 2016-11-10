/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans.Report;

/**
 *
 * @author User
 */
public class AttendenceBean {
    private int employees_id;
    private String sdate;
private String enddate;
private int id;

    public int getEmployees_id() {
        return employees_id;
    }

    public void setEmployees_id(int employees_id) {
        this.employees_id = employees_id;
    }

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

    

}
