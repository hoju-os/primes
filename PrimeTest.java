public class PrimeTest {
    public static void main(String[] args) {
        int end = 10;

        for(int test = end-1; test > 1; test--) {
            if (end % test == 0){
                System.out.println("not a prime");
                break;
        }
            else
                System.out.println("is a prime");

        }
    }
}