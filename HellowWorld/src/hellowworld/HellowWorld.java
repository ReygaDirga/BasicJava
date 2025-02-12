package hellowworld;
import java.util.Scanner;
/**
 *
 * @author dwiok
 */
public class HellowWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama anda : ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan nim anda : ");
        int nim = scanner.nextInt();
        
        System.out.print("Masukkan umur anda : ");
        int umur = scanner.nextInt();
        
        System.out.println("\nHai " + nama + ", nim lu " + nim);
        
        if(umur < 17){
            System.out.println("Anda masih dibawah umur");
        }else if(umur > 17){
            System.out.println("Anda sudah berumur");
        }else{
            System.out.println("error");
        }
        
    }
    
}
