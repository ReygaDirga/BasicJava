package hospital;

public class Department {
    private String name;
    private Doctor headDoctor;

    public Department(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Doctor getHeadDoctor(){
        return headDoctor;
    }

    public void setHeadDoctor(Doctor doctor){
        headDoctor = doctor;
    }
}
