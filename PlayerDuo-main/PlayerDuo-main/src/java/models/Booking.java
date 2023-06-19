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
public class Booking {
    private int id;
    private Account user;
    private Player player;
    private Timestamp createAt;
    private int totalHour;
    private float price;
    private String status;
    private Game game;
    private Timestamp timeStart;
    private Timestamp timeEnd;
    
}
