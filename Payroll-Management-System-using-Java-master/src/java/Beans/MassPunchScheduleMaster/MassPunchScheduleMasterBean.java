/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans.MassPunchScheduleMaster;

import java.util.Date;

/**
 *
 * @author User
 */
public class MassPunchScheduleMasterBean {
    private String  MassPunchSchedulename;
    private String mass_punch_schedule_status;
    private String mass_punch_schedule_in_time;
    private String mass_punch_schedule_out_time;
    private String mass_punch_schedule_total_time;
    private String mass_punch_schedule_start_date;
    private String mass_punch_schedule_end_date;
    private int sun;
    private int mon;
    private int tue;
    private int wed;
    private int thu;
    private int fri;
    private int sat;
    private int schedule_policy_id;
    private int department_id;

    public String getMassPunchSchedulename() {
        return MassPunchSchedulename;
    }

    public void setMassPunchSchedulename(String MassPunchSchedulename) {
        this.MassPunchSchedulename = MassPunchSchedulename;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public int getFri() {
        return fri;
    }

    public void setFri(int fri) {
        this.fri = fri;
    }

   

    public String getMass_punch_schedule_in_time() {
        return mass_punch_schedule_in_time;
    }

    public void setMass_punch_schedule_in_time(String mass_punch_schedule_in_time) {
        this.mass_punch_schedule_in_time = mass_punch_schedule_in_time;
    }

    public String getMass_punch_schedule_out_time() {
        return mass_punch_schedule_out_time;
    }

    public void setMass_punch_schedule_out_time(String mass_punch_schedule_out_time) {
        this.mass_punch_schedule_out_time = mass_punch_schedule_out_time;
    }

    public String getMass_punch_schedule_end_date() {
        return mass_punch_schedule_end_date;
    }

    public void setMass_punch_schedule_end_date(String mass_punch_schedule_end_date) {
        this.mass_punch_schedule_end_date = mass_punch_schedule_end_date;
    }

    public String getMass_punch_schedule_start_date() {
        return mass_punch_schedule_start_date;
    }

    public void setMass_punch_schedule_start_date(String mass_punch_schedule_start_date) {
        this.mass_punch_schedule_start_date = mass_punch_schedule_start_date;
    }

   

    public String getMass_punch_schedule_status() {
        return mass_punch_schedule_status;
    }

    public void setMass_punch_schedule_status(String mass_punch_schedule_status) {
        this.mass_punch_schedule_status = mass_punch_schedule_status;
    }

    public String getMass_punch_schedule_total_time() {
        return mass_punch_schedule_total_time;
    }

    public void setMass_punch_schedule_total_time(String mass_punch_schedule_total_time) {
        this.mass_punch_schedule_total_time = mass_punch_schedule_total_time;
    }

    public int getMon() {
        return mon;
    }

    public void setMon(int mon) {
        this.mon = mon;
    }

    public int getSat() {
        return sat;
    }

    public void setSat(int sat) {
        this.sat = sat;
    }

    public int getSchedule_policy_id() {
        return schedule_policy_id;
    }

    public void setSchedule_policy_id(int schedule_policy_id) {
        this.schedule_policy_id = schedule_policy_id;
    }

    public int getSun() {
        return sun;
    }

    public void setSun(int sun) {
        this.sun = sun;
    }

    public int getThu() {
        return thu;
    }

    public void setThu(int thu) {
        this.thu = thu;
    }

    public int getTue() {
        return tue;
    }

    public void setTue(int tue) {
        this.tue = tue;
    }

    public int getWed() {
        return wed;
    }

    public void setWed(int wed) {
        this.wed = wed;
    }

    @Override
    public String toString() {
        return "MassPunchScheduleMasterBean{" + "MassPunchSchedulename=" + MassPunchSchedulename + "mass_punch_schedule_status=" + mass_punch_schedule_status + "mass_punch_schedule_in_time=" + mass_punch_schedule_in_time + "mass_punch_schedule_out_time=" + mass_punch_schedule_out_time + "mass_punch_schedule_total_time=" + mass_punch_schedule_total_time + "mass_punch_schedule_start_date=" + mass_punch_schedule_start_date + "mass_punch_schedule_end_date=" + mass_punch_schedule_end_date + "sun=" + sun + "mon=" + mon + "tue=" + tue + "wed=" + wed + "thu=" + thu + "fri=" + fri + "sat=" + sat + "schedule_policy_id=" + schedule_policy_id + "department_id=" + department_id + '}';
    }

    


}
