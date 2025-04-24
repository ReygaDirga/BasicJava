package actor;

import java.util.*;

public class Student implements IAttendant {
    String nim;
    String name;
    String dob;
    Map<Integer, List<String>> enrolledCourses;

    public Student(String nim, String name, String dob) {
        this.nim = nim;
        this.name = name;
        this.dob = dob;
        this.enrolledCourses = new HashMap<>();
    }

    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(int semester, String courseCode) {
        enrolledCourses.putIfAbsent(semester, new ArrayList<>());
        enrolledCourses.get(semester).add(courseCode);
    }

    public void showCredits(int semester) {
        int totalCredits = 0;
        List<String> courses = enrolledCourses.getOrDefault(semester, new ArrayList<>());
        totalCredits = courses.size() * 2;
        System.out.println(name + " has " + totalCredits + " credits in semester " + semester);
    }
}
