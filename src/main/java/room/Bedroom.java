package room;

import room.BedroomType;
import room.Room;

import java.util.ArrayList;


public class Bedroom extends Room {
    private BedroomType bedroomtype;



    public Bedroom(BedroomType bedroomtype) {
        super(bedroomtype.getCapacity());
        this.bedroomtype = bedroomtype;

    }

    public BedroomType getType() {
        return this.bedroomtype;
    }


    public int roomCapacity(){
        return this.bedroomtype.getCapacity();
    }

    public double roomPrice(){
        return this.bedroomtype.getPrice();
    }




}
