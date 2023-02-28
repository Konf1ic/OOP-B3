import java.util.Scanner;

public class FindLargestElementInMatrix {
    public static void main(String[] args) {
        // Bước 1: Tìm phần tử lớn nhất của ma trận cho sẵn
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int max = matrix[0][0];
        int row = 0;
        int col = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong ma trận là " + max + " ở (" + row + ", " + col + ")");

        // Bước 2: thu thập đầu vào từ đầu vào của người dùng và hoàn thành yêu cầu
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng trong ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột trong ma trận: ");
        int cols = scanner.nextInt();

        int[][] userMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử tại vị trí (" + i + ", " + j + "): ");
                userMatrix[i][j] = scanner.nextInt();
            }
        }

        max = userMatrix[0][0];
        row = 0;
        col = 0;

        for (int i = 0; i < userMatrix.length; i++) {
            for (int j = 0; j < userMatrix[i].length; j++) {
                if (userMatrix[i][j] > max) {
                    max = userMatrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong ma trận là " + max + " ở vị trí (" + row + ", " + col + ")");
    }
}
