import java.util.Scanner;
//File: TowerOfHanoi.java
//Author: Yandel Colón Rivera
//Date: 2/2/2026
//Class: COMP 2900 Data Structure
//Description: A program following the logic of a Tower of Hanoi. Based on the number of disk it moves a set of disks.

public class TowerOfHanoi {

    static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod){
        if(n == 0){
            return;
        }
        towerOfHanoi(n-1, fromRod, toRod, auxRod);
        System.out.println("Move from " + fromRod + " to " + toRod);
        towerOfHanoi(n-1, auxRod, fromRod, toRod);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks: ");
        int n = sc.nextInt();
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}
