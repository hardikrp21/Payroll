/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans.Policy;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BreakPolicyVo {

   private String bpolicyname;
 private String bactiveafter;
 private String bdeductiontime;
 private String bmintime;
 private String bmaxtime;
 private String id;
    ArrayList arr_list=new ArrayList();

    public ArrayList getArr_list() {
        return arr_list;
    }

    public void setArr_list(ArrayList arr_list) {
        this.arr_list = arr_list;
    }
    

    public String getBactiveafter() {
        return bactiveafter;
    }

    public void setBactiveafter(String bactiveafter) {
        this.bactiveafter = bactiveafter;
    }

    public String getBdeductiontime() {
        return bdeductiontime;
    }

    public void setBdeductiontime(String bdeductiontime) {
        this.bdeductiontime = bdeductiontime;
    }

    public String getBmaxtime() {
        return bmaxtime;
    }

    public void setBmaxtime(String bmaxtime) {
        this.bmaxtime = bmaxtime;
    }

    public String getBmintime() {
        return bmintime;
    }

    public void setBmintime(String bmintime) {
        this.bmintime = bmintime;
    }

    public String getBpolicyname() {
        return bpolicyname;
    }

    public void setBpolicyname(String bpolicyname) {
        this.bpolicyname = bpolicyname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

 

}
