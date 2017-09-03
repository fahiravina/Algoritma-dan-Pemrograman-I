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
public class Percabangan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputan;
        System.out.println("Program Bulan Masehi");
        System.out.print("Bulan ke : ");
        inputan = sc.nextInt();

        switch (inputan) {
            case 1:
                System.out.println("Bulan ke 1 adalah Januari");
                break;
            case 2:
                System.out.println("Bulan ke 2 adalah Februari");
                break;
            case 3:
                System.out.println("Bulan ke 3 adalah Maret");
                break;
            case 4:
                System.out.println("Bulan ke 4 adalah April");
                break;
            case 5:
                System.out.println("Bulan ke 5 adalah Mei");
                break;
            case 6:
                System.out.println("Bulan ke 6 adalah Juni");
                break;
            case 7:
                System.out.println("Bulan ke 7 adalah Juli");
                break;
            case 8:
                System.out.println("Bulan ke 8 adalah Agustus");
                break;
            case 9:
                System.out.println("Bulan ke 9 adalah September");
                break;
            case 10:
                System.out.println("Bulan ke 10 adalah Oktober");
                break;
            case 11:
                System.out.println("Bulan ke 11 adalah November");
                break;
            case 12:
                System.out.println("Bulan ke 12 adalah Desember ");
                break;
            default:
                System.out.println("Tidak ada bulan yang ke " + inputan);

        }

    }

}
