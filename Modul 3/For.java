/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

import java.util.Scanner;

/**
 *
 * @author Vina
 */
public class For {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputan;
        System.out.println("Pengulangan");
        System.out.print("Berapa kali pengulangan : ");
        inputan = sc.nextInt();

        for (int i = 0; i <= inputan; i++) {
            System.out.println("Pengulangan ke " + i);
        }

        System.out.println("===============================");

        for (int i = 0; i > inputan; i--) {
            System.out.println("Pengulangan ke " + inputan);
        }
    }

}
