package Module7.Module5;


import java.util.ArrayList;
import java.util.List;

public class Controller {

    List<API> apis = new ArrayList<>(3);


    public Controller() {
        apis.add(new BookingComAPI());
        apis.add(new TripAdvisorAPI());
        apis.add(new GoogleAPI());
    }

    List<Room> requestRoom(int price, int persons, String hotelName, String cityName) {
        List<Room> bookingCom = apis.get(0).findRooms(price, persons, cityName, hotelName);
        List<Room> tripAdvisor = apis.get(1).findRooms(price, persons, cityName, hotelName);
        List<Room> google = apis.get(2).findRooms(price, persons, cityName, hotelName);

        List<Room> rooms = new ArrayList<>();
        rooms.addAll(bookingCom);
        rooms.addAll(bookingCom.size(), tripAdvisor);
        rooms.addAll(tripAdvisor.size(), google);


        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i) != null) {
                System.out.println(rooms.get(i));
            }
        }
        return rooms;
    }

    public List <Room> check(API api1, API api2) {
        List <Room> roomsApi1 = api1.getAll();
        List<Room> roomsApi2 = api2.getAll();
        List<Room> result = new ArrayList<>();

        for (int i = 0; i < roomsApi1.size(); i++) {
            for (int k = 0; k < roomsApi2.size(); k++) {
                if (roomsApi1.get(i).equals(roomsApi2.get(k))) {
                    result.add(roomsApi1.get(i));
                    i++;
                    k++;
                }
            }
        }
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) != null) {
                System.out.println(result.get(i));
            }
        }
        return result;
    }
}

