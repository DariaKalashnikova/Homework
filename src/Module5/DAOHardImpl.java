package Module5;


public class DAOHardImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println(room.toString()+" saved ");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Room updated" + room);
        return null;
    }

    @Override
    public Room findById(long id) {
        System.out.println("Id room found" + id);
        return null;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
