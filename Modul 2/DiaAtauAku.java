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
public class DiaAtauAku {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputan;
        System.out.println("Pilih dia atau aku?");
        System.out.print("Aku pilih : ");
        inputan = sc.next();

        if (inputan.equalsIgnoreCase("dia")) {
            System.out.println("Lebih baik aku pergi jauh dari hidupmu");
        } else if (inputan.equalsIgnoreCase("kamu")) {
            System.out.println("Aku pasti akan lebih baik dari dia");
        } else {
            System.out.println("Hidup itu pilihan kamu harus memilih");
        }
    }

}
