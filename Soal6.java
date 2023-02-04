package Week3;

import java.util.Scanner;
import java.math.BigInteger;

public class Soal6 {
    public static void main(String[] args) 
    {
        System.out.print("\033[H\033[2J");  
        BigInteger A, B;
        Scanner Keyboard = new Scanner(System.in);
        A= Keyboard.nextBigInteger();
        B= Keyboard.nextBigInteger();
        Keyboard.close();

        System.out.println("Penjumlahan= " + A.add(B));
        System.out.println("Perkalian= " + A.multiply(B));
    }
}
