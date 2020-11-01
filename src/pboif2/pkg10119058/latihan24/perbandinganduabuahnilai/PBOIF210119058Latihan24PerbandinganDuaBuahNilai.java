/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk membandingkan dua buah nilai
 */
public class PBOIF210119058Latihan24PerbandinganDuaBuahNilai {

    
    public static void banding(int nilai1, int nilai2){
        if(nilai1==nilai2){
            System.out.println("Hasil : "+nilai1+" Sama dengan "+nilai2);
        }else if(nilai1>nilai2){
            System.out.println("Hasil : "+nilai1+" Lebih besar dari "+nilai2);
        }else{
            System.out.println("Hasil : "+nilai1+" Lebih Kecil dari "+nilai2);
        }
    }
    
    public static void main(String[] args) {
     int nilai1;
        int nilai2;
        String ulang;
        boolean kondisi;
        
        System.out.println("=====Program Perbandingan Nilai=====");
            Scanner input = new Scanner(System.in);
            
        do{   
            System.out.print("Masukkan nilai pertama : ");
            nilai1 = input.nextInt();
            System.out.print("Masukkan nilai keuda    : ");
            nilai2 = input.nextInt();
            banding(nilai1,nilai2);
            System.out.println("");
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            ulang = input.next();
            kondisi = "Ya".equals(ulang);
        } while(kondisi == true);
    }
    
}