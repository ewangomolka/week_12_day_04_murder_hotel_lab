import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Bedroom bedroom;

    ConferenceRoom conferenceRoom;

    Guest guest;

    RoomType roomType;

    @Before
    public void before(){
        guest = new Guest("Richard");
        roomType = RoomType.DOUBLE;
        bedroom = new Bedroom(roomType.getValue(), 69, roomType);
        conferenceRoom = new ConferenceRoom("Dalrymple Suite", 20);
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void conferenceRoomHasName(){
        assertEquals("Dalrymple Suite", conferenceRoom.getName());
    }

    @Test
    public void bedroomHasRoomNumber(){
        assertEquals(69, bedroom.getRoomNumber());
    }
    @Test
    public void canAddRichardToBedroom(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getNumberOfGuests());
    }


}
