import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Thực hành mãng

        int[] arr = Utils.generateArray(6, 1, 20);
        Utils.printArray(arr);

        // Bài 2b - Mãng có phải toàn số nguyên tố
        if (Utils.isNguyenToArr(arr)) {
            System.out.println("Đây là mãng gồm các số nguyên tố");
        } else System.out.println("Đây là mãng không gồm các số nguyên tố");

        // Bài 2c -  Mảng có phải là số tăng dần
        if (Utils.isTangDan(arr)) {
            System.out.println("Đây là mảng tăng dần");
        } else System.out.println("Đây là mảng không tăng dần");

        // Bài 3a - Có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5
        int count = Utils.chia(arr);
        System.out.format("Có %d số chia hết cho 4 và không chia hết cho 5\n", count);

        //bài 3b - Tổng các số nguyên tố có trong mảng
        int sum = Utils.sumNguyenTo(arr);
        System.out.format("Tổng các số nguyên tố trong mảng là: %d\n", sum);
    }
}
