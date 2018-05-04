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


}

