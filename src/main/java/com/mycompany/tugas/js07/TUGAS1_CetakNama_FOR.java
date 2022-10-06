package com.mycompany.tugas.js07;
import java.util.Scanner;

/**
 *
 * @author 21343005_EGI YONI SANDRA
 */

public class TUGAS1_CetakNama_FOR {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int i;
    
    System.out.print("Masukkan nama Anda : ");
    String nama = in.nextLine();
    
        for (i = 0; i < 100; i++)
        {
            System.out.println(nama);
        }
    }
}
