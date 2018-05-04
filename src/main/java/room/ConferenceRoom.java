package room;

public class ConferenceRoom extends Room {

    private double cost;
    private String name;

    public ConferenceRoom(int capacity, String name, double cost) {
        super(capacity);
        this.name = name;
        this.cost = cost;

    }

    public double getCost() {
        return this.cost;
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity(){
        return super.getCapacity();
    }
}
