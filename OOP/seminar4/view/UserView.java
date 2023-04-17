package OOP.seminar4.view;


import OOP.seminar4.data.Student;
import OOP.seminar4.data.User;

import java.util.List;

public interface UserView<T extends User>{

    T sendOnConsole(List<User> userListlist);
}