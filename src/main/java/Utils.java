import java.util.Scanner;

public class Utils {
    public static int[] generateArray(int n, int min, int max) {
        int[] ret = new int[n];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (int) Math.floor((Math.random() * (max - min)) + min);
            i++;
        }
        return ret;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.format("%d, ", arr[i]);
        }
        System.out.println();
    }

    public static int sumNguyenTo(int[] arr) {
        int sum = 0;

        for (int n : arr) {
            if (isNguyenTo(n)) {
                sum += n;
            }
        }
        return sum;

    }

    public static boolean isNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTangDan(int[] arr) {
        boolean ret = true;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    ret = false;
                    break;
                }
            }
        }

        return ret;
    }

    public static boolean isNguyenToArr(int[] arr) {
        boolean ret = true;
        for (int n : arr) {
            if (isNguyenTo(n)) {
                ret = true;
            } else {
                ret = false;
                break;
            }
        }
        return ret;
    }

    public static int chia(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 4 == 0 && arr[i] % 5 != 0) {
                count += 1;
            }
        }
        return count;
    }
}
