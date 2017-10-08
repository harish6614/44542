/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * ReservationDriver class to invoke and test various methods of classes and
 * enums declared in reservations package.
 * 
 * @author Harish Bondalapati
 */
public class ReservationDriver {

    /**
     * ReservationDriver class to test and invoke classes of 
     * reservation package.
     * 
     * @param args Arguments to be passed for main method
     * @throws FileNotFoundException Throws an exception if input file 
     * containing all required details is not present in the location specified.
     */
    public static void main(String[] args) throws FileNotFoundException {

        
        //Declare and initialize a scanner object to read from the 
        //file "inputFile.txt"
        Scanner sc=new Scanner(new File("inputFile.txt"));
        
        //create an object for ReservationList named as "reservationList"
        ReservationList reservationList=new ReservationList();
        
        //While inputFile.txt has more data(While loop starts here) {
        //Read in the data
        while(sc.hasNext()){
        //create an object for Route named as "route" and 
        //initialize the multiple argument constructor with the values from 
        //file.
        Route route=new Route(sc.next(),sc.next(),sc.next(),sc.next());
        
        /*create an object for Reservation named as "reservation" 
         and initialize the multiple argument constructor with the values from 
         file.
         Hint: use valueOf() method while passing the String where enum is 
         required.
         For example, to pass DELTA from input file to Reservation constructor, 
         use Airline.valueOf("DELTA").*/
        Reservation reservation=new Reservation(route
                ,Airline.valueOf(sc.next()),sc.next()
                ,Hotel.valueOf(sc.next()),Meal.valueOf(sc.next()));
        sc.nextLine();
        // Invoke addReservation method on reservationList object 
        //and add reservation.
        reservationList.addReservation(reservation);
         }// }While Loop ends here
        
        System.out.println("************************************************"
                + "******************************************\n" 
                + "Reservation List\n" 
                + "**********************************************************"
                + "********************************");
        /*Use an enhanced for loop and iterate through getReserveList() method  
         on reservationList object and print the reservations.
        */
        for(Reservation r:reservationList.getReserveList()){
            System.out.println(r);
        }
        System.out.println();
        
        System.out.println("*************************************************"
                + "***************************************\n" 
                + "Reservations that have source location \"DAL\"\n" 
                + "**********************************************************"
                + "********************************");
        /*Use an enhanced for loop and iterate through findAllSourceLocations() 
         method on reservationList object pass "DAL" as parameter and print 
         the reservations.
        */
        for(Reservation r:reservationList.findAllSourceLocations("DAL")){
            System.out.println(r);
        }
        System.out.println();
        
        System.out.println("************************************************"
                + "******************************************\n" 
                + "Reservations that have source location \"MCI\"\n" 
                + "*********************************************************"
                + "***********************************");
        /*Use an enhanced for loop and iterate through findAllSourceLocations() 
         method on reservationList object pass "MCI" as parameter and print the 
         reservations.
        */
        for(Reservation r:reservationList.findAllSourceLocations("MCI")){
            System.out.println(r);
        }
    }

}
