package Bioskop;

public class Movie {
    private String title;
    private String id;
    private Director director;

    Movie(String title, String id, Director director) {
        this.title = title;
        this.id = id;
        this.director = director;
    }

    String getTitle() {
        return title;
    }

    String getId() {
        return id;
    }

    Director getDirector() {
        return director;
    }

    void printMovie() {
        System.out.println("Title: " + title);
        System.out.println("ID: " + id);
        System.out.println("Director: " + director.getName());
        System.out.println("Biography: " + director.getBiography());
    }
}
