/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

import java.util.Scanner;

/**
 *
 * @author Vina
 */
public class Pengulangan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputan;
        System.out.print("Masukkan inputan : ");
        inputan = sc.nextInt();

        for (int i = 0; i < inputan-1; i++) {
            for (int j = 0; j < i; j++) { //j disini akan kembali ke 0
                System.out.print(j);
            }
            System.out.println(i); // println itu mencetak lalu enter
        }

    }

}
