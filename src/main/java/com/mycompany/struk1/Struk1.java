/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.struk1;

import java.util.*;

/**
 *
 * @author 62852
 */
public class Struk1 {

    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        
        System.out.println("------------------------------------------------");
        System.out.println("           Kharisma Agung Plaza< KAP>");
        System.out.println("             Promo Belanja Berhadiah");
        System.out.println("        Khusus Pembelian 5 Barang Pertama ");
        System.out.println("         Dengan Harga Minimum Rp 10000,00");
        System.out.println("----------------------------------------------- ");
        
        System.out.print("Masukkan nama pembeli : ");
        String nama=input.nextLine();
        System.out.println();
        
        int []harga=new int[5];
        for(int i=0;i<5;i++){
            System.out.print("Masukkan harga barang ke-"+(i+1)+"    : ");
            harga[i]=input.nextInt();
        }
        int totalHarga=0;
        for(int i=0;i<5;i++){
            totalHarga+=harga[i];
        }
        System.out.println("Total harga pembelian atas nama "+nama+" adalah Rp "+ totalHarga);
        System.out.println("");
        
        if(totalHarga>=100000){
            System.out.println("Selamat....\nAnda mendapatkan hadiah 1 buah mug cantik");
        }
        System.out.println("----------------------------------------------- ");
        System.out.println("\t\tTerima Kasih\nAnda sudah belanja di Kharisma Agung Plaza");
    }
}
