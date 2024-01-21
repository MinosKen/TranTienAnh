package LAB2;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, Tong, Hieu, Tich, Thuong, Sodu;
        System.out.print("A = ");
        A = sc.nextDouble();
        System.out.print("B = ");
        B = sc.nextDouble();
        Tong = A+B;
        System.out.println("Tong = "+Tong);
        Hieu = A-B;
        System.out.println("Hieu = "+Hieu);
        Tich = A*B;
        System.out.println("Tich ="+Tich);
        Thuong = A/B;
        System.out.println("Thuong = "+Thuong);
        Sodu = A%B;
        System.out.println("So du = "+Sodu);

        if (A>B) {
            System.out.println("A > B");
        }
        if (A<B) {
            System.out.println("A < B");
        }
        if (A==B) {
            System.out.println("A = B");
        }
    }
}
