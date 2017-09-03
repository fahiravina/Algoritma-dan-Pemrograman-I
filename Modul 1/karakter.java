
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
public class karakter {

    public static void main(String[] args) {
        char Ch;
        String S;

        Scanner sc = new Scanner(System.in);
        System.out.println("Char: ");
        S = sc.nextLine();
        Ch = S.charAt(0);
        System.out.println("Ch : " + Ch);

    }

}
