import java.util.stream.IntStream;

public class PrimeTest {
    public static void main(String[] args) throws InterruptedException {
        int[] a = IntStream.range(1, 999).toArray();
        //int [] a = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int numThreads = 2;
        String result = "";

        int s = (a.length) / numThreads;
        int n = a.length;

        PrimeThread threads[] = new PrimeThread[numThreads];

        int init = -1, end = 1;

        for (int i = 0; i < numThreads; i++) {
            init = i * s;
            end = (i < numThreads - 1) ? ((i + 1) * s - 1) : (n-1);
            threads[i] = new PrimeThread("T" + i, a, init, end);
            threads[i].start();
        }
        for(int i = 0; i < numThreads; i++){
            threads[i].join();
            result += threads[i].getPrime();
        }

        System.out.println(result);

    }
}
