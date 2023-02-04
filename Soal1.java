package Week3;

import java.util.*;

public class Soal1 {

    public static void main(String[] args) 
    {
        System.out.print("\033[H\033[2J");
        Scanner Keyboard = new Scanner(System.in);
        String S = Keyboard.nextLine();
        String[] P = S.split("['!?@_ ]");
        System.out.println(P.length);
        for(int i=0;i<P.length;i++) 
        {
            System.out.println(P[i]);
        }
        Keyboard.close();
    }
}

