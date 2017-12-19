package pl.fyv;

import java.util.ArrayList;

public class Engine {
    private int zakres;

    Engine(int zakres) {
        this.zakres = zakres;
    }

    private ArrayList<String> list = new ArrayList<String>();

    public void FizzBuzzGame() {
        int n = this.zakres;

        if(validate(n)) {
            for (int i = 1; i <= n; i++) {
                list.add(String.valueOf(i));
                if (i % 3 == 0) {
                    list.add(i-1, "Fizz");
                    list.remove(i);
                }
               if (i % 5 == 0) {
                    list.add(i-1, "Buzz");
                   list.remove(i);
               }
                if (i % 3 == 0 && i % 5 == 0) {
                    list.add(i-1, "FizzBuzz");
                    list.remove(i);
                }
            }
            System.out.println(list);
        }
    }

    private boolean validate(int zakres) {
        try {
            range(zakres);
            isInteger(zakres);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private void range(int zakres) {
        if(zakres < 1) {
            throw new IllegalArgumentException("Zakres musi byc rowny 1 lub wiekszy!");
        }
    }

    private void isInteger(int zakres) {
        if(zakres != (int)zakres) {
            throw new IllegalArgumentException("");
         }
    }
}
