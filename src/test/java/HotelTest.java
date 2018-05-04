import org.junit.Before;
import org.junit.Test;
import room.*;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest1;
    Guest guest2;
    Bedroom bedroom1;
    Bedroom bedroom2;
    ConferenceRoom conferenceroom1;
    ConferenceRoom conferenceroom2;
    DiningRoom diningroom;

    @Before
    public void before(){
        hotel = new Hotel("Codeclan");
        guest1 = new Guest("Paul", 200);
        guest2 = new Guest("Elaine", 500);
        bedroom1 = new Bedroom(BedroomType.DOUBLE);
        bedroom2 = new Bedroom(BedroomType.FAMILY);
        conferenceroom1 = new ConferenceRoom(1, "Conferenceroom 1", 100);
        conferenceroom2 = new ConferenceRoom(2, "Conferenceroom 2", 3000);
        diningroom = new DiningRoom(3);

    }

    @Test
    public void checkHotelName(){
        assertEquals("Codeclan", hotel.getName());
    }

    @Test
    public void addBedroomtoHotel(){
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.getBedroomsCount());
    }

    @Test
    public void addConferenceRoomToHotel(){
        hotel.addConferenceRoom(conferenceroom1);
        assertEquals(1, hotel.getConferenceroomsCount());
    }

    @Test
    public void addDiningroomToHotel(){
        hotel.addDiningroom(diningroom);
        assertEquals(1, hotel.getDiningroomsCount());
    }
}
