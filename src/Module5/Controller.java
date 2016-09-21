package Module5;


public class Controller implements API {

    private API arraysOfApis[] = new API[3];

    public Controller(){
        BookingComAPI bookingComAPI = new BookingComAPI();
        arraysOfApis[0]=bookingComAPI;
    }

    @Override
    public Room[] findRooms(int price, int persons, String cityName, String hotelName) {
        return new Room[0];
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }

    private Room[] requestRooms(int price, int persons, String city, String hotelName) {
        return new Room[0];
    }
}

