package sort;

public class Buble {

    static int[] insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++){
            for(int j = i; j > 0; j--) {
                int right = arr[j];
                int left = arr[j - 1];
                if (right < left) {
                    arr[j] = left;
                    arr[j - 1] = right;
                }
            }
        }
            return arr;
        }

    public static void main(String[] args) {
        int[] arr = {22, 3, 7, 2, 54, 1, 0};
        int[] index = insertSort(arr);
        System.out.println(index.toString());

    }
}
