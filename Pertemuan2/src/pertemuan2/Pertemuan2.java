package pertemuan2;

/**
 *
 * @author dwiok
 */
public class Pertemuan2 {
    
    int x;
    Integer y = 99;
    Float y1 = 99f;
    String name = "Budi";
    String st = "Hello World";
    String nim = "PRO_2802540585";
    
    public Pertemuan2(){
        System.out.println(y.MAX_VALUE);
        System.out.println(y1.MAX_VALUE);
        int a = Integer.parseInt("99996");
        System.out.println(a);
        System.out.println(name.equals("budi"));
        System.out.println(name.compareTo("Budi"));
        System.out.println(st.substring(2));
        System.out.println(nim.indexOf('_'));
        System.out.println(st.indexOf("Hell"));
        System.out.println(st.contains("Hello"));
    }
    
    public static void main(String[] args) {
       new Pertemuan2();
    }
    
}
