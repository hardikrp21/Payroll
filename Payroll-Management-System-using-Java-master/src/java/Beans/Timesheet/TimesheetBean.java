/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans.Timesheet;

import java.net.InetAddress;
import java.util.Date;

/**
 *
 * @author User
 */
public class TimesheetBean {
    private int timesheet_id;
    private int employee_id;
    private int checkin;
    private int checkout;
    private Date timestamp;
    private Date rounded_time;
    private String ip_checkin;
    private String ip_checkout;
    private int attendence;

    public int getAttendence() {
        return attendence;
    }

    public void setAttendence(int attendence) {
        this.attendence = attendence;
    }

    public int getCheckin() {
        return checkin;
    }

    public void setCheckin(int checkin) {
        this.checkin = checkin;
    }

    public int getCheckout() {
        return checkout;
    }

    public void setCheckout(int checkout) {
        this.checkout = checkout;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getIp_checkin() {
        return ip_checkin;
    }

    public void setIp_checkin(String ip_checkin) {
        this.ip_checkin = ip_checkin;
    }

    public String getIp_checkout() {
        return ip_checkout;
    }

    public void setIp_checkout(String ip_checkout) {
        this.ip_checkout = ip_checkout;
    }

    public Date getRounded_time() {
        return rounded_time;
    }

    public void setRounded_time(Date rounded_time) {
        this.rounded_time = rounded_time;
    }

    public int getTimesheet_id() {
        return timesheet_id;
    }

    public void setTimesheet_id(int timesheet_id) {
        this.timesheet_id = timesheet_id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "TimesheetBean{" + "timesheet_id=" + timesheet_id + "employee_id=" + employee_id + "checkin=" + checkin + "checkout=" + checkout + "timestamp=" + timestamp + "rounded_time=" + rounded_time + "ip_checkin=" + ip_checkin + "ip_checkout=" + ip_checkout + '}';
    }



}
