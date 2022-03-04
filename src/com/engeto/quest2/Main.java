package com.engeto.quest2;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Potřebujeme evidovat hosty (guest), které ubytováváme v hotelu.
//                O každém hostu musíme uložit jméno, příjmení a datum narození.
//                Hosty vždy ubytováváme na pokojích (room). Pokoj je identifikován svým číslem.
//        O každém pokoji chceme evidovat, kolik lůžek tam je (neřeš přistýlky apod.), zda má pokoj balkón a
//        zda má výhled na moře a jaká je cena pokoje za jednu noc (předpokládej, že je cena pevně daná bez ohledu na sezónu a počet ubytovaných).
//
//                V rámci jedné rezervace (booking) vždy přiřazujeme pokoj jednomu nebo více hostům na časové období
//        mezi dvěma daty (například pokoj číslo 3 na období od 15. 7. do 24. 7. 2021). Pobyt je buď pracovní, nebo rekreační.
//
//                Chceme také mít k dispozici třídu, která bude uchovávat všechny rezervace
//        (například list of bookings), které jsme v systému vytvořili a bude mít metodu, která vypíše informace o všech rezervacích.

//        Vytvoř hosty Adélu Malíkovou (narozena 13. 3. 1993) a Jana Dvořáčka (narozen 5.5.1995). Vypiš na obrazovku jejich popis (description).
//                Vytvoř pokoje a vypiš na obrazovku jejich popis:
//        pokoj číslo 1 a pokoj číslo 2 jsou jednolůžkové za cenu 1000 Kč/noc, s balkonem a výhledem na moře.
//                pokoj číslo 3 je trojlůžkový za cenu 2400 Kč/noc, bez balkónu, s výhledem na moře.
//                Připrav rezervace:
//        pro Adélu na pokoj č. 1 od 19. do 26. 7. 2021.
//        pro oba (společná rezervace) na pokoj č. 3 od 1. do 14. 9. 2021.
//        Vypiš seznam všech rezervací.

        Guest guest1 = new Guest ("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest ("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
        System.out.println(guest1.getDescription());
        System.out.println(guest2.getDescription());
        Room room1 = new Room (1, 1, true, true, BigDecimal.valueOf(1000));
        Room room2 = new Room (2, 1, true, true, BigDecimal.valueOf(1000));
        Room room3 = new Room (3, 3, false, true, BigDecimal.valueOf(2400));
        System.out.println(room1.getDescription());
        System.out.println(room2.getDescription());
        System.out.println(room3.getDescription());
        Booking booking1 = new Booking(guest1, room1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), TypeOfStay.WORKING);
        Booking booking2 = new Booking(guest1, room3, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), TypeOfStay.RECREATIONAL);
        booking2.addGuest(guest2);
        Bookings bookings = new Bookings();
        bookings.addBooking(booking1);
        bookings.addBooking(booking2);
        bookings.getBookingInfo();
        booking2.printOtherGuests();



    }
}
