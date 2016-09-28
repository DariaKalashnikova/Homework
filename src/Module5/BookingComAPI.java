package Module5;

import java.util.Date;

public class BookingComAPI implements API {
    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        Room room1 = new Room(102030, 150, 2, new Date(), "Raddison", "Kiev");
        rooms[0] = room1;
        Room room2 = new Room(223310, 100, 1, new Date(), "Hilton", "Prague");
        rooms[1] = room2;
        Room room3 = new Room(222551, 300, 3, new Date(), "Holiday Inn", "Finnland");
        rooms[2] = room3;
        Room room4 = new Room(3311144, 150, 2, new Date(), "Sweet Home", "Athens");
        rooms[3] = room4;
        Room room5 = new Room(774411, 80, 4, new Date(), "Fitzerald", "Roma");
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
