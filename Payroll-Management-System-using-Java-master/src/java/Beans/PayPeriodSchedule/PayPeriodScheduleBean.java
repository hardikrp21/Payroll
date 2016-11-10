/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans.PayPeriodSchedule;

/**
 *
 * @author User
 */
public class PayPeriodScheduleBean {

private String pay_period_schedule_name;
private String pay_period_type;
private String transaction_date;
private String pay_periods_from;
private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPay_period_schedule_name() {
        return pay_period_schedule_name;
    }

    public void setPay_period_schedule_name(String pay_period_schedule_name) {
        this.pay_period_schedule_name = pay_period_schedule_name;
    }

    public String getPay_period_type() {
        return pay_period_type;
    }

    public void setPay_period_type(String pay_period_type) {
        this.pay_period_type = pay_period_type;
    }

    public String getPay_periods_from() {
        return pay_periods_from;
    }

    public void setPay_periods_from(String pay_periods_from) {
        this.pay_periods_from = pay_periods_from;
    }

    public String getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(String transaction_date) {
        this.transaction_date = transaction_date;
    }






}
