/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans.Policy;

/**
 *
 * @author User
 */
public class MealPolicyVo {

   private String mpolicyname;
 private String  mactiveafter;
 private String mmealtime;
 private String mmintime;
 private String mmaxtime;
 private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMactiveafter() {
        return mactiveafter;
    }

    public void setMactiveafter(String mactiveafter) {
        this.mactiveafter = mactiveafter;
    }

    

 

    

    public String getMmaxtime() {
        return mmaxtime;
    }

    public void setMmaxtime(String mmaxtime) {
        this.mmaxtime = mmaxtime;
    }

    public String getMmealtime() {
        return mmealtime;
    }

    public void setMmealtime(String mmealtime) {
        this.mmealtime = mmealtime;
    }

    public String getMmintime() {
        return mmintime;
    }

    public void setMmintime(String mmintime) {
        this.mmintime = mmintime;
    }

    public String getMpolicyname() {
        return mpolicyname;
    }

    public void setMpolicyname(String mpolicyname) {
        this.mpolicyname = mpolicyname;
    }

    
 


}
