import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    RoomType roomType;
    Guest guest;

    ArrayList<Booking> bookings = new ArrayList<>();

    ConferenceRoom conferenceRoom;
    ArrayList<Bedroom> bedrooms = new ArrayList<>();
    ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<>();

    @Before
    public void before(){
        guest = new Guest("Richard");
        roomType = RoomType.DOUBLE;
        bedroom = new Bedroom(roomType.getValue(), 69, roomType);
        bedrooms.add(bedroom);
        conferenceRoom = new ConferenceRoom("Dalrymple Suite", 20);
        conferenceRooms.add(conferenceRoom);
        hotel = new Hotel(bedrooms, conferenceRooms, bookings);
    }

    @Test
    public void canCheckGuestIntoRoom(){
        hotel.checkInGuest(69, guest);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void canCheckOutGuestFromRoom(){
        hotel.checkInGuest(69, guest);
        hotel.checkOutGuest(69);
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void canMakeBooking(){
        Booking booking = hotel.bookRoom(bedroom, 5);
        assertEquals(booking, hotel.getBookings().get(0));
    }

}
