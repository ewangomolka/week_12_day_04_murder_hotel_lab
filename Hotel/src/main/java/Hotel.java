import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    private ArrayList<Booking> bookings;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, ArrayList<Booking> bookings) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.bookings = bookings;
    }

    public int getNumberOfBedrooms() {
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void checkInGuest(int roomNumber, Guest guest) {
        for (Bedroom bedroom : this.bedrooms){
            if (bedroom.getRoomNumber() == roomNumber) {
                bedroom.addGuest(guest);
            }
        }
    }

    public void checkOutGuest(int roomNumber) {
        Bedroom foundRoom = null;
        for (Bedroom bedroom : this.bedrooms){
            if (bedroom.getRoomNumber() == roomNumber){
                foundRoom = bedroom;
            }
        }

        foundRoom.getGuests().clear();
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNights){
        Booking booking = new Booking(bedroom, numberOfNights);
        bookings.add(booking);
        return booking;
    }


    public ArrayList<Booking> getBookings() {
        return bookings;
    }
}
