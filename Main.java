package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter color code");
        int number=in.nextInt();
        Color userInputColor = new Color(number);
        System.out.println("Ваш введёный код цвета " + userInputColor.getNumber() + " соответствует цвету "
        + userInputColor.getName());
    }
}
