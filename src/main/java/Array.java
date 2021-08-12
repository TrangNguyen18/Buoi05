public class Array {
    public static void main(String[] args) {
   int [] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.format("%d ," , arr[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println(arr[3]);
        System.out.println();
        int j = 0;
        while (j < arr.length){
            System.out.print(arr [j] + ", ");
            j++;
        }
        System.out.println();

        for (int a : arr){
            System.out.print(a + ", ");
        }
    }
}
