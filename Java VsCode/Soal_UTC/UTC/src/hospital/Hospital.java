package hospital;

import java.util.ArrayList;
import people.*;

public class Hospital{
    private String name;
    private ArrayList<Department> departments = new ArrayList<Department>();
    private ArrayList<Patient> patients = new ArrayList<Patient>();

    public Hospital(String name){
        this.name = name;
    }

    public void addDepartment(Department department){
        departments.add(department);
    }

    public void registerPatient(Patient patient){
        patients.add(patient);
    }

    public void processVisit(Patient patient, Doctor doctor, String diagnosis){
        doctor.addVisit(patient, diagnosis);
    }

    public void displayHospitalInfo(){
        System.out.println("Hospital: " + name);
        for(Department department : departments){
            System.out.println("Department: " + department.getName());
            Doctor headDoctor = department.getHeadDoctor();
            System.out.println("Head Doctor: " + headDoctor.getName());
            System.out.println("Patients:");
            for(Patient patient : headDoctor.getPatients()){
                System.out.println(patient.getName());
            }
        }
    }
}