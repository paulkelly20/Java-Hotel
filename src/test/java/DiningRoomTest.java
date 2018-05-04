import org.junit.Before;
import org.junit.Test;
import room.ConferenceRoom;
import room.DiningRoom;
import room.Guest;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom diningroom;
    Guest guest;

    @Before
    public void before() {
        diningroom = new DiningRoom(100);
        guest = new Guest("Paul", 1000);
    }

    @Test
    public void checkRoomCapacity(){
        assertEquals(100, diningroom.getCapacity());
    }


    @Test
    public void checkIfDiningroomisEmpty(){
        assertEquals(0, diningroom.countGuestsInRoom());
    }

    @Test
    public void canAddGuestToRoom(){
        diningroom.addGuestToRoom(guest);
        assertEquals(1, diningroom.countGuestsInRoom());
    }

    @Test
    public void removeGuestsFromRoom(){
        diningroom.addGuestToRoom(guest);
        diningroom.checkOutGuestsFromRoom();
        assertEquals(0, diningroom.countGuestsInRoom());
    }
}
