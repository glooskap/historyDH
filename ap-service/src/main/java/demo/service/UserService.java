package demo.service;

import java.util.List;

public interface UserService{

    String getAll();

    String get(List<Integer> ids);

    String add(List<Integer> ids);

    String update(List<Integer> ids);

    String delete(List<Integer> ids);

}
