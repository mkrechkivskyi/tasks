package sort;

public class Table {

    public static void main(String[] args) {
        String[] arr = {"aaaa", "b", "c", "ddddd", "e", "f"};
        printIntoTable(arr);
    }

    static void printIntoTable(String[] arr) {
        int max = findMax(arr);
        int spaceCount = max + 2;

        for (int i = 0; i < arr.length; i++) {
            String line = "";
            for (int j = 0; j <= 5; j++) {
                String current = arr[i];
                int length = current.length();
                int space = spaceCount - length;
                line = line + current + " ".repeat(space);
            }
            System.out.println(line);

        }

    }

   static int findMax(String[] arr) {
        int max = arr[0].length();
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i].length() > max) {
                max = arr[i].length();
            }
        }
        return max;
    }
}
