package SOTI_probs;

//Calculate the angle between hour hand and minute hand
//Leetcode 1344

import java.util.Scanner;

public class Angle_clockhands {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minutes = scanner.nextInt();
        float h = (hour%12 +(float)minutes/60)*30;
        float m = minutes*6;
        float angle = Math.abs(h-m);
        if(angle>180)
            angle = 360-angle;
        System.out.println(angle);
    }
}
