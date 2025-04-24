package actor;

import java.util.*;

public class Lecturer implements IAttendee {
    String lecturerCode;
    String name;
    String dob;
    Map<Integer, List<String>> teachingCourses;

    public Lecturer(String lecturerCode, String name, String dob) {
        this.lecturerCode = lecturerCode;
        this.name = name;
        this.dob = dob;
        this.teachingCourses = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(int semester, String courseName) {
        teachingCourses.putIfAbsent(semester, new ArrayList<>());
        teachingCourses.get(semester).add(courseName);
    }

    public void showCourse(int semester) {
        List<String> courses = teachingCourses.getOrDefault(semester, new ArrayList<>());
        System.out.println("Lecturer " + name + " is teaching:");
        for (String c : courses) {
            System.out.println("- " + c);
        }
    }
}
