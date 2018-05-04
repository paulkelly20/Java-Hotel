package room;

public class ConferenceRoom extends Room {

    private double price;
    private String name;

    public ConferenceRoom(int capacity, String name, double price) {
        super(capacity);
        this.name = name;
        this.price = price;

    }

    public double roomPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity(){
        return super.getCapacity();
    }
}
