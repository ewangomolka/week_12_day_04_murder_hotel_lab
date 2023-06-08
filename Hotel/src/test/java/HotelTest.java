import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    RoomType roomType;
    Guest guest;

    ConferenceRoom conferenceRoom;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;

    @Before
    public void before(){
        guest = new Guest("Richard");
        roomType = RoomType.DOUBLE;
        bedroom = new Bedroom(roomType.getValue(), 69, roomType);
        conferenceRoom = new ConferenceRoom("Dalrymple Suite", 20);
        hotel = new Hotel(bedrooms, conferenceRooms);
    }

    @Test
    public void canCheckGuestIntoRoom(){
        hotel.checkInGuest(bedroom, guest);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void canCheckOutGuestFromRoom(){
        hotel.checkInGuest(bedroom, guest);
        hotel.checkOutGuest(bedroom, guest);
        assertEquals(0, bedroom.getNumberOfGuests());
    }
}
