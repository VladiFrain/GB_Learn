package OOP.seminar4.view;



import OOP.seminar4.data.Teacher;
import OOP.seminar4.data.User;

import java.util.List;


public class TeacherView implements UserView<Teacher> {


    @Override
    public Teacher sendOnConsole(List<User> userListlist) {
        return (Teacher) userListlist.get(0);
    }


}