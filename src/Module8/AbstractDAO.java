package Module8;


import java.util.ArrayList;
import java.util.List;

public interface AbstractDAO<T> {

    T save(T gen);

    void delete(T gen);

    void deleteAll(List<T> genList);

    void saveAll(List<T> genList);

    List<T> getList();

}
