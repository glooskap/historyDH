package demo.data;

import java.util.List;

public interface DAO {

    String select(List<Integer> ids);

    String create(List<Integer> ids);

    String update(List<Integer> ids);

    String delete(List<Integer> ids);

}
