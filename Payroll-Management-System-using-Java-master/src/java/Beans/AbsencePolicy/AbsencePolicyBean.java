/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans.AbsencePolicy;

/**
 *
 * @author User
 */
public class AbsencePolicyBean {

    private String AbsencePolicyName;
    private String AbsencePolicyType;
    private double TotalAmount;
    private int pay_stub_account_id;

    public String getAbsencePolicyName() {
        return AbsencePolicyName;
    }

    public void setAbsencePolicyName(String AbsencePolicyName) {
        this.AbsencePolicyName = AbsencePolicyName;
    }

    public String getAbsencePolicyType() {
        return AbsencePolicyType;
    }

    public void setAbsencePolicyType(String AbsencePolicyType) {
        this.AbsencePolicyType = AbsencePolicyType;
    }

    public double getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(double TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    public int getPay_stub_account_id() {
        return pay_stub_account_id;
    }

    public void setPay_stub_account_id(int pay_stub_account_id) {
        this.pay_stub_account_id = pay_stub_account_id;
    }
}
