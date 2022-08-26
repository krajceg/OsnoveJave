package Vezbe;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Jelkica {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi n");
        int n = s.nextInt();
        int m = n * 2 - 1;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j < m; j++) {
                if (j >= m/2 - i && j <= m/2 + i)
                    System.out.print("*");
                else
                    System.out.print(" ");                     
            }
            System.out.println();
        }
        
        // 2223222
        // 2233322
        // 2333332
        // 3333333
        
        // n=4
        // m=7      
        // 00 01 02 03 04 05 06
        // 10 11 12 13 14 15 16
        // 20 21 22 23 24 25 26
        // 30 31 32 33 34 35 36
        
        //// m=9
        //// 00 01 02 03 04 05 06 07 08
        
        // (n,m) = (3,5),(4,7),(5,9),(6,11),(7,13)
    }
}
