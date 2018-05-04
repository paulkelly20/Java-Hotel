import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.BedroomType;
import room.Guest;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;
    Bedroom bedroom;

    @Before
    public void before(){
        guest = new Guest("Paul", 100);
        bedroom = new Bedroom(BedroomType.DOUBLE);

    }

    @Test
    public void getGuestsName(){
        assertEquals("Paul", guest.getName());
    }

    @Test
    public void checkAmountInGuestsWallet(){
        assertEquals(100, guest.getWallet(), 0);
    }

    @Test
    public void checkWalletAfterGuestPaysForRoom(){
        guest.payforRoom(bedroom.roomPrice());
        assertEquals(41, guest.getWallet(), 0);
    }
}
