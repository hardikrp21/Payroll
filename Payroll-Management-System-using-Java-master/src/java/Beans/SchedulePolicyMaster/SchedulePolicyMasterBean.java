/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans.SchedulePolicyMaster;

/**
 *
 * @author User
 */
public class SchedulePolicyMasterBean {

int schedule_policy_id;
String Schedulepolicyname;
int mealpolicy_id;
int break_policy_id;
int absence_policy_id;

    public int getBreak_policy_id() {
        return break_policy_id;
    }

    public void setBreak_policy_id(int break_policy_id) {
        this.break_policy_id = break_policy_id;
    }


    public String getSchedulepolicyname() {
        return Schedulepolicyname;
    }

    public void setSchedulepolicyname(String Schedulepolicyname) {
        this.Schedulepolicyname = Schedulepolicyname;
    }

    public int getMealpolicy_id() {
        return mealpolicy_id;
    }

    public void setMealpolicy_id(int mealpolicy_id) {
        this.mealpolicy_id = mealpolicy_id;
    }

    public int getSchedule_policy_id() {
        return schedule_policy_id;
    }

    public void setSchedule_policy_id(int schedule_policy_id) {
        this.schedule_policy_id = schedule_policy_id;
    }

    public int getAbsence_policy_id() {
        return absence_policy_id;
    }

    public void setAbsence_policy_id(int absence_policy_id) {
        this.absence_policy_id = absence_policy_id;
    }
    



}
