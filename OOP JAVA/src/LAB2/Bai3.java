package LAB2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double Namsinh, Tuoi;
        String Ten;
        System.out.print("Nhap ten ");
        Ten = sc.next();
        System.out.print("Nhap nam sinh ");
        Namsinh = sc.nextDouble();
        Tuoi = 2024 -Namsinh;

    if (Tuoi<16){
        System.out.println("Ban " + Ten + " o do tuoi vi thanh nien");
    }
    if (Tuoi>=16 && Tuoi <=18)
        System.out.println("Ban " + Ten + " o do tuoi truong thanh");
    if (Tuoi>=18){
        System.out.println("Ban " + Ten + " da gia");
    }
}
}
