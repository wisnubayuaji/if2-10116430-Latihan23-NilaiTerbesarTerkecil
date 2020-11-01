import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Nim : 10116430 
 * Nama : Wisnu Bayu Aji 
 * Kelas: IF-2
 */
public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        double diameter = 0;
        
        do {
            try {
                
                System.out.println("=====Perhitungan Lingkaran=====");
                System.out.print("Masukan nilai diameter lingkaran : ");
                diameter = sc.nextDouble();

                System.out.println(diameter);
            } catch (Exception e) {
                //TODO: handle exception
                
            }
        } while (diameter <= 0);
    }
}
