
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vina
 */
public class Boolean {

    public static void main(String[] args) {
        float B1, B2;
        boolean Sama;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bil1 : ");
        B1 = sc.nextFloat();
        System.out.println("Bil2 : ");
        B2 = sc.nextFloat();

        Sama = (B1 != B2);
        System.out.println("B1 != B2 adalah : " + Sama);
        Sama = (B1 == B2);
        System.out.println("B1 == B2 adalah : " + Sama);
        Sama = (B1 < B2);
        System.out.println("B1 < B2 adalah : " + Sama);
        Sama = (B1 > B2);
        System.out.println("B1 > B2 adalah : " + Sama);
    }

}
