
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
public class LuasSegiEmpat {
    public static void main(String[] args) {
        int p, l, luas;
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang : ");
        p = sc.nextInt();
        System.out.print("Lebar : ");
        l = sc.nextInt();
        luas = p*l;   
        System.out.println("Luas : "+luas);
    }
}
