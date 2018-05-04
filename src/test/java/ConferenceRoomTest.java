import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.BedroomType;
import room.ConferenceRoom;
import room.Guest;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceroom;
    Guest guest;

    @Before
    public void before() {
        conferenceroom = new ConferenceRoom(5, "Codeclan", 100);
        guest = new Guest("Paul", 1000);
    }

    @Test
    public void checkRoomName(){
        assertEquals("Codeclan", conferenceroom.getName());
    }

    @Test
    public void checkRoomCapacity(){
        assertEquals(5, conferenceroom.getCapacity());
    }

    @Test
    public void checkRoomCost(){
        assertEquals(100, conferenceroom.getCost(), 0);
    }

    @Test
    public void checkIfConferenceRoomisEmpty(){
        assertEquals(0, conferenceroom.countGuestsInRoom());
    }

    @Test
    public void canAddGuestToRoom(){
        conferenceroom.addGuestToRoom(guest);
        assertEquals(1, conferenceroom.countGuestsInRoom());
    }

    @Test
    public void removeGuestsFromRoom(){
        conferenceroom.addGuestToRoom(guest);
        conferenceroom.checkOutGuestsFromRoom();
        assertEquals(0, conferenceroom.countGuestsInRoom());
    }


}