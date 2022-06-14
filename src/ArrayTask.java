
import java.io.IOException;
import java.util.Random;

public class ArrayTask {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int n = random.nextInt();
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] matrix3 = new int[2][2];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix1[i][j] = n;
            }
        }
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = n;
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix3[i][j] = matrix1.length + matrix2.length;
            }
            for (int[] ints : matrix3) {
                for (int j = 0; j < matrix3[0].length; j++) {
                    System.out.print(ints[j] + " ");
                }
                System.out.println();
            }
        }
//        StringBuilder s = new StringBuilder();
//        for (int i = 0; i < matrix3.length; i++) {
//            for (int j = 0; j < matrix3.length; j++) {
//                s.append(matrix3[i][j]).append("  ");
//            }
//            s.append("\n");
//        }
//        byte[] bytes = s.toString().getBytes();

    }
}
