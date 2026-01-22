package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class IterationFindNumbFibracco {
    public static void findNumber(int numb) {
        int n1 = 0, n2 = 1;

        for (int i = 1; i <= numb; i++) {
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
        System.out.println("Equals:" + n1);
    }

    public static void main(String[] args) {
findNumber(6);
    }
    }

