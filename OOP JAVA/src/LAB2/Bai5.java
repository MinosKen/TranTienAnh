package LAB2;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int number, sum = 0;
    Scanner sc = new Scanner(System.in);      
    do {
     System.out.print("Nhap vao so nguyen bat ki: ");
       number = sc.nextInt();
       sum = sum + number;
    } while (sum < 100); 
     System.out.print("Tong cac so nguyen vua nhap = "+sum);
    }
}
