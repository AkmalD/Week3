package Week3;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) 
    {
        System.out.print("\033[H\033[2J");  
        Scanner Keyboard = new Scanner(System.in);
        Integer Item, GajiPokok= 500000, Harga= 50000, GajiTotal= 0;
        Item = Keyboard.nextInt();
        Keyboard.close();

        if(Item>80){
            GajiTotal= GajiPokok + ((35*(Harga*Item))/100);
        }
        else if(Item>=40){
            GajiTotal= GajiPokok + ((25*(Harga*Item))/100);
        }
        else if(Item<15){
            GajiTotal= GajiPokok - ((15*(Harga*(15-Item)))/100);
        }
        else{
            GajiTotal= GajiPokok + ((10*(Harga*Item))/100);
        }
        System.out.println("Gaji Total: " + GajiTotal);
    }
    
}
