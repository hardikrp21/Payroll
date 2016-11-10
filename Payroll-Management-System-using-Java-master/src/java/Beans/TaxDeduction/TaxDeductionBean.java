/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans.TaxDeduction;

/**
 *
 * @author User
 */
public class TaxDeductionBean {
    private int id;
    private int pay_stub_account_id;
    private String tax_deduction_status;
    private String tax_deduction_type;
    private String calculation_type;
    private float tax_deduction_percentage;
    private double  tax_deduction_amount;
    private String tax_deduction_start_date;
    private String tax_deduction_end_date;

    public String getCalculation_type() {
        return calculation_type;
    }

    public void setCalculation_type(String calculation_type) {
        this.calculation_type = calculation_type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPay_stub_account_id() {
        return pay_stub_account_id;
    }

    public void setPay_stub_account_id(int pay_stub_account_id) {
        this.pay_stub_account_id = pay_stub_account_id;
    }

    public double getTax_deduction_amount() {
        return tax_deduction_amount;
    }

    public void setTax_deduction_amount(double tax_deduction_amount) {
        this.tax_deduction_amount = tax_deduction_amount;
    }

    

    public void setTax_deduction_amount(float tax_deduction_amount) {
        this.tax_deduction_amount = tax_deduction_amount;
    }

    public String getTax_deduction_end_date() {
        return tax_deduction_end_date;
    }

    public void setTax_deduction_end_date(String tax_deduction_end_date) {
        this.tax_deduction_end_date = tax_deduction_end_date;
    }

    public float getTax_deduction_percentage() {
        return tax_deduction_percentage;
    }

    public void setTax_deduction_percentage(float tax_deduction_percentage) {
        this.tax_deduction_percentage = tax_deduction_percentage;
    }

    public String getTax_deduction_start_date() {
        return tax_deduction_start_date;
    }

    public void setTax_deduction_start_date(String tax_deduction_start_date) {
        this.tax_deduction_start_date = tax_deduction_start_date;
    }

    public String getTax_deduction_status() {
        return tax_deduction_status;
    }

    public void setTax_deduction_status(String tax_deduction_status) {
        this.tax_deduction_status = tax_deduction_status;
    }

    public String getTax_deduction_type() {
        return tax_deduction_type;
    }

    public void setTax_deduction_type(String tax_deduction_type) {
        this.tax_deduction_type = tax_deduction_type;
    }

    @Override
    public String toString() {
        return "TaxDeductionBean{" + "id=" + id + "pay_stub_account_id=" + pay_stub_account_id + "tax_deduction_status=" + tax_deduction_status + "tax_deduction_type=" + tax_deduction_type + "calculation_type=" + calculation_type + "tax_deduction_percentage=" + tax_deduction_percentage + "tax_deduction_amount=" + tax_deduction_amount + "tax_deduction_start_date=" + tax_deduction_start_date + "tax_deduction_end_date=" + tax_deduction_end_date + '}';
    }

    

}
