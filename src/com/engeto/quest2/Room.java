package com.engeto.quest2;

import java.math.BigDecimal;

public class Room {
//    Hosty vždy ubytováváme na pokojích (room). Pokoj je identifikován svým číslem.
//        O každém pokoji chceme evidovat, kolik lůžek tam je (neřeš přistýlky apod.), zda má pokoj balkón a
//        zda má výhled na moře a jaká je cena pokoje za jednu noc (předpokládej, že je cena pevně daná bez ohledu na sezónu a počet ubytovaných).

    int roomNumber;
    int bedNumber;
    boolean hasBalcony;
    boolean hasSeeView;
    BigDecimal pricePerNight;

    public Room(int roomNumber, int bedNumber, boolean hasBalcony, boolean hasSeeView, BigDecimal pricePerNight) {
        this.roomNumber = roomNumber;
        this.bedNumber = bedNumber;
        this.hasBalcony = hasBalcony;
        this.hasSeeView = hasSeeView;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isHasSeeView() {
        return hasSeeView;
    }

    public void setHasSeeView(boolean hasSeeView) {
        this.hasSeeView = hasSeeView;
    }

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getDescription(){
        return "Pokoj č. "+roomNumber+", počet lůžek: "+bedNumber+", cena za noc: "+pricePerNight.toString();
    }
}
