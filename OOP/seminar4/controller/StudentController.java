package OOP.seminar4.controller;


import OOP.seminar4.data.Student;
import OOP.seminar4.data.Teacher;
import OOP.seminar4.data.User;
import OOP.seminar4.service.StudentGroupService;
import OOP.seminar4.service.StudentService;
import OOP.seminar4.view.StudentView;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class StudentController implements UserController<Student>{

    private final StudentService dataService = new StudentService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
//        List<Student> studentList = dataService.getAll();
//        studentView.sendOnConsole(studentList);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);

    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);

    }

    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();

    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
       return studentGroupService.getSortedByFIOStudentGroup();

    }
}