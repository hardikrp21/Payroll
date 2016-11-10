/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

/**
 *
 * @author User
 */
public class Timedate {
    public java.sql.Date getCurrentDatetime() {
    java.util.Date today = new java.util.Date();
    return new java.sql.Date(today.getTime());
}

}
