package Module5;


public class Controller {

    private API[] apis = new API[3];

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        apis[0] = bookingComAPI;
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        apis[1] = tripAdvisorAPI;
        GoogleAPI googleAPI = new GoogleAPI();
        apis[2] = googleAPI;
    }

    public Room[] requestRoom(int price, int persons, String hotelName, String cityName) {
        Room[] bookingCom = apis[0].findRooms(price, persons, cityName, hotelName);
        Room[] tripAdvisor = apis[1].findRooms(price, persons, cityName, hotelName);
        Room[] google = apis[2].findRooms(price, persons, cityName, hotelName);

        Room[] rooms = new Room[bookingCom.length + tripAdvisor.length + google.length];
    }
}

