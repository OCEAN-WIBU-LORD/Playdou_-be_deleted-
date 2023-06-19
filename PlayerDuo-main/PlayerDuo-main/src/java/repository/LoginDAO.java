/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import models.Account;

/**
 *
 * @author MSI GF63
 */
public class LoginDAO extends MyDAO{

    public Account login(String email, String password) {
        xSql = "select * from Student where Email = ? and Password = ?";
        Account x = null;
        try {
            ps = con.prepareStatement(xSql);          
            ps.setString(1,email);
            ps.setString(2,password);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                String xEmail = rs.getString("Email");
                String xPassword = rs.getString("Password");
                boolean xEnable = rs.getBoolean("Enable");
//                x = new Account(xEmail, xPassword, xEnable);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (x);
    }
      
}
