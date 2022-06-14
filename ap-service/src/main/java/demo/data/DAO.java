package demo.data;

import java.util.List;

public interface DAO<T> {

    List<T> selectAll();

    List<T> select(List<Integer> ids);

    List<T> create(List<Integer> ids);

    List<T> update(List<Integer> ids);

    List<T> delete(List<Integer> ids);

}
