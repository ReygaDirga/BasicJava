package hospital;

import java.util.ArrayList;
import main.*;
import people.*;

public class Hospital{
    private String name;
    private ArrayList<Department> departments = new ArrayList<>();
    private ArrayList<Patient> patients = new ArrayList<>();
    private int income = 0;

    public Hospital(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public void processVisit(Patient patient, Doctor doctor, String note)
    {
        String record = "- Visited "+doctor.getName()+" for "+note+" (Cost: "+ Main.formatIDR(doctor.getFee())+") ";
        patient.addMedicalrecord(record);
        //patient.setTotalSpent(patient.getTotalSpent()+doctor.getFee());
        patient.addTotalFee(doctor.getFee());
        income += doctor.getFee();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void registerPatient(Patient patient1) {
        patients.add(patient1);
    }

    public void displayHospitalInfo() {
        System.out.println("Hospital: "+name); 

        System.out.println("Departments:");
        for(Department d : departments)
        {
            System.out.println("- "+d.getName()+" (Head Doctor: "+d.getHeadDoctor().getName()+") ");
        }

        System.out.println("Doctors: ");
        for(Department d : departments)
        {
            System.out.println("- "+d.getHeadDoctor().getName()+" (Specialty: "+d.getName()+", Fee: "+ Main.formatIDR(d.getHeadDoctor().getFee()) +")");
            System.out.println("Patients: ");
            
            for(Patient p : d.getHeadDoctor().getPatients())
            {
                System.out.println("- "+p.getName()+" (Age: "+p.getAge()+")");
            }
        }

        System.out.println("Patients: ");
        for (Patient p : patients)
        {
            System.out.println("- "+p.getName()+" (ID: "+p.getId()+", Age: "+p.getAge()+") ");
            System.out.println("Medical Records: ");
            for(String s : p.getMedicalRecords())
            {
                System.out.println(s);
            }
            System.out.println("Total Spent: "+Main.formatIDR(p.getTotalSpent()) );
        }

        System.out.println("Total Hospital Income: "+income); 
    }
}