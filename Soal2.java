package Week3;

import java.util.Scanner;

public class Soal2{
    public static void main(String[] args) 
    {
        String[] Inputan = new String[3];
        String[] Teks = new String[3];
        String[] Angka = new String[3];
        String Temp;
        System.out.print("\033[H\033[2J");  

        Scanner Keyboard = new Scanner(System.in);
            for(int i=0; i<3; i++){
                Inputan[i] = Keyboard.nextLine();
                if(Inputan[i].length()>10){
                    System.out.println("Input Invalid!");
                    i--;
                }
            }
        Keyboard.close();

        for(int i=0; i<3; i++){
            Temp = Inputan[i];
            String S[] = Temp.split("[!?'., @_]");
            Teks[i] = S[0];
            Angka[i] = S[1];
        }
        System.out.println("----------------------");
        for(int i=0; i<3; i++){
            System.out.print(Teks[i]);
            for(int j=0; j<15-Teks[i].length(); j++){
                System.out.print(" ");
            }
            if(Angka[i].length()<3){
                System.out.println("0" + Angka[i]);
            }
            else{
                System.out.println(Angka[i]);
            }
        }
        System.out.println("----------------------");
    }
}