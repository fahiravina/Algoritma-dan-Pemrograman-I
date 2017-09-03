/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

import java.util.Scanner;

/**
 *
 * @author Vina
 */
public class While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int inputan;
        System.out.println("Pengulangan");
        System.out.print("Berapa kali pengulangan : ");
        inputan = sc.nextInt();

        while (i <= inputan) {
            System.out.println("While ke " + i);
            i++;
        }

        System.out.println("===========================");

        while (i > inputan) {
            System.out.println("While ke " + inputan);
            i--;
        }
    }
}
