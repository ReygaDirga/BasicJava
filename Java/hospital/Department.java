package hospital;

import java.util.ArrayList;
import people.Doctor;


public class Department{
    private String name;
    private Doctor headDoctor;
    private ArrayList<Doctor> doctors = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public Doctor getHeadDoctor() {
        return headDoctor;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeadDoctor(Doctor headDoctor) {
        this.headDoctor = headDoctor;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

}