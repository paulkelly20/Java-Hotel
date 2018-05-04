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
    Bedroom bedroom3;
    Bedroom bedroom4;
    ConferenceRoom conferenceroom1;
    ConferenceRoom conferenceroom2;
    DiningRoom diningroom;

    @Before
    public void before(){
        hotel = new Hotel("Codeclan", 100);
        guest1 = new Guest("Paul", 200);
        guest2 = new Guest("Elaine", 500);
        bedroom1 = new Bedroom(BedroomType.DOUBLE);
        bedroom2 = new Bedroom(BedroomType.FAMILY);
        bedroom3 = new Bedroom(BedroomType.FAMILY);
        bedroom4 = new Bedroom(BedroomType.FAMILY);
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

    @Test
    public void checkBedroomNUmbers(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        hotel.addBedroom(bedroom4);
        hotel.giveBedroomsANumber();
        assertEquals(1, bedroom1.getRoomnumber());
        assertEquals(2, bedroom2.getRoomnumber());
        assertEquals(3, bedroom3.getRoomnumber());
        assertEquals(4, bedroom4.getRoomnumber());
    }

    @Test
    public void checkGuestIntoBedoom(){
        hotel.checkGuestIntoBedroom(guest1, bedroom1);
        assertEquals(1, bedroom1.countGuestsInRoom());
        assertEquals(159, hotel.getTill(), 0);
        assertEquals(141, guest1.getWallet(), 0);

    }

    @Test
    public void checkGuestIntoConferenceroom(){
        hotel.checkGuestIntoConferenceroom(guest1, conferenceroom1);
        assertEquals(1, conferenceroom1.countGuestsInRoom());
        assertEquals(200, hotel.getTill(), 0);
        assertEquals(100, guest1.getWallet(), 0);

    }

    @Test
    public void checkHowmanyBedroomsAreVacant(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        hotel.addBedroom(bedroom4);
        hotel.checkGuestIntoBedroom(guest1, bedroom1);
        hotel.checkGuestIntoBedroom(guest2, bedroom2);
        assertEquals(2, hotel.checkVacantBedrooms());
    }

    @Test
    public void checkHowmanyConferenceroomsAreVacant(){
        hotel.addConferenceRoom(conferenceroom1);
        hotel.addConferenceRoom(conferenceroom2);
        hotel.checkGuestIntoConferenceroom(guest1, conferenceroom1);
        assertEquals(1, hotel.checkVacantConferencerooms());
    }





}
