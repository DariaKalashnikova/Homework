package Module7.Module5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingComAPI implements API {
    private List<Room> rooms = new ArrayList<>();

    public BookingComAPI() {
        rooms.add(new Room(102030, 150, 2, new Date(), "Raddison", "Kiev"));
        rooms.add(new Room(223310, 100, 1, new Date(), "Hilton", "Prague"));
        rooms.add(new Room(222551, 300, 3, new Date(), "Holiday Inn", "Finnland"));
        rooms.add(new Room(3311144, 150, 2, new Date(), "Sweet Home", "Athens"));
        rooms.add(new Room(774411, 80, 4, new Date(), "Fitzerald", "Roma"));
    }


    @Override
    public List<Room> findRooms(int price, int persons, String cityName, String hotelName) {
        Room roomFound = new Room(0, 0, 0, new Date(), cityName, hotelName);
        ArrayList<Room> found = new ArrayList<>();
        for (Room room : rooms) {
            if (room.equals(roomFound) && room.getHotelName().equals(hotelName) && room.getCityName().equals(cityName)) {
                found.add(room);
            }
        }
        return found;
    }


    @Override
    public List<Room> getAll() {

        return rooms;
    }

}
