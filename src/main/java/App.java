import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("n= ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.format("a[%d] = ", i);
//            arr[i] = sc.nextInt();
//        }
            int[] arr = Utils.generateArray(6,1,20);
            Utils.printArray(arr);
            int sum = Utils.sumNguyenTo(arr);
            System.out.format("Tổng các số nguyên tố trong mảng là: %d\n", sum);
            if (Utils.isTangDan(arr)) {
                System.out.println("Đây là mảng tăng dần");
            }
            else System.out.println("Đây là mảng không tăng dần");
        }
    }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào số nguyên: ");
//        int n = sc.nextInt();
//        if(Utils.isNguyenTo(n)){
//            System.out.println("nguyen to");
//        } else System.out.println(" ko nguyen to");

