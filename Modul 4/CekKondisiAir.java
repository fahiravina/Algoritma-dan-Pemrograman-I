/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz_Easy;

import java.util.Scanner;

/**
 *
 * @author Vina
 */
public class CekKondisiAir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputan;
        System.out.println("CEK KONDISI AIR");
        System.out.print("Nilai suhu : ");
        inputan = sc.nextInt();

        if (inputan <= 0) {
            System.out.println("Kondisi air membeku");
        } else if (inputan < 100 && inputan > 0) {
            System.out.println("Konsisi air mencair");
        } else {
            System.out.println("Kondisi air menguap");
        }
    }

}
