package Agregation;
import java.util.List;
import java.util.ArrayList;

class Mahasiswa {
    private String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Universitas {
    private String nama;
    private List<Mahasiswa> mahasiswas; // Agregasi

    public Universitas(String nama) {
        this.nama = nama;
        this.mahasiswas = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mhs) {
        mahasiswas.add(mhs);
    }

    public void displayMahasiswa() {
        System.out.println("Universitas " + nama + " memiliki mahasiswa:");
        for (Mahasiswa mhs : mahasiswas) {
            System.out.println("- " + mhs.getNama());
        }
    }
}

public class agre {
    public static void main(String[] args) {
        Universitas univ = new Universitas("Universitas Gadjah Mada");
        Mahasiswa mhs1 = new Mahasiswa("Andi");
        Mahasiswa mhs2 = new Mahasiswa("Budi");

        univ.tambahMahasiswa(mhs1);
        univ.tambahMahasiswa(mhs2);

        univ.displayMahasiswa();
    }
}
