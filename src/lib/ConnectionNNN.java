/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lib;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author intex
 */
public class ConnectionNNN {
    
    public static Connection db()
    {
        try {
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/library?zeroDateTimeBehavior=convertToNull");
               // JOptionPane.showMessageDialog(null, "Establiushed");
                return c;
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionNNN.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionNNN.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
        
    }
}
