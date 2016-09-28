package Module5;


public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        BookingComAPI bookingCom = new BookingComAPI();
        TripAdvisorAPI tripAdvisor = new TripAdvisorAPI();
        GoogleAPI google = new GoogleAPI();

        System.out.println("Request rooms ");
        controller.requestRoom(100, 2, "Feather", "Wonderland");
        controller.requestRoom(230, 3, "HighInn", "Amsterdam");
        controller.requestRoom(150, 2, "Sweet Home", "Athens");

        System.out.println();

        System.out.println("Check matches in apis ");
        controller.check(bookingCom, tripAdvisor);
        controller.check(tripAdvisor, google);
        controller.check(google, bookingCom);


    }
}
