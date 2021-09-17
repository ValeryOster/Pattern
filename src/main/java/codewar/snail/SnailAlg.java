package codewar.snail;

public class SnailAlg {

    public static int[] snail(int[][] array) {
        int direction = 0;
        int[] result = new int[array.length * array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[][] array
                = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        SnailAlg.snail(array);
    }
}
