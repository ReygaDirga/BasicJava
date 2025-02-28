package manDoc;
import java.util.*;

public class doc {
    private static Storage storage = new Storage();
    public doc(){
        int input;
        do {
            System.out.println("HOV DOCUMENT MANAGER");
            System.out.println("===================================");
            System.out.println("Available Storage : " + storage.getRemainingStorage() + " / 1024.0 MB");
            System.out.println("1. Register New Document");
            System.out.println("2. View All Document");
            System.out.println("3. Approve Document");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();
            switch (input) {
                case 1:
                    register reg = new register(storage);
                    reg.registerDocument();
                    break;
                case 2:
                    storage.viewDocuments();
                    break;
                case 3:
                    storage.viewDocuments();
                    System.out.print("Masukkan nomor dokumen yang ingin di-approve: ");
                    int index = sc.nextInt() - 1;
                    storage.approveDocument(index);
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
            }
        } while (input != 4);
    }

    public static void main(String[] args) {
        new doc();
    }
}
