class PrimeNumber
{
    public static void main (String[] args)
    {
        int num =0;
        String  primeNumbers = "";

        /*
            The variable 'i' is the number being tested
         */

        for (int i = 1; i <= 10; i++)
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
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }
}