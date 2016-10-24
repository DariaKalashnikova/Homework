package Module7.Module5;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DAOImpl implements DAO {

    @Override
    public List<Room> save(List<Room> room) {
        System.out.println(room.toString() + " saved");
        return room;
    }

    @Override
    public boolean delete(List<Room> room) {
        System.out.println(room.toString() + " deleted");
        return false;
    }

    @Override
    public List<Room> update(List<Room> room) {
        System.out.println(room.toString() + " updated");
        return room;
    }

    @Override
    public List<Room> findById(long id) {
        List<Room> rooms = new ArrayList<>();
        for (int i = 0; i<rooms.size(); i++){
            if (rooms.get(i).getId() == id){
                System.out.println(rooms.get(i));
            }
        }
        return null;
    }
}
