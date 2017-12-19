package pl.fyv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Podaj zakres petli: ");
        Engine e = new Engine(s.nextInt());

        e.FizzBuzzGame();
    }
}
