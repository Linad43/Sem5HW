package org.example;

import Task2.UserService;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int score, int age) {

    }

    @Override
    public void create(String name, String objectToTeach, int rang) {
        Teacher teacher = new Teacher(name, objectToTeach, rang);
        teachers.add(teacher);
    }

}
