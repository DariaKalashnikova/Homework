package Module5;


import java.util.Date;

public class GoogleAPI implements API {

    private Room[] rooms = new Room[5];

    public GoogleAPI() {
        Room room1 = new Room(884477, 55, 2, new Date(), "Zepish", "Transilvania");
        rooms[0] = room1;
        Room room2 = new Room(221155, 200, 5, new Date(), "Meresuu", "Narva");
        rooms[1] = room2;
        Room room3 = new Room(774411, 80, 4, new Date(), "Fitzerald", "Roma");
        rooms[2] = room3;
        Room room4 = new Room(879549, 95, 1, new Date(), "Gournes", "Heraklion");
        rooms[3] = room4;
        Room room5 = new Room(645287, 230, 3, new Date(), "HighInn", "Amsterdam");
        rooms[4] = room5;
    }

    @Override
    public Room[] findRooms(int price, int persons, String cityName, String hotelName) {
        Room[] roomFound = new Room[rooms.length];
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getCityName().equals(cityName) && rooms[i].getPrice() == price && rooms[i].getPersons() == persons) {
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
