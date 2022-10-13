package com.mycompany.tugas.js07;
import java.util.Scanner;

/**
 *
 * @author 21343005_EGI YONI SANDRA
 */

public class TUGAS1_CetakNama_WHILE {
    public static void main(String[] args) {
        int i = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan nama Anda : ");
        String nama = in.nextLine();
        
        while (i <100)
        {
            System.out.println(nama);
            i++;
        }
    }
}
