package Pertemuan22;
import java.util.*;
/**
 *
 * @author dwiok
 */
public class Array {
    
    int[][] m = new int[4][8];
    int[][] x ={
        {1,2,3},
        {4,5,6},
        {7,8,9},
    };
    
    ArrayList<Integer> y = new ArrayList<Integer>();
    
    HashMap<String,Integer> z = new HashMap<String,Integer>();
    
    public Array(){
        m[0][0] = 9;
        System.out.println(m[0][0]);
        
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.println("x[" + i + "][" + j + "] = " + x[i][j]);
            }
        }
        
        y.add(7);
        y.add(5);
        y.add(4);
        y.add(90);
        
        System.out.println(y.get(0));
        
        for(Integer n : y){ //foreach
            System.out.println(n + " size : " + y.size());
        }
        
        z.put("sfx", 99);
        z.put("bgm", 10);
        System.out.println(z.get("sfx"));
        
        HashMap<Mahasiswa,Float> z = new HashMap<Mahasiswa,Float>();
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        z.put(mhs1, 77f);
        z.put(mhs2, 33f);
        z.put(mhs2, 22f);
        System.out.println(z.get(mhs2));
    }
    
    public static void main(String[] args) {
        new Array();
    }
    
}
