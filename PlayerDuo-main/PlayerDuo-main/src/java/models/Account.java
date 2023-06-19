/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.Timestamp;

/**
 *
 * @author MSI GF63
 */
public class Account {
    private int id;
    private String username;    
    private String fullName;
    private String password;
    private Timestamp createAt;
    private String email;
    private String phone;
    private boolean gender;
    private String avatar;
    private String balanceCoins;
    private boolean status;
    private Role role;

    public Account() {
    }

    
    public Account(int id, String username, String fullName, String password, Timestamp createAt, String email, String phone, boolean gender, String avatar, String balanceCoins, boolean status, Role role) {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
        this.password = password;
        this.createAt = createAt;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.avatar = avatar;
        this.balanceCoins = balanceCoins;
        this.status = status;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPassword() {
        return password;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isGender() {
        return gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getBalanceCoins() {
        return balanceCoins;
    }

    public boolean isStatus() {
        return status;
    }

    public Role getRole() {
        return role;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setBalanceCoins(String balanceCoins) {
        this.balanceCoins = balanceCoins;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setRole(Role role) {
        this.role = role;
    }

   
}
