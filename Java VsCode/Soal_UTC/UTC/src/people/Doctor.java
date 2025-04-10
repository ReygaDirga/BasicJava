package people;

public class Doctor {
    private int id;
    private String name;
    private String department;
    private int fee;
    
    public Doctor(int id, String name, String department, int fee){
        this.id = id;
        this.name = name;
        this.department = department;
        this.fee = fee;
    }
    
    public String getName(){
        return name;
    }
    
    public void addPatient(Patient patient, String diagnosis){
        System.out.println(name + " is treating " + patient.getName() + " for " + diagnosis);
    }
    
    public int getFee(){
        return fee;
    }
    
    public void setFee(int fee){
        this.fee = fee;
    }
    
    public String getDepartment(){
        return department;
    }
    
    public void setDepartment(String department){
        this.department = department;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void addVisit(Patient patient, String diagnosis){
        System.out.println(name + " is treating " + patient.getName() + " for " + diagnosis);
    }
    
    public void removeVisit(Patient patient){
        System.out.println(name + " has completed treatment for " + patient.getName());
    }
    
    public void prescribeMedication(Patient patient, String medication){
        System.out.println(name + " has prescribed " + medication + " to " + patient.getName());
    }
    
    public void referPatient(Patient patient, String department){
        System.out.println(name + " has referred " + patient.getName() + " to " + department);
    }
    
    public void displayDoctorInfo(){
        System.out.println("Doctor: " + name);
        System.out.println("Department: " + department);
        System.out.println("Fee: " + fee);
    }
}
