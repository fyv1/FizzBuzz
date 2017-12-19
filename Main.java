package pl.fyv;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Podaj zakres petli: "); int n = s.nextInt();

        ArrayList<String> list = new ArrayList<String>();



        for(int i=1;i<n;i++) {
            list.add(String.valueOf(i));
            if(i % 3 == 0) { list.remove(i); list.add(i, "Fizz"); }
            if(i % 5 == 0) { list.remove(i); list.add(i, "Buzz"); }
            if(i % 3 == 0 && i % 5 == 0) { list.remove(i); list.add(i, "FizzBuzz"); }
        }

            System.out.println(list);

    }
}
