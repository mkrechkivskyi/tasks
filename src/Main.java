import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
     stackFullOut(new Random().nextInt(), new Random().nextInt(), new Random().nextInt(),new Random().nextInt(),new Random().nextInt(),new Random().nextInt(),new Random().nextInt(),new Random().nextInt(),new Random().nextInt());
    }

    static void heapFullOut(List<StringBuilder> builders){
        int[] ints = new int[Integer.MAX_VALUE];
    }

    static void  stackFullOut(int a, int b, int c, int d, int e, int f, int g, int h, int i){
        Random random = new Random();
        stackFullOut(random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt());
    }
}