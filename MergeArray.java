import java.util.Arrays;
public class MergeArray {
    public static void main(String[] args) {
        // Bước 1: Tạo 2 mảng số với kích thước cho trước
        int[] array1 = new int[5];
        int[] array2 = new int[3];

        // Bước 2: Sử dụng vòng lặp để nhập giá trị cho các phần tử trong mảng
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 6;
        }

        // Bước 3: Tạo mảng thứ 3 có kích thước bằng kích thước mảng 1 + kích thước mảng 2
        int[] array3 = new int[array1.length + array2.length];

        // Bước 4: Sử dụng vòng lặp để duyệt qua các phần tử trong mảng 1
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        // Bước 5: Dùng vòng lặp duyệt qua các phần tử của mảng 2
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        System.out.println(Arrays.toString(array3));
    }
}
