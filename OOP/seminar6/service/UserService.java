package OOP.seminar4.service;

import OOP.seminar4.data.User;

import java.time.LocalDate;
import java.util.List;

public interface UserService<T extends User> {
    List<T> getAll();
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);

    public Long getId(T user);
    public Long getMaxId();

    public default Long getMaxId(List<T> users){
        Long countMaxId = 0L;
        for (T user: users){
            if (getId(user) > countMaxId){
                countMaxId = getId(user);
            }
        }
        return countMaxId;
    }
}