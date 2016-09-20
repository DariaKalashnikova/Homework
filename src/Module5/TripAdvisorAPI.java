package Module5;


import java.util.Date;

public class TripAdvisorAPI implements API {

    private Room[] rooms = new Room[5];

    public TripAdvisorAPI(){
        Room room1=new Room(444555,100,2,new Date(20162012),"Feather","Wonderland");
        rooms[0]=room1;
        Room room2=new Room(5557852,125,5,new Date(20170102),"BikiniPines","Bikini Bottom");
        rooms[1]=room2;
        Room room3=new Room(22211,220,3,new Date(20180215),"Joey's", "Waynward Pines");
        rooms[2]=room3;
        Room room4=new Room(77889,120,2,new Date(20170314),"Afrodita","Saloniki");
        rooms[3]=room4;
        Room room5=new Room(222145,200,2,new Date(20170512),"Finch","Berlin");
        rooms[4]=room5;

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
