package com.engeto.quest2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Booking {
 //   V rámci jedné rezervace (booking) vždy přiřazujeme pokoj jednomu nebo více hostům na časové období
//        mezi dvěma daty (například pokoj číslo 3 na období od 15. 7. do 24. 7. 2021). Pobyt je buď pracovní, nebo rekreační.
    Guest mainGuest;
    ArrayList<Guest>otherGuests = new ArrayList<>();
    Room room;
    LocalDate start;
    LocalDate end;
    TypeOfStay typeOfStay;

    public Booking(Guest mainGuest, Room room, LocalDate start, LocalDate end, TypeOfStay typeOfStay) {
        this.mainGuest = mainGuest;
        this.room = room;
        this.start = start;
        this.end = end;
        this.typeOfStay = typeOfStay;
    }

    public Booking(Guest mainGuest, Room room, TypeOfStay typeOfStay) {
        this(mainGuest, room, LocalDate.now(), LocalDate.now().plusDays(6), typeOfStay);
    }

    public Guest getMainGuest() {
        return mainGuest;
    }

    public void setMainGuest(Guest mainGuest) {
        this.mainGuest = mainGuest;
    }

    public ArrayList<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(ArrayList<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public TypeOfStay getTypeOfStay() {
        return typeOfStay;
    }

    public void setTypeOfStay(TypeOfStay typeOfStay) {
        this.typeOfStay = typeOfStay;
    }

    public void addGuest(Guest newGuest) {
        otherGuests.add(newGuest);
    }

    public void printOtherGuests() {
        for (Guest guest : otherGuests) {
            System.out.println("Další hosté na pokoji č."+room.getRoomNumber()+": " +guest.getName().toString()+" "+guest.getSurname().toString());
        }
    }

    public String getDescription(){
        return "Pokoj registrován na hosta: "+mainGuest.getName()+" "+mainGuest.getSurname()+" od "+start.toString()+" do: "+end.toString()+", typ pobytu: "+typeOfStay.toString()
                +" další hosté: ";
    }

}
