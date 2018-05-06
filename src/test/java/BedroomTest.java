import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.BedroomType;
import room.Guest;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Bedroom bedroom2;
    Guest guest;
    Guest guest2;


    @Before
    public void before(){
        bedroom = new Bedroom(BedroomType.DOUBLE);
        bedroom2 = new Bedroom(BedroomType.FAMILY);
        guest = new Guest("Paul", 1000);
        guest2 = new Guest("Elaine", 1000);
    }

    @Test
    public void getBedroomType(){
        assertEquals(BedroomType.DOUBLE, bedroom.getType());
    }

    @Test
    public void checkRoomisEmpty(){
        assertEquals(0, bedroom.countGuestsInRoom());
    }

    @Test
    public void addGuesttoRoom(){
        bedroom.addGuestToRoom(guest);
        assertEquals(1, bedroom.countGuestsInRoom());
    }

    @Test
    public void addGuesttoRoomRoomFull(){
        bedroom.addGuestToRoom(guest);
        bedroom.addGuestToRoom(guest);
        bedroom.addGuestToRoom(guest);
        bedroom.addGuestToRoom(guest);
        assertEquals(2, bedroom.countGuestsInRoom());
    }

    @Test
    public void testIfGuestCanBecheckedOut(){
        bedroom.addGuestToRoom(guest);
        bedroom.checkOutGuestsFromRoom();
        assertEquals(0, bedroom.countGuestsInRoom());
    }

    @Test
    public void checkRoomCapacity(){
        assertEquals(2, bedroom.roomCapacity());
    }

    @Test
    public void checkRoomFee(){
        assertEquals(59.00, bedroom.getRoomPrice(),0);
    }

    @Test
    public void namesOfPeopleInRooms(){
        bedroom.addGuestToRoom(guest);
        ArrayList<String> names = new ArrayList<>();
        names.add("Paul");
        assertEquals(names, bedroom.getNamesOfPeopleInRooms());
    }

    @Test
    public void namesOfPeopleInRoomsTwoPeople(){
        bedroom.addGuestToRoom(guest);
        bedroom.addGuestToRoom(guest2);
        ArrayList<String> names = new ArrayList<>();
        names.add("Paul");
        names.add("Elaine");
        assertEquals(names, bedroom.getNamesOfPeopleInRooms());
    }



}

