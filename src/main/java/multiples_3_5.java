/**
 * Created by pranaviddamsetty on 4/10/16.
 */

/*If we list all the natural numbers below 10 that are multiples of 3 or 5,
we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.*/


public class multiples_3_5 {

    public static void main(String[] args)
    {

        int x = 0;
        int y = 0;
        int z = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        while (x < 999 ) {

            x = x + 3; // multiples of 3
            a = a + x;

        }

        while (y < 995) {

            y = y + 5; // multiples of 5
            b = b + y;
        }


        while (c < 990) {

            c = c + 15;
            d = d + c;
        }

        
        z = a + b - d;

        System.out.println( z);
    }

}
