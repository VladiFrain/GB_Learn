package OOP.seminar4.view;



import org.example.homework.h10oop.data.Teacher;
import org.example.homework.h10oop.data.User;

import java.util.List;


public class TeacherView implements UserView<Teacher> {


    @Override
    public Teacher sendOnConsole(List<User> userListlist) {
        return (Teacher) userListlist.get(0);
    }


}