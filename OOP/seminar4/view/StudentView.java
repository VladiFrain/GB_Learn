package OOP.seminar4.view;



import org.example.homework.h10oop.data.Student;
import org.example.homework.h10oop.data.StudentGroup;
import org.example.homework.h10oop.data.User;

import java.util.List;
import java.util.logging.Logger;

public class StudentView implements UserView<Student>{

    Logger logger = Logger.getLogger(StudentView.class.getName());


    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }


    @Override
    public Student sendOnConsole(List<User> userListlist) {
        return (Student) userListlist.get(0);
    }
}