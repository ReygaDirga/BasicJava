package OneFile;
import java.util.ArrayList;
import java.util.Scanner;

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

class Storage {
    private static final double MAX_STORAGE = 1024.0;
    private double usedStorage = 0;
    private ArrayList<Document> documents = new ArrayList<>();

    public boolean addDocument(Document doc) {
        if (usedStorage + doc.getSize() <= MAX_STORAGE) {
            documents.add(doc);
            usedStorage += doc.getSize();
            return true;
        } else {
            System.out.println("Gagal menambahkan dokumen. Storage penuh!");
            return false;
        }
    }

    public void viewDocuments() {
        if (documents.isEmpty()) {
            System.out.println("Tidak ada dokumen tersimpan.");
        } else {
            for (int i = 0; i < documents.size(); i++) {
                System.out.print((i + 1) + ". ");
                documents.get(i).display();
            }
        }
    }

    public void approveDocument(int index) {
        if (index >= 0 && index < documents.size()) {
            documents.get(index).approve();
        } else {
            System.out.println("Dokumen tidak ditemukan!");
        }
    }

    public double getRemainingStorage() {
        return MAX_STORAGE - usedStorage;
    }
}

public class DocumentManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Storage storage = new Storage();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Register New Document");
            System.out.println("2. View All Documents");
            System.out.println("3. Approve Document");
            System.out.println("4. Exit");
            System.out.println("Sisa Storage: " + storage.getRemainingStorage() + "MB");
            System.out.print("Pilih menu: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama dokumen: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan ukuran dokumen (MB): ");
                    double size = scanner.nextDouble();
                    scanner.nextLine();

                    if (size > 0) {
                        Document doc = new Document(name, size);
                        storage.addDocument(doc);
                    } else {
                        System.out.println("Ukuran dokumen harus lebih dari 0!");
                    }
                    break;
                case 2:
                    storage.viewDocuments();
                    break;
                case 3:
                    System.out.print("Masukkan nomor dokumen yang ingin di-approve: ");
                    int index = scanner.nextInt() - 1;
                    storage.approveDocument(index);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}

