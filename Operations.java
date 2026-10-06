package Calculater;

import java.util.Scanner;

public class Operations {

    Scanner sc = new Scanner(System.in);

    public int getInputInt(String message) {
        System.out.println(message);
        return sc.nextInt();
    }

}