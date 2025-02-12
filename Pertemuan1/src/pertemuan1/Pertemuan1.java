package pertemuan1;
import java.util.*;
/**
 *
 * @author dwiok
 */
public class Pertemuan1 {
    public Scanner sc;
    int x = 99;
    String nama = "anton";
    //constructor
    public Pertemuan1(){
        x = 88;
        System.out.println(x);
    }
    public Pertemuan1(int a){
        sc = new Scanner(System.in);
        String nama1 = sc.nextLine();
        x = 88 + a;
        System.out.println(x);
        System.out.println("Welcome " + nama + nama1);
        System.out.println(Math.cos(88)); 
        Pertemuan1.Hello();
        
    } 
    public static void Hello(){
        System.out.println("static function");
    }
    public static void main(String[] args) {
        new Pertemuan1(100); // create objek from class
    }
    
}
