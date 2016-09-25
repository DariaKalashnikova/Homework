package Module5;


import java.util.Date;

public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println(room.toString() + " saved ");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room.toString() + " deleted ");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room.toString() + " updated ");
        return room;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(0, 0, 0, new Date(00000000), null, null);
        System.out.println(room.toString() + " Room by id found");
        return room;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
