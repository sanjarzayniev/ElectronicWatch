package org.example;

import java.util.Scanner;

public class ElectronicWatch {
    // public static void putZeroForMinute(int minutes) {
    //     if (minutes <= 9 && minutes >= 0) {
    //         System.out.println("0");
    //     } else {
    //         System.out.println("");
    //     }
    // }

    // public static void putZeroForSecond(int seconds) {
    //     if (seconds <= 9 && seconds >= 0) {
    //         System.out.println("0");
    //     } else {
    //         System.out.println("");
    //     }
    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSeconds = scanner.nextInt();
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds - hours * 3600) / 60;
        int seconds = totalSeconds - 3600 * hours - 60 * minutes;
        int days = hours / 24;
        if (hours >= 24) {

            hours = hours - 24*days; 
        }

        System.out.println(hours + ":" + minutes + ":" + seconds);
        scanner.close();
    }
}
