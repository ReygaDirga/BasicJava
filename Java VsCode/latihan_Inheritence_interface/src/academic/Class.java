package academic;

import java.util.*;
import actor.*;

public class Class {
    String classCode;
    int semester;
    String year;
    List<Student> students = new ArrayList<>();
    List<Lecturer> lecturers = new ArrayList<>();
    List<Course> courses = new ArrayList<>();

    private List<String> todayAttendance = new ArrayList<>();

    public Class(String classCode, int semester, String year) {
        this.classCode = classCode;
        this.semester = semester;
        this.year = year;
    }

    public void addStudent(Student s) {
        students.add(s);
        for (Course c : courses) {
            s.enrollCourse(semester, c.getCourseCode());
        }
    }

    public void addLecturer(Lecturer l, Course c) {
        lecturers.add(l);
        l.assignCourse(semester, c.getCourseName());
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void attend(IAttendant i) {
        if (i instanceof Student) {
            Student s = (Student) i;
            System.out.println(s.getName() + " has attended the class.");
            todayAttendance.add(s.getName());
        }
    }
    
    public void takeAttendance(IAttendee i) {
        if (i instanceof Lecturer) {
            Lecturer l = (Lecturer) i;
            System.out.println("Lecturer " + l.getName() + " has taken attendance.");
        }
    }

    public void showTodayAttendance() {
        System.out.println("Today's attendance:");
        for (String name : todayAttendance) {
            System.out.println("- " + name);
        }
    }
}
