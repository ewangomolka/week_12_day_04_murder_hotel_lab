import org.junit.Before;

public class BookingTest {

    Bedroom bedroom;

    Booking booking;

    RoomType roomType;

    @Before
    public void before(){
        roomType = RoomType.DOUBLE;
        bedroom = new Bedroom(roomType.getValue(), 69, roomType);
        booking = new Booking(bedroom, 5);
    }

}
