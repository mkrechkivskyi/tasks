package sort.hw;

public class BubbleSort {


    static void bubbleSort(int arr[]) {
        int size = arr.length;
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size - i-1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] toSort = new int[] {22, 4, 7, 5, 1};
        bubbleSort(toSort);
    }
}
