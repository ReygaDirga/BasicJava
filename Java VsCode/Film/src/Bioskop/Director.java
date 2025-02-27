package Bioskop;

public class Director {
    private String name;
    private String biography;

    Director(String name, String biography) {
        this.name = name;
        this.biography = biography;
    }
    
    String getName() {
        return name;
    }

    String getBiography() {
        return biography;
    }
}
