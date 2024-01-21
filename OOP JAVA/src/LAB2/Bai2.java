package LAB2;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X;
        System.out.print("Nhap so : ");
        X = sc.nextDouble();
            if (X>0){ 
                if (X%2==0) {
                   System.out.println("X la so chan");
                                                        }
                 if (X%2==1) {
                    System.out.println("X la so le");
                                                        }
                }
            if (X<0){
                System.out.println("X khong phai so chan le");
            }
        }
}

