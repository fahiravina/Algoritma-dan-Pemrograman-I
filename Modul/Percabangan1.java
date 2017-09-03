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
public class Percabangan1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bilangan;

        System.out.print("Masukkan bilangan : ");
        bilangan = sc.nextInt();

        if (bilangan % 2 == 0 && bilangan != 0) {
            System.out.println(bilangan + " adalah bilangan genap");
        } else if (bilangan == 0) {
            System.out.println(bilangan + " itu genap atau ganjil yah?");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil");
        }

    }

}
