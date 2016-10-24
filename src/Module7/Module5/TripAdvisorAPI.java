package Module7.Module5;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TripAdvisorAPI implements API {

    private List<Room> rooms = new ArrayList<>();

    public TripAdvisorAPI() {
        rooms.add(new Room(444555, 100, 2, new Date(), "Feather", "Wonderland"));
        rooms.add(new Room(223310, 100, 1, new Date(), "Hilton", "Prague"));
        rooms.add(new Room(22211, 220, 3, new Date(), "Joey's", "Waynward Pines"));
        rooms.add(new Room(77889, 120, 2, new Date(), "Afrodita", "Saloniki"));
        rooms.add(new Room(222145, 200, 2, new Date(), "Finch", "Berlin"));
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
