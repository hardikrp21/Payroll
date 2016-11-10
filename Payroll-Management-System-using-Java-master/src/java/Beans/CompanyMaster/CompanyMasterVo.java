/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans.CompanyMaster;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CompanyMasterVo {
        String cfullname ;
 String cshortname;
String caddress ;
String ccity ;
String cstate ;
String ccountry ;
String czipcode;
String cphoneno ;
String cfaxno ;
String id;
    ArrayList list_arr=new ArrayList();

    public ArrayList getList_arr() {
        return list_arr;
    }

    public void setList_arr(ArrayList list_arr) {
        this.list_arr = list_arr;
    }


    


    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    public String getCcity() {
        return ccity;
    }

    public void setCcity(String ccity) {
        this.ccity = ccity;
    }

    public String getCcountry() {
        return ccountry;
    }

    public void setCcountry(String ccountry) {
        this.ccountry = ccountry;
    }

    public String getCfaxno() {
        return cfaxno;
    }

    public void setCfaxno(String cfaxno) {
        this.cfaxno = cfaxno;
    }

    public String getCfullname() {
        return cfullname;
    }

    public void setCfullname(String cfullname) {
        this.cfullname = cfullname;
    }

    public String getCphoneno() {
        return cphoneno;
    }

    public void setCphoneno(String cphoneno) {
        this.cphoneno = cphoneno;
    }

    public String getCshortname() {
        return cshortname;
    }

    public void setCshortname(String cshortname) {
        this.cshortname = cshortname;
    }

    public String getCstate() {
        return cstate;
    }

    public void setCstate(String cstate) {
        this.cstate = cstate;
    }

    public String getCzipcode() {
        return czipcode;
    }

    public void setCzipcode(String czipcode) {
        this.czipcode = czipcode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
