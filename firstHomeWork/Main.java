/**
 * That class outputs numbers from 1 to 100.
 * If the number is divisible by three without a remainder, then the output will be "Fizz".
 * If the number is divisible by five without a remainder, then the output will be "Buzz".
 * If the number is divisible by three and five without a remainder, then the output will be "FizzBuzz".
 *
 * @author MishaSabre (Sablin Mikhail)
 */


public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++){

            if ( (i % 5 == 0) & (i % 3 == 0)){
                System.out.println("FizzBuzz");
            }else if( i % 3 == 0){
                System.out.println("Fizz");
            }else if( i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }

        }
        /*
        In cycle from 1 to 100 conditions are checked.
        It first checks if i is divisible by three and five without a remainder,
        because this solution cannot be reached if it is not the first
         */
    }
}
