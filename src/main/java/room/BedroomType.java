package room;

public enum BedroomType {
    DOUBLE(59.00, 2),
    SINGLE(49.00, 1),
    FAMILY(99.00, 4),
    QUEEN(79.00, 2),
    KING(89.00, 2),
    SUITE(150.00, 6);

    private double price;
    private int capacity;

    BedroomType(double price,int capacity) {
        this.price = price;
        this.capacity = capacity;
    }

    public double getPrice() {
        return this.price;
    }

    public int getCapacity() {
        return this.capacity;
    }


    public void setPrice(double price) {
        this.price = price;
    }
}


