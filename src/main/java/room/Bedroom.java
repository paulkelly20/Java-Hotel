package room;

import room.BedroomType;
import room.Room;

import java.util.ArrayList;


public class Bedroom extends BillableRoom {
    private BedroomType bedroomtype;
    private int roomnumber;
    private int nightsbooked;

    public Bedroom( BedroomType bedroomtype) {
        super(bedroomtype.getCapacity(), bedroomtype.getPrice());
        this.bedroomtype = bedroomtype;
        this.roomnumber = roomnumber;
        this.nightsbooked = nightsbooked;
    }


    public BedroomType getType() {
        return this.bedroomtype;
    }


    public int roomCapacity(){
        return this.bedroomtype.getCapacity();
    }

    public double getRoomPrice(){
        return this.bedroomtype.getPrice();
    }

    public int getRoomnumber() {
        return roomnumber;
    }

    public int getNightsbooked() {
        return nightsbooked;
    }

    public void setRoomnumber(int roomnumber) {
        this.roomnumber = roomnumber;
    }

    public void setNightsbooked(int nightsbooked) {
        this.nightsbooked = nightsbooked;
    }

    public void setRoomprice(double newRoomPrice){
        this.bedroomtype.setPrice(newRoomPrice);

    }
}
