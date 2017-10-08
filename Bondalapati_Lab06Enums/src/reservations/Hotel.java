/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 * 
 * Hotel enum to define Hotel constant and the price of the room based on type.
 * @author Harish Bondalapati
 */
public enum Hotel {

    /**
     * Single room
     */
    SINGLE(150),

    /**
     * Double room
     */
    DOUBLE(200),

    /**
     * King size room
     */
    KING(300),

    /**
     * Queen size room
     */
    QUEEN(250),

    /**
     * No room
     */
    NO(0);
    
    /**
     * Variable to store room cost for a hotel room based on the type.
     */
    private double roomCost;
    /**
     * Initializes a Hotel constant for the room type defined.
     * @param roomCost Cost of a room for a type of enum declared.
     */
    private Hotel(double roomCost){
        this.roomCost=roomCost;
    }

    /**
     * Getter method to return cost of a room for a hotel based on type defined.
     * @return Cost of a room for a type of enum declared.
     */
    public double getRoomCost(){
        return roomCost;
    }
}
