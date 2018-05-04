package room;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private double till;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferencerooms;
    private ArrayList<DiningRoom> diningrooms;

    public Hotel(String name, double till) {
        this.name = name;
        this.till = till;
        this.bedrooms = new ArrayList<>();
        this.conferencerooms = new ArrayList<>();
        this.diningrooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getBedroomsCount() {
        return bedrooms.size();
    }

    public int getConferenceroomsCount() {
        return conferencerooms.size();
    }

    public int getDiningroomsCount() {
        return diningrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceroom) {
        conferencerooms.add(conferenceroom);
    }

    public void addDiningroom(DiningRoom diningroom){
        diningrooms.add(diningroom);
    }

    public void giveBedroomsANumber() {
        int i = 1;
        for (Bedroom bedroom : this.bedrooms) {
              bedroom.setRoomnumber(i); i++ ;

        }

    }

//    public void dealCard(int cards) {
//
//        for (Player player : this.players) {
//            for(int i = 0; i < cards ; i++) {
//                player.receiveCard(deck.giveCard());
//            }
//        }
//    }

}
