public class Array {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 9, 6};
        for (int i = 0; i < arr1.length; i++) {
            System.out.format("%d ", arr1[i]);
        }
        ;
        System.out.println();
        int[] arr2 = new int[5];
        arr2[0] = 1;
        arr2[1] = 9;
        arr2[2] = 6;
        arr2[3] = 189;
        arr2[4] = 0;
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            System.out.print(" ");
        }
        ;
        System.out.println();
        for (int n : arr2) {
            System.out.print(n);
            System.out.print(" ");
        }
        ;
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.format("%d ", arr2[i]);
        };

    }
}