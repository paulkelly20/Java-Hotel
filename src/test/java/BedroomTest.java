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
    Guest guest;


    @Before
    public void before(){
        bedroom = new Bedroom(BedroomType.DOUBLE);
        guest = new Guest("Paul", 1000);
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


}

