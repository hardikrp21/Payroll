/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans.Policy;

/**
 *
 * @author User
 */
public class ExceptionPolicyVo {

   private String ename;
 private String ecode;
 private String eseverity;
 private String egrancetime;
 private String ewindow;
 private String estatus;
 private String id;

    public String getEcode() {
        return ecode;
    }

    public void setEcode(String ecode) {
        this.ecode = ecode;
    }

    public String getEgrancetime() {
        return egrancetime;
    }

    public void setEgrancetime(String egrancetime) {
        this.egrancetime = egrancetime;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEseverity() {
        return eseverity;
    }

    public void setEseverity(String eseverity) {
        this.eseverity = eseverity;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getEwindow() {
        return ewindow;
    }

    public void setEwindow(String ewindow) {
        this.ewindow = ewindow;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

 

}
