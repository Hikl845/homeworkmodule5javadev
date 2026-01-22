package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RecursionFindNumb {

    public static int findNumb(int n) {
        // базові випадки
        if (n == 0) return 0;
        if (n == 1) return 1;

        // рекурсивний виклик
        return findNumb(n - 1) + findNumb(n - 2);
    }

    public static void main(String[] args) {
        int numb = findNumb(6);
        System.out.println(numb);
    }
}
