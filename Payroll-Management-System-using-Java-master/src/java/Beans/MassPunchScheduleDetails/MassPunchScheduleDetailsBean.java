/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans.MassPunchScheduleDetails;

/**
 *
 * @author User
 */
public class MassPunchScheduleDetailsBean {
   private int  mass_punch_schedule_id;
    private int employees_id;
    private int id;

    public int getEmployees_id() {
        return employees_id;
    }

    public void setEmployees_id(int employees_id) {
        this.employees_id = employees_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMass_punch_schedule_id() {
        return mass_punch_schedule_id;
    }

    public void setMass_punch_schedule_id(int mass_punch_schedule_id) {
        this.mass_punch_schedule_id = mass_punch_schedule_id;
    }

    @Override
    public String toString() {
        return "MassPunchScheduleDetailsBean{" + "mass_punch_schedule_id=" + mass_punch_schedule_id + "employees_id=" + employees_id + "id=" + id + '}';
    }

    

}
