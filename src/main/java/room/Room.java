package room;

import java.util.ArrayList;

public abstract class Room {
    private ArrayList<Guest> room;
    private int capacity;
    ;

    public Room(int capacity) {
        this.capacity = capacity;
        this.room = new ArrayList<>();
    }

    public int countGuestsInRoom(){
        return room.size();
    }

    public ArrayList<Guest> getRoom() {
        return this.room;
    }

    public void checkOutGuestsFromRoom(){
        room.clear();
    }

    public void addGuestToRoom(Guest guest){
        if(this.capacity > room.size())
        room.add(guest);
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList getNamesOfPeopleInRooms(){
        ArrayList<String> guests = new ArrayList<>();
        for(Guest guest: room){ guests.add(guest.getName());}

        return guests;
    }

    public ArrayList getNameOfPeopleInCertainRooms(Room particularroom){
        ArrayList<String> guests = new ArrayList<>();
        for(Guest guest: particularroom.getRoom()){ guests.add(guest.getName());}

        return guests;
    }

}






