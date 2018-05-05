package room;

public class ConferenceRoom extends BillableRoom {


    private String name;

    public ConferenceRoom(int capacity, double roomprice, String name) {
        super(capacity, roomprice);
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public int getCapacity(){
        return super.getCapacity();
    }
}
