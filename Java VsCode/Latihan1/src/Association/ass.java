package Association;

class Dosen {
    private String nama;

    public Dosen(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Mahasiswa {
    private String nama;
    private Dosen dosen; // Hubungan asosiasi

    public Mahasiswa(String nama, Dosen dosen) {
        this.nama = nama;
        this.dosen = dosen;
    }

    public void displayInfo() {
        System.out.println(nama + " dibimbing oleh " + dosen.getNama());
    }
}

public class ass {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("Pak Budi");
        Mahasiswa mhs1 = new Mahasiswa("Joko", dosen1);

        mhs1.displayInfo();
    }
}
