package Module5;
import sun.util.calendar.BaseCalendar;

import java.util.Date;

public class BookingComAPI implements API {
    private Room[] rooms = new Room[5];



    @Override
    public Room[] findRooms(int price, int persons, String cityName, String hotelName) {

        return new Room[0];
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
