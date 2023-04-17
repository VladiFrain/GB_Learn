package OOP.seminar4.view;



import OOP.seminar4.data.Student;
import OOP.seminar4.data.StudentGroup;
import OOP.seminar4.data.User;

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