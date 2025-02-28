package manDoc;
import java.util.*;

class Document {
    private String name;
    private double size;
    private String status;

    public Document(String name, double size) {
        this.name = name;
        this.size = size;
        this.status = "Draft";
    }

    public String getName() { return name; }
    public double getSize() { return size; }
    public String getStatus() { return status; }

    public void approve() {
        if (this.status.equals("Draft")) {
            this.status = "Approved";
        } else {
            System.out.println("Dokumen sudah ter-approve!");
        }
    }

    public void display() {
        System.out.println("Nama: " + name + ", Ukuran: " + size + "MB, Status: " + status);
    }
}

public class register {
    private Storage storage;
    public register(Storage storage){
        this.storage = storage;
    }

    public void registerDocument(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama dokumen: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan ukuran dokumen (MB): ");
        double size = scanner.nextDouble();
        scanner.nextLine();

        if (size > 0) {
            Document doc = new Document(name, size);
            boolean success = storage.addDocument(doc);
            if(success){
                System.out.println("Dokumen berhasil ditambahkan!");
            } else {
                System.out.println("Dokumen gagal ditambahkan!");
            }
        } else {
            System.out.println("Ukuran dokumen harus lebih dari 0!");
        }
    }
}
