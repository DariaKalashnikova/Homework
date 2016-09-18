package Module5;


public class GoogleAPI implements API {
    @Override
    public Room[] findRooms(int price, int persons, String cityName, String hotelName) {
        return new Room[0];
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
