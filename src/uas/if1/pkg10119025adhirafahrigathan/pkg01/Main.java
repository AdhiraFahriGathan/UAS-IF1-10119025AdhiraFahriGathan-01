/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if1.pkg10119025adhirafahrigathan.pkg01;

import java.util.Scanner;

/**
//NIM : 10119025
//NAMA : ADHIRA FAHRI GATHAN
//KELAS : IF1
//TANGGAL : 20 FEBRUARI 2021
//NO SOAL : 01
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        double nilai;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nilai Akhir Anda : ");
        nilai = scanner.nextDouble();

        IndeksNilai indeks = new IndeksNilai();
        System.out.println("Indeks Anda Adalah " + indeks.Addindex(nilai));
    }
}
