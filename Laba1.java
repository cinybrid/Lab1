import java.lang.*;
import java.util.Random;


public class Laba1 {
    public static int factorial (int a) {
        int result = 1;
        for (int i = 2; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int mass[] = {1, 23, 21, 8}; //создан массив
        int sum = 0;

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + "\t"); //вывод массива
            sum += mass[i];
        }
        System.out.println("\nсумма через for = " + sum );

        int i = 0;
        sum = 0; //обнуляем сумму
        while (i != mass.length)
        {
            sum += mass[i];
            i++;
        }
        System.out.println("сумма через while = " + sum );

        i = 0;
        sum = 0;
        do {
            sum += mass [i];
            i++;
        } while (i!= mass.length);
        System.out.println("сумма через do while = " + sum );
        //////////////////////////////////// end of 1)

        for (int ind = 0; ind < args.length; ind++) {
            System.out.print(args[ind]);
        }
        //////////////////////////////////// end of 2)

        for (double ind = 1; ind < 11; ind++) {
            System.out.print (1/ind + "\t");
        }
        System.out.println("\n");
        //////////////////////////////////// end of 3)

        int[] array = new int [10];
        Random rn = new Random (); //random
        for (int u = 0; u < array.length; u++) {
            array [u] = rn.nextInt(10);
            System.out.print(array[u] + "\t");
        }
        System.out.println();
        int k;
        for (int u = 0; u < array.length; u++) { //sort
            for (int y = 0; y < array.length-u-1; y++) {
                if (array [y] > array [y+1]) {
                    k = array [y];
                    array [y] = array [y+1];
                    array [y+1] = k;
                }
            }
        }
        for (int u = 0; u < array.length; u++) //output
            System.out.print (array[u] + "\t");

        ///////////////////////////////////// end of 4)
        System.out.println ();
        int b = factorial(10);
        System.out.println("Факториал числа 10 = " + b);
        ///////////////////////////////////// end of 5)
    }

}