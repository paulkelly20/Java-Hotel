package room;

public abstract class BillableRoom extends Room{

    private double roomprice;

    public BillableRoom(int capacity, double roomprice) {
        super(capacity);
        this.roomprice = roomprice;
    }

    public double getRoomPrice() {
        return roomprice;
    }

    public void setRoomprice(double roomprice) {
        this.roomprice = roomprice;
    }
}
