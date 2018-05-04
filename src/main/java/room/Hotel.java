package room;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferencerooms;
    private ArrayList<DiningRoom> diningrooms;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.conferencerooms = new ArrayList<>();
        this.diningrooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getBedroomsCount() {
        return bedrooms.size();
    }

    public int getConferenceroomsCount() {
        return conferencerooms.size();
    }

    public int getDiningroomsCount() {
        return diningrooms.size();
    }
}
