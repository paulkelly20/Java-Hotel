import org.junit.Before;
import org.junit.Test;
import room.Guest;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Paul", 100);
    }

    @Test
    public void getGuestsName(){
        assertEquals("Paul", guest.getName());
    }

    @Test
    public void checkAmountInGuestsWallet(){
        assertEquals(100, guest.getWallet(), 0);
    }
}
