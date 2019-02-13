public class PrimeThread extends Thread {
    private int end, init;
    int [] v1;
    String name;

    public PrimeThread(String name, int [] v1, int init, int end){
        setName(name);
        this.v1 = v1;
        this.init = init;
        this.end = end;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName() + " [" + init + "," + end + "] started!");
        int num =0;
        String  primeNumbers = "";

        /*
            The variable 'i' is the number being tested
         */

        for (int i = 1; i <= end; i++)
        {
            /* The 'counter' variable counts the number of factors.
               If the number being tested has MORE THAN 2 FACTORS
               that number can not be a PRIME NUMBER.
             */
            int counter=0;                  //counter must be initialized to zero for each new dividend.
            for(num =i; num>=1; num--)      //num is the divisor.
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from " + init + " to " + end + " are :");
        System.out.println(primeNumbers);
    }

}
