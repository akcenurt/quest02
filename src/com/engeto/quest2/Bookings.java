package com.engeto.quest2;

import java.util.ArrayList;

public class Bookings {
 //   Chceme také mít k dispozici třídu, která bude uchovávat všechny rezervace
//        (například list of bookings), které jsme v systému vytvořili a bude mít metodu, která vypíše informace o všech rezervacích.

    ArrayList<Booking>listOfBookings = new ArrayList<>();

    public void addBooking(Booking newBooking){
        listOfBookings.add(newBooking);
    }

    public void removeBooking(Booking newBooking){
        listOfBookings.remove(newBooking);
    }

    public void getBookingInfo(){
        for (Booking booking : listOfBookings){
            System.out.println(booking.getDescription());
        }
    }



}
