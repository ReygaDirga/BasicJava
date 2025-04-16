package people;

import java.util.ArrayList;


public class Patient{
    private int id;
    private String name;
    private int age;
    private ArrayList<String> medicalRecords = new ArrayList<>();
    private int totalSpent;

    public Patient(int id, String name, int age) {
        this.age = age;
        this.id = id;
        this.name = name;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<String> getMedicalRecords() {
        return medicalRecords;
    }

    public int getTotalSpent() {
        return totalSpent;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMedicalRecords(ArrayList<String> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    public void setTotalSpent(int totalSpent) {
        this.totalSpent = totalSpent;
    }

    public void addMedicalrecord(String record) {
        medicalRecords.add(record);
    }

    public void addTotalFee(int fee) {
        totalSpent += fee;
    }


    
}