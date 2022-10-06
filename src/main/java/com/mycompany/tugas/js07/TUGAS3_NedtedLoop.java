package com.mycompany.tugas.js07;
import java.util.Scanner;

/**
 *
 * @author 21343005_EGI YONI SANDRA
 */

public class TUGAS3_NedtedLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Baris maksimal = ");
        int max = in.nextInt();
                
        int i, j;
        
        for (i = 1; i <= max; i++){
            for (j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
