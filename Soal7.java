package Week3;


public class Soal7 {
    public static void main(String[] args) {
        // One Dimensional Arrays
        System.out.print("\033[H\033[2J");
        int[] fisrtArray = { 2, 5, 3 };
        int[] secondArray = { 9, 5, 3 };
        int[] thirdArray = { 2, 4, 9 };
        int[] fourthArray = { 10, 11, 12 };
        int[] fifthArray = { 13, 14, 15 };
        int[] sixthArray = { 16, 17, 18 };
        int[] seventhArray = { 19, 20, 21 };
        int[] eighthArray = { 22, 23, 24 };
        int[] ninthArray = { 25, 26, 27 };
        // Two Dimensional Arrays
        int[][] twoDimensionalArray1 = { fisrtArray, secondArray, thirdArray };
        int[][] twoDimensionalArray2 = { fourthArray, fifthArray, sixthArray };
        int[][] twoDimensionalArray3 = { seventhArray, eighthArray, ninthArray };
        // Three Dimensional Array
        int[][][] threeDimensionalArray = { twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3 };

        for (int a = 0; a < 3; a++) {
            System.out.print("{");
            for (int b = 0; b < 3; b++) {
                for (int j = 0; j < 3; j++) {
                    if(j==0){
                        System.out.print("{");
                    }
                    if(j==2){
                        System.out.print(threeDimensionalArray[a][b][j] + " } ");
                    }
                    else{
                        System.out.print(threeDimensionalArray[a][b][j] + " ");
                    }
                    if(b==2 && j==2){
                        System.out.println("}");
                    }
                }
            }
        }
    }

}
