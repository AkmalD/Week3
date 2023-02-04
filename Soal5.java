package Week3;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) 
    {
        System.out.print("\033[H\033[2J");  
        String Plat;
        Long GabunganPlat;
        
        Scanner Keyboard = new Scanner(System.in);
        
        Plat= Keyboard.nextLine();
        Plat= Plat.replaceAll(" ", "");
        GabunganPlat = Long.parseLong(Plat);
        System.out.println(GabunganPlat);

       Keyboard.close();
       if((GabunganPlat-999999)%5!=0){          //Sepertinya terdapat kekeliruan dalam soal, Jadi saya ubah menjadi %5 !=0
        System.out.println("berhenti");
       } 
       else{
        System.out.println("jalan");
       }
    }
}
