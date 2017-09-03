/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

import java.util.Scanner;

/**
 *
 * @author Vina
 */
public class IndeksNilaiAkhir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputan;
        System.out.print("Masukkan nilai akhir : ");
        inputan = sc.nextInt();

        if (inputan > 85) {
            System.out.println("Indeks Nilai Akhir A");
        } else if (inputan > 75) {
            System.out.println("Indeks Nilai Akhir B");
        } else if (inputan > 65) {
            System.out.println("Indeks Nilai Akhir C");
        } else if (inputan > 55) {
            System.out.println("Indeks Nilai Akhir D");
        } else {
            System.out.println("Indeks Nilai Akhir E");
        }
    }

}
