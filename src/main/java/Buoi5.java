import java.util.Arrays;
import java.util.Scanner;

public class Buoi5 {
    public static void main(String[] args) {
        Bai2b();
        Bai2c();
        Bai3a();
        Bai3b();
    }

    public static void Bai2b() {
        Scanner sc = new Scanner(System.in);
        System.out.print("--- Bai 2b: Nhap so so luong phan tu co trong mang: ");

        int n = sc.nextInt();
        int[] arr = NhapGiaTriTrongMang(n);

        boolean checkValid = true;
        for (int i = 0; i < n; i++) {
            if (!isNguyenTo(arr[i])) {
                checkValid = false;
                break;
            }
        }

        System.out.println(checkValid
                ? "Mang nay deu co gia tri la so nguyen to"
                : "Mang nay ko co tat ca gia tri la so nguyen to"
        );
    }

    public static void Bai2c() {
        Scanner sc = new Scanner(System.in);
        System.out.print("--- Bai 2c: Nhap so so luong phan tu co trong mang: ");

        int n = sc.nextInt();
        int[] arr = NhapGiaTriTrongMang(n);

        boolean checkValid = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                checkValid = false;
                break;
            }
        }

        System.out.println(checkValid
                ? "Mang nay la mang tang dan"
                : "Mang nay khong phai la mang tang dan"
        );
    }

    public static void Bai3a() {
        Scanner sc = new Scanner(System.in);
        System.out.print("--- Bai 3a: Nhap so so luong phan tu co trong mang: ");

        int n = sc.nextInt();
        int[] arr = NhapGiaTriTrongMang(n);

        int countValid = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 4 == 0 && arr[i] % 5 != 0) {
                countValid++;
            }
        }

        System.out.println(countValid == 0
                ? "Mang nay khong co gia tri nao chia het cho 4 && ko chia het cho 5"
                : ("Mang nay co [" + countValid + "] gia tri chia het cho 4 && ko chia het cho 5")
        );
    }

    public static void Bai3b() {
        Scanner sc = new Scanner(System.in);
        System.out.print("--- Bai 3b: Nhap so luong phan tu co trong mang: ");

        int n = sc.nextInt();
        int[] arr = NhapGiaTriTrongMang(n);

        int total = 0;
        for (int i = 0; i < n; i++) {
            if (isNguyenTo(arr[i])) {
                total = total + arr[i];
            }
        }

        System.out.println(total == 0
                ? "Mang nay ko co gia tri nao la so nguyen to de tinh tong"
                : ("Tong cac so nguyen to co trong mang la: " + total)
        );
    }



    public static int[] NhapGiaTriTrongMang(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.format("arr[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static boolean isNguyenTo(int n){
        boolean check = false;
        if(n<2){
            check = false;
        }
        else if (n == 2){
            check = true;
        }
        else {
            check = true;
            for (int i = 2; i<n ;i++){
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
}
