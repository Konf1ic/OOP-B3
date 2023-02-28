import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArry {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Bước 2: Nhập X là số cần chèn
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần thêm: ");
        int x = scanner.nextInt();

        // Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
        System.out.print("Nhập vị trí chỉ số để chèn: ");
        int index = scanner.nextInt();

        //Bước 4: Nếu index <= -1 và index >= array.length – 1 thì hiển thị không chèn được phần tử vào mảng.
        if (index < 0 || index > arr.length - 1) {
            System.out.println("Không thể chèn phần tử vào vị trí chỉ số đã cho.");
            return;
        }

        // Bước 5: Thực hiện chèn phần tử X ở vị trí index vào mảng
        int[] newArr = new int[arr.length + 1];
        int j = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = x;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }

        // Bước 6: In ra mảng
        System.out.println("Mảng mới là: " + Arrays.toString(newArr));
    }
}


