package Restaurant;

public class Chef {
    private String name;
    private String biography;

    Chef(String name, String biography){
        this.name = name;
        this.biography = biography;
    }

    String getName(){
        return name;
    }
    String getBiography(){
        return biography;
    }
}
