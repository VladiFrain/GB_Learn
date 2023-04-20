package OOP.seminar4.service;


import OOP.seminar4.data.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {

    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = getMaxId();
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        teachers.add(teacher);
    }

    @Override
    public Long getId(Teacher teacher) {
        return teacher.getTeacherId();
    }

    @Override
    public Long getMaxId() {
        return getMaxId(teachers);
    }

}