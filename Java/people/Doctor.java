package people;

import java.util.ArrayList;


public class Doctor{
    private int id;
    private String name;
    private String specialty;
    private int fee;
    private ArrayList<Patient> patients = new ArrayList<>();

    public Doctor(int id, String name, String specialty, int fee) {
        this.fee = fee;
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getFee() {
        return fee;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }


}