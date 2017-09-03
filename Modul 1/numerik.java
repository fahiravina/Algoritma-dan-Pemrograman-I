
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
public class numerik {

    public static void main(String[] args) {
        float f;
        double d;
        long l;
        int i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bilangan integer: ");
        i = sc.nextInt();
        System.out.println("i = " + i);

        System.out.println("Bilangan long integer (x > 34.000): ");
        l = sc.nextLong();
        System.out.println("l = " + l);

        System.out.println("Bilangan float/desimal: ");
        f = sc.nextFloat();
        System.out.println("f = " + f);

        System.out.println("Bilangan double: ");
        d = sc.nextDouble();
        System.out.println("d = " + d);
    }

}
