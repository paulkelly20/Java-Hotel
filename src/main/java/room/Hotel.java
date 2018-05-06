package room;

import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.HashMap;

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

    public double getTill() {
        return till;
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

    public void checkGuestIntoBedroom(Guest guest, Bedroom bedroom, int nights) {
        if(bedroom.countGuestsInRoom() == 0)
        {bedroom.addGuestToRoom(guest);
        till += (bedroom.getRoomPrice() * nights);
        guest.payforRoom(bedroom.getRoomPrice() * nights);
        bedroom.setNightsbooked(nights);}

        else if (nights <= bedroom.getNightsbooked())
        {
            bedroom.addGuestToRoom(guest);
        }

    }


    public void checkGuestIntoConferenceroom(Guest guest, BillableRoom conferenceroom) {
        if(conferenceroom.countGuestsInRoom() == 0){
           conferenceroom .addGuestToRoom(guest);
            till += conferenceroom.getRoomPrice();
            guest.payforRoom(conferenceroom.getRoomPrice());}
            else{conferenceroom.addGuestToRoom(guest);}
    }


    public ArrayList checkVacantBedrooms(){
        ArrayList<Bedroom> emptyrooms = new ArrayList<>();
        for (Bedroom bedroom : this.bedrooms) {
            if (bedroom.countGuestsInRoom() == 0){
            emptyrooms.add(bedroom);}
            }  return emptyrooms;
    }

    public int getNumberOfVacantBedrooms(){
      return checkVacantBedrooms().size();
    }


    public int checkVacantConferencerooms() {
        ArrayList<ConferenceRoom> emptyrooms = new ArrayList<>();
        for (ConferenceRoom conferenceroom : this.conferencerooms) {
            if (conferenceroom.countGuestsInRoom() == 0){
                emptyrooms.add(conferenceroom);}
        }  return emptyrooms.size();
    }


    public void checkGuestsOut(Room room) {
        room.checkOutGuestsFromRoom();
    }


    public HashMap getNameOfGuestsInHotel() {
        HashMap<Room, String> allguests = new HashMap<>();

        ArrayList<Room> allrooms = new ArrayList<>();
        allrooms.addAll(bedrooms);
        allrooms.addAll(conferencerooms);
        allrooms.addAll(diningrooms);

        for(Room room : allrooms)if
                (room.countGuestsInRoom() > 0)
                 {allguests.put(room,room.getNamesOfPeopleInRooms().toString());}

        return allguests;
    }

    public int countGuestsInHotel(){
       return getNameOfGuestsInHotel().size();
    }

    public ArrayList getNameOfPeopleInCertainRooms(Room particularroom){
        ArrayList<String> guests = new ArrayList<>();
        for(Guest guest: particularroom.getRoom()){ guests.add(guest.getName());}
        return guests;
    }
}

