package people;

public class Patient {
    private int id;
    private String name;
    private int age;
    
    public Patient(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void visitDoctor(Doctor doctor, String diagnosis){
        System.out.println(name + " is visiting " + doctor.getName() + " for " + diagnosis);
    }
    
    public void payBill(int amount){
        System.out.println(name + " has paid the bill of " + amount);
    }
    
    public void requestMedication(Doctor doctor, String medication){
        System.out.println(name + " has requested " + medication + " from " + doctor.getName());
    }
    
    public void requestReferral(Doctor doctor, String department){
        System.out.println(name + " has requested a referral to " + department + " from " + doctor.getName());
    }
    
    public void followUp(Doctor doctor, String diagnosis){
        System.out.println(name + " is following up with " + doctor.getName() + " for " + diagnosis);
    }
    
    public void requestTest(Doctor doctor, String test){
        System.out.println(name + " has requested a " + test + " from " + doctor.getName());
    }
    
    public void requestSurgery(Doctor doctor, String surgery){
        System.out.println(name + " has requested a " + surgery + " from " + doctor.getName());
    }
    
    public void requestConsultation(Doctor doctor, String consultation){
        System.out.println(name + " has requested a " + consultation + " from " + doctor.getName());
    }
    
    public void requestTreatment(Doctor doctor, String treatment){
        System.out.println(name + " has requested a " + treatment + " from " + doctor.getName());
    }
    
    public void requestCheckup(Doctor doctor, String checkup){
        System.out.println(name + " has requested a " + checkup + " from " + doctor.getName());
    }
    
    public void requestPrescription(Doctor doctor, String prescription){
        System.out.println(name +
" has requested a " + prescription + " from " + doctor.getName());
    }
}
