package bedroom extends Room;

public class Bedroom {
    private Type type;
    private double nightlyrate;
    private int number;
    private boolean vacant;

    public Bedroom(Type type ,double nightlyrate, int number, boolean vacant) {
        this.type = type
        this.nightlyrate = nightlyrate;
        this.number = number;
        this.vacant = vacant;
    }

}
