package Module5;


import java.util.Date;

public class GoogleAPI implements API {

    private Room[] rooms = new Room[5];

    public GoogleAPI() {
        Room room1 = new Room(884477, 55, 2, new Date(20161202), "Zepish", "Transilvania");
        rooms[0] = room1;
        Room room2 = new Room(221155, 200, 5, new Date(20160803), "Meresuu", "Narva");
        rooms[1] = room2;
        Room room3 = new Room(99885, 500, 2, new Date(20170809), "Trump", "Honolulu");
        rooms[2] = room3;
        Room room4 = new Room(879549, 95, 1, new Date(20170215), "Gournes", "Heraklion");
        rooms[3] = room4;
        Room room5 = new Room(645287, 230, 3, new Date(20180109), "HighInn", "Amsterdam");
        rooms[4] = room5;
    }

    @Override
    public Room[] findRooms(int price, int persons, String cityName, String hotelName) {
        return new Room[0];
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
