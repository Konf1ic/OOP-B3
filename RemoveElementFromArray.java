import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // B1: Khai báo mảng
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = array.length;

        // B2: Nhập X là phần tử cần xóa
        System.out.print("Nhập phần tử cần xóa: ");
        int x = input.nextInt();

        // B3:  Tìm X xem có xuất hiện trong mảng không. Nếu xuất hiện chỉ ra vị trí của X. Vị trí này là: index_del
        int index_del = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                index_del = i;
                break;
            }
        }

        if (index_del == -1) {
            System.out.println("Không tìm thấy phần tử trong mảng.");
            return;
        } else {
            System.out.println("Phần tử ở chỉ số: " + index_del);
        }

        // B4: Xoá phần tử X khỏi mảng
        for (int i = index_del; i < n - 1; i++) {
            array[i] = array[i + 1];
        }
        n--;

        // Step 5: In ra mảng.
        System.out.println("Mảng mới: ");
        System.out.println(Arrays.toString(Arrays.copyOf(array, n)));
    }
}