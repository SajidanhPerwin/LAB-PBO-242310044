package praktikum_1;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double harga = 5000000;
        System.out.print("Masukkan luas tanah: ");
        double luas = input.nextDouble();

        double total = harga * luas;

        System.out.println("Harga total = Rp " + total);
    }
}