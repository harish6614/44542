/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Route class to hold route details like source destinations and departure
 * and returning dates.
 * 
 * @author Harish Bondalapati
 */
public class Route {
    private String source;
    private String destination;
    private String departingDate;
    private String returningDate;
    
    /**
     * Initializes a Route object with source and destination locations 
     * and departure and returning dates.
     * 
     * @param source Source location of the route.
     * @param destination Destination location of the route.
     * @param departingDate Departure date for a travel route.
     * @param returningDate Returning date for a travel route.
     */
    public Route(String source,String destination,
            String departingDate,String returningDate){
        this.source=source;
        this.destination=destination;
        this.departingDate=departingDate;
        this.returningDate=returningDate;
    }

    /**
     * Getter method to return source of the route.
     * @return Source location of the route.
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets source location of the route.
     * @param source Source location of the route.
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Getter method to return destination of the route.
     * @return Destination location of the route.
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets destination location of the route.
     * @param destination Destination location of the route.
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Getter method to return departing date for a travel route.
     * @return Departing date of the travel.
     */
    public String getDepartingDate() {
        return departingDate;
    }

    /**
     * Sets departing date of a travel.
     * @param departingDate Departing date of a travel.
     */
    public void setDepartingDate(String departingDate) {
        this.departingDate = departingDate;
    }

    /**
     * Getter method to return returning date of a travel.
     * @return Returning date of a travel.
     */
    public String getReturningDate() {
        return returningDate;
    }

    /**
     * Sets returning date of a travel.
     * @param returningDate Returning date of a travel.
     */
    public void setReturningDate(String returningDate) {
        this.returningDate = returningDate;
    }
    
    /**
     * Returns DayOfWeek enum for the date passed for day of the week.
     * 
     * @param date Date in string format mm/dd/yyyy.
     * @return Returns DayOfWeek enum for the date passed.
     */
    public DayOfWeek getDay(String date){
        //Date format mm/dd/yyyy
        String[] splitDate=date.split("/");
        //Arguments in order year,month,dayofmonth
        LocalDate tempDate =LocalDate.of(Integer.parseInt(splitDate[2]), 
            Integer.parseInt(splitDate[0]), Integer.parseInt(splitDate[1]));
        return tempDate.getDayOfWeek();
    }
    
    /**
     * Method to determine weather either departing date or returning date is 
     * weekend in boolean. 
     * 
     * @return If departing or returning day is a weekend .
     */
    public boolean isWeekend(){
        return isWeekend(departingDate)||isWeekend(returningDate);
    }
    
    /**
     * Local method to determine weather either departing date or returning 
     * date is weekend in boolean. 
     * 
     * @return Returns true if departing or returning day is a weekend 
     * and false otherwise.
     */
    private boolean isWeekend(String date){
        switch(getDay(date).name()){
            case "FRIDAY" : 
            case "SATURDAY" : 
            case "SUNDAY" : 
                return true;
            default :
                return false;
        }
    }
    
    /**
     * Override method to return formatted Route object.
     * @return Formatted string for Route object.
     */
    @Override
    public String toString(){
        return "From : "+source+", To : "+destination+", Departing On : "
                +departingDate+", Returning On : "+returningDate;
    }

}
