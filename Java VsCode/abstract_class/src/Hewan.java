abstract class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }
    abstract void bersuara(); // method abstract yang harus diimplementasikan oleh subclass
    abstract void serang(); // method abstract yang harus diimplementasikan oleh subclass

    void info() { // method biasa yang dapat digunakan oleh subclass
        System.out.println("Nama hewan: " + nama);
    }
}

class Singa extends Hewan{
    Singa(String nama){
        super(nama);
    }

    void bersuara(){
        System.out.println("Roarrrr!");
    }

    void serang(){
        System.out.println("Singa menyerang dengan cakarnya!");
    }
}

class Ular extends Hewan{
    Ular(String nama){
        super(nama);
    }

    void bersuara(){
        System.out.println("Ssssss!");
    }

    void serang(){
        System.out.println("Ular menyerang dengan bisa!");
    }
}
