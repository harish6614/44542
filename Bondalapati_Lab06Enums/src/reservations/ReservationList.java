/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

import java.util.ArrayList;

/**
 * ReservationList class is used to add multiple reservations to a list and can 
 * return reservation list or a separate list of reservations with same source.
 * @author Harish Bondalapati
 */
public class ReservationList {
    private ArrayList<Reservation> reserveList;
    
    /**
     * Initializes a ReservationList object by initializing its reserveList
     * variable.
     */
    public ReservationList(){
        reserveList=new ArrayList<Reservation>();
    }

    /**
     * Getter method to return the array list of Reservation.
     * @return ArrayList of Reservations for an ReservationList.
     */
    public ArrayList<Reservation> getReserveList() {
        return reserveList;
    }

    /**
     * Adds a reservation to the array list of reservations.
     * @param reservation Reservation to be added
     */
    public void addReservation(Reservation reservation){
         reserveList.add(reservation);
    }

    /**
     * Adds a reservation to the array list of reservations at the index passed.
     * @param position Position in the list where new reservation needs to be 
     * added.
     * 
     * @param reservation Reservation to be added to the list.
     */
    public void addReservation(int position,Reservation reservation){
        if(position<=reserveList.size()){
            reserveList.add(position, reservation);
        }else
            addReservation(reservation);
    }
    
    /**
     * Returns a list with the source same the source passed from the list of reservations .
     * @param source Source of the reservation.
     * @return List of reservations with same source passed in the argument.
     */
    public ArrayList<Reservation> findAllSourceLocations(String source){
        ArrayList<Reservation> tempList=new ArrayList<Reservation>();
        for(Reservation r:reserveList){
            if(source.equals(r.getRoute().getSource())){
                tempList.add(r);
            }
        }
        return tempList;
    }
}
