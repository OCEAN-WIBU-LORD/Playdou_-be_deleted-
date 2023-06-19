/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author MSI GF63
 */
public class Player {
    private int id;
    private Account user;
    private float numOfStar;
    private float price;
    private String description;
    private boolean status;

    public Player() {
    }

    public Player(int id, Account user, float numOfStar, float price, String description, boolean status) {
        this.id = id;
        this.user = user;
        this.numOfStar = numOfStar;
        this.price = price;
        this.description = description;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account getUser() {
        return user;
    }

    public void setUser(Account user) {
        this.user = user;
    }

    public float getNumOfStar() {
        return numOfStar;
    }

    public void setNumOfStar(float numOfStar) {
        this.numOfStar = numOfStar;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
