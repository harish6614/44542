/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 * Meal enum to define meal constant and the price of the meal type.
 * @author Harish Bondalapati
 */
public enum Meal {

    /**
     * Vegetarian meal
     */
    VEG(10),

    /**
     * Non-Vegetarian meal
     */
    NON_VEG(11),

    /**
     * Hindu Meal
     */
    HINDU_MEAL(13),

    /**
     * No meal
     */
    NO(0);
    
    /**
     * Variable to store price of a meal type.
     */
    private double mealPrice;
    
    /**
     * Initializes a meal constant enum with the meal price defined.
     * @param mealPrice 
     */
    private Meal(double mealPrice){
        this.mealPrice=mealPrice;
    }

    /**
     * Returns price of the meal enum declared.
     * @return Price of the meal.
     */
    public double getMealPrice() {
        return mealPrice;
    }
    
}
