import java.util.Scanner;

public class PTB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double A,B,C,X1,X2,X3,D;
        System.out.print("A = ");
        A = sc.nextDouble();
        System.out.print("B = ");
        B = sc.nextDouble();
        System.out.print("C = ");
        C = sc.nextDouble();
        D = B*B-4*A*C;
        X1 = -B/2*A;
        X2 = (-B+Math.sqrt(D))/(2*A);
        X3 = (-B-Math.sqrt(D))/(2*A);
        if (D<0){
            System.out.println("Phuong trinh vo nghiem");
        }
        if (D==0){
            System.out.println("Phuong trinh co nghiem kep = "+X1);
        }
        if (D>0){
            System.out.println("Phuong trinh co nghiem X1 = "+X2);
            System.out.println("Phuong trinh co nghiem X2 = "+X3);
        }
    }
}
