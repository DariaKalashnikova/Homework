package Module7.Module5;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoogleAPI implements API {

    private List<Room> rooms = new ArrayList<>();

    public GoogleAPI() {
        rooms.add(new Room(884477, 55, 2, new Date(), "Zepish", "Transilvania"));
        rooms.add(new Room(221155, 200, 5, new Date(), "Meresuu", "Narva"));
        rooms.add(new Room(774411, 80, 4, new Date(), "Fitzerald", "Roma"));
        rooms.add(new Room(879549, 95, 1, new Date(), "Gournes", "Heraklion"));
        rooms.add(new Room(645287, 230, 3, new Date(), "HighInn", "Amsterdam"));
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
