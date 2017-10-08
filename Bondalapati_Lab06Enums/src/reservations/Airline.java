/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 * Airlines enum to define airline constant to store its price for Economy class
 * and Business class along with the discount percent.
 * 
 * @author Harish Bondalapati
 */
public enum Airline {

    /**
     * Airlines:DELTA
     */
    DELTA(750, 1500, 10) ,

    /**
     * Airlines:US AIRWAYS 
     */
    US_AIRWAYS(570, 1400, 11) ,

    /**
     * Airlines:UNITED
     */
    UNITED(700, 1450, 9) ,

    /**
     * Airlines:CATHAY PACIFIC
     */
    CATHAY_PACIFIC(710, 1480, 8) ,

    /**
     * Airlines:AIR CANADA
     */
    AIR_CANADA(640, 1590, 10) ,

    /**
     * Airlines:AMERICAN AIRLINES
     */
    AMERICAN_AIRLINES(560, 1200, 6) ,

    /**
     * Airlines:AIR FRANCE
     */
    AIR_FRANCE(450, 1100, 5) ,

    /**
     * Airlines:AIR INDIA
     */
    AIR_INDIA(590, 1080, 9) ,

    /**
     * Airlines:JETBLUE
     */
    JETBLUE(430, 890, 5) ,

    /**
     * Airlines:QANTAS
     */
    QANTAS(670, 1200, 9) ;
    
    /**
     * Variable to store price of economy class for a constant.
     */
    private double economyPrice;
    /**
     * Variable to store price of business class for a constant.
     */
    private double businessPrice;
    /**
     * Variable to store discount percent for a constant.
     */
    private double discount;
   /**
    * Initializes an airline constant with the values of price for economy class
    * and business class along with the discount defined in this enum.
    * @param economyPrice Economy class price of an airline.
    * @param businessPrice Business class price of an airline.
    * @param discount Discount percent for an airline.
    */
    private Airline(double economyPrice,double businessPrice,double discount){
        this.economyPrice=economyPrice;
        this.businessPrice=businessPrice;
        this.discount=discount;
    }

    /**
     * Getter method to return economy cabin price for an airline.
     * @return Economy class price for an airline.
     */
    public double getEconomyPrice() {
        return economyPrice;
    }

    /**
     * Getter method to return business cabin price for an airline.
     * @return Business class price for an airline.
     */
    public double getBusinessPrice() {
        return businessPrice;
    }

    /**
     * Getter method to return discount percent for an airline.
     * @return Discount in percentage for an airline.
     */
    public double getDiscount() {
        return discount;
    }
    
}
