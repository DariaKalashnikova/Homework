package Module5;


import java.util.Date;

public class TripAdvisorAPI implements API {

    private Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        Room room1 = new Room(444555, 100, 2, new Date(), "Feather", "Wonderland");
        rooms[0] = room1;
        Room room2 = new Room(223310, 100, 1, new Date(), "Hilton", "Prague");
        rooms[1] = room2;
        Room room3 = new Room(22211, 220, 3, new Date(), "Joey's", "Waynward Pines");
        rooms[2] = room3;
        Room room4 = new Room(77889, 120, 2, new Date(), "Afrodita", "Saloniki");
        rooms[3] = room4;
        Room room5 = new Room(222145, 200, 2, new Date(), "Finch", "Berlin");
        rooms[4] = room5;

    }


    @Override
    public Room[] findRooms(int price, int persons, String cityName, String hotelName) {

        Room[] roomFound = new Room[rooms.length];
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getCityName().equals(cityName) && rooms[i].getPersons() == persons && rooms[i].getPrice() == price) {
                roomFound[i] = rooms[i];
            }
        }
        return roomFound;
    }

    @Override
    public Room[] getAll() {

        return rooms;
    }
}
