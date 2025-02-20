package Composition;
import java.util.ArrayList;
import java.util.List;

class Buku {
    private String judul;

    public Buku(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }
}

class Perpustakaan {
    private String nama;
    private List<Buku> koleksiBuku; // Komposisi

    public Perpustakaan(String nama) {
        this.nama = nama;
        this.koleksiBuku = new ArrayList<>();
    }

    public void tambahBuku(String judul) {
        Buku buku = new Buku(judul); // Buku dibuat di dalam Perpustakaan (komposisi)
        koleksiBuku.add(buku);
    }

    public void displayBuku() {
        System.out.println("Perpustakaan " + nama + " memiliki koleksi buku:");
        for (Buku buku : koleksiBuku) {
            System.out.println("- " + buku.getJudul());
        }
    }
}

public class compo {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan("Perpus Kota");
        perpus.tambahBuku("Java Programming");
        perpus.tambahBuku("Data Structures");

        perpus.displayBuku();
    }
}
