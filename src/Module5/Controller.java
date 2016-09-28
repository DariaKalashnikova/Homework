package Module5;


public class Controller {

    API[] apis = new API[3];

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        apis[0] = bookingComAPI;
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        apis[1] = tripAdvisorAPI;
        GoogleAPI googleAPI = new GoogleAPI();
        apis[2] = googleAPI;
    }

    Room[] requestRoom(int price, int persons, String hotelName, String cityName) {
        Room[] bookingCom = apis[0].findRooms(price, persons, cityName, hotelName);
        Room[] tripAdvisor = apis[1].findRooms(price, persons, cityName, hotelName);
        Room[] google = apis[2].findRooms(price, persons, cityName, hotelName);

        Room rooms[] = new Room[bookingCom.length + tripAdvisor.length + google.length];
        System.arraycopy(bookingCom,0,rooms,0,bookingCom.length);
        System.arraycopy(tripAdvisor,0,rooms,bookingCom.length, tripAdvisor.length);
        System.arraycopy(google,0,rooms,bookingCom.length + tripAdvisor.length, google.length);

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println(rooms[i]);
            }
        }
        return rooms;
    }

    public Room[] check(API api1, API api2) {
        Room[] roomsApi1 = api1.getAll();
        Room[] roomsApi2 = api2.getAll();
        Room[] result = new Room[roomsApi1.length + roomsApi2.length];

        for (int i = 0; i < roomsApi1.length; i++) {
            for (int k = 0; k < roomsApi2.length; k++) {
                if (roomsApi1[i].equals(roomsApi2[k])) {
                    result[i] = roomsApi1[i];
                    i++;
                    k++;
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] != null) {
                System.out.println(result[i]);
            }
        }
        return result;
    }
}

