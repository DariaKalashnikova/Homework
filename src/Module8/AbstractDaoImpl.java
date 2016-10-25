package Module8;


import java.util.ArrayList;
import java.util.List;

public class AbstractDaoImpl<T> implements AbstractDAO<T> {

    List<T> genList = new ArrayList<T>();

    @Override
    public T save(T gen) {
        if (gen != null) {
            genList.add(gen);
            System.out.println("Saved: " + gen);
        }
        return gen;
    }

    @Override
    public void delete(T gen) {
        genList.remove(gen);
        System.out.println("removed: " + gen);
    }

    @Override
    public void deleteAll(List<T> genList) {
        genList.clear();
        System.out.println("List cleared: " + genList);
    }

    @Override
    public void saveAll(List<T> genList) {
        genList.addAll(genList);
        System.out.println("Saved list:" + genList);
    }

    @Override
    public List<T> getList() {
        for (T t : genList) {
            System.out.println("Get:" + t);
        }return this.genList;
    }
}

