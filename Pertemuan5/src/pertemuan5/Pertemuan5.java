package pertemuan5;
import java.util.*;

public class Pertemuan5 {

    ArrayList<String> arr = new ArrayList<String>();
    
    public Pertemuan5(){
        arr.add("Hello");
        
        String word = arr.get(0);
        for(int i = 0; i < word.length(); i++){
                System.out.println(word.charAt(0));
        }
    }
    
    public static void main(String[] args) {
        new Pertemuan5();
    }
    
}
