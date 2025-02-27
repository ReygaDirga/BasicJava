package manDoc;
import java.util.*;
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
