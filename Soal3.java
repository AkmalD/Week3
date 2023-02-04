package Week3;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        String Input, Operation;
        String[] InputPerKata = new String[3];
        int num1, num2, result = 0;
        Boolean Lagi = false;

        System.out.print("\033[H\033[2J"); // Clear Screen
        System.out.print("Masukan angka= ");

        while (!Lagi) {
            Input = Keyboard.nextLine();
            InputPerKata = Input.split(" ");

            if (InputPerKata.length < 3 || InputPerKata.length > 3) {
                System.out.println("Input harus 3 elemen (dipisahkan dengan spasi): integer, operator, integer\n");
            } else {
                Lagi= true;
            }
        }
        Keyboard.close();

        num1 = Integer.parseInt(InputPerKata[0]);
        num2 = Integer.parseInt(InputPerKata[2]);
        Operation = InputPerKata[1];

        if(Operation.equals("+")){
            result = num1 + num2;
        }
        else if(Operation.equals("-")){
            result = num1 - num2;
        }
        else if(Operation.equals("*")){
            result = num1 * num2;
        }
        else if(Operation.equals("/")){
            result = num1/num2;
        }
        else if(Operation.equals("%")){
            result = num1 % num2;
        }else{
            System.out.println("Invalid Operation");
            System.exit(0);
        }

        System.out.println("Hasil = " + result);

    }
}
