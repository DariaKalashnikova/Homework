package Module7.Module5;


import java.util.List;

public interface DAO {
    List<Room> save(List<Room> room);

    boolean delete(List<Room> room);

    List<Room> update(List<Room> room);

    List<Room> findById(long id);

}
