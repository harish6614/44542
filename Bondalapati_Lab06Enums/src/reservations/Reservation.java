/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 * Reservation class holds all the required details like route,airline,
 * cabin type,hotel type,meal type. There are few methods declared to calculate
 * different fares.
 * 
 * @author Harish Bondalapati
 */
public class Reservation {
    private Route route;
    private Airline airline;
    private String cabin;
    private Hotel hotel;
    private Meal meal;
    
    /**
     * Initializes a reservation with the route ,airline ,cabin type ,hotel
     * and meal type passed as arguments.
     * 
     * @param route Route of a reservation
     * @param airline Airline of a reservation
     * @param cabin Cabin type for an airline
     * @param hotel Hotel type for a reservation
     * @param meal Meal type for a reservation
     */
    public Reservation(Route route, Airline airline,String cabin,
            Hotel hotel,Meal meal){
        this.route=route;
        this.airline=airline;
        this.cabin=cabin;
        this.hotel=hotel;
        this.meal=meal;
    }

    /**
     * Getter method to return route of a reservation.
     * @return Route object of a reservation.
     */
    public Route getRoute() {
        return route;
    }
    
    /**
     * Calculates and returns fare for an airline reservation based on 
     * cabin type and discount. Discount is applicable only if both departing 
     * and returning days are in weekdays.
     * @return Final fare calculated based on discount if applicable.
     * Fare(No discount) = Price
     * Fare(Discount) = Price - Discount Amount
     */
    public double calcAirlinefare(){
        switch(cabin.toUpperCase()){
            case "ECONOMY" :
                return calculateFare(airline.getEconomyPrice(),
                        route.isWeekend());
            case "BUSINESS" :
                return calculateFare(airline.getBusinessPrice(),
                        route.isWeekend());
            default : 
                return 0.0;
        }
    }
    
    /**
     * Calculates and returns fare for an airline.
     * 
     * @param price Price for an airline based on cabin type.
     * @param hasNoDiscount Has discount or not
     * @return Final fare calculated based on discount if applicable.
     */
    private double calculateFare(double price,boolean hasNoDiscount){
        if(hasNoDiscount){
            return price;
        }else 
            return price*(100-airline.getDiscount())/100;
    }
    
    /**
     * Calculates and returns room price for a reservation.
     * @return Hotel cost for a reservation.
     */
    public double calcRoomCost(){
        return hotel.getRoomCost();
    }
    
    /**
     * Calculates and returns meal price for a reservation.
     * @return Meal price for a reservation.
     */
    public double calcMealPrice(){
        return meal.getMealPrice();
    }
    
    /**
     * Calculates and returns total fare for a reservation.
     * i.e Total Fare = Airline fare + Hotel cost + Meal price
     * @return Total fare for a reservation
     */
    public double calcTotalFare(){
        return calcAirlinefare()+calcRoomCost()+calcMealPrice();
    }
    
    /**
     * Override method to return formatted Reservation object.
     * @return Formatted string for Reservation object.
     */
    @Override
    public String toString(){
        return route.toString()
                +", Airline : "+airline.name()+", Cabin : "+cabin.toUpperCase()
                +", Hotel : "+hotel.name()+", Meal : "+meal.name()
                +", Total fare : $"+calcTotalFare();
    }
}
