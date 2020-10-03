package com.craftmojo;

import java.util.Scanner;

public class Main {

    public static void main(String args[])
    {
        //deklarasi variabel untu kalimat yang akan diinput dan hasil kalimat yang dibalik
        String kalimat, balik = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan kalimat: ");
        kalimat = in.nextLine();
        //deklarasi untuk menyimpan panjang kalimat yang telah diinput
        int panjang = kalimat.length();
        /*lakukan perulangan sebanyak panjang kalimat -1 dan dibuat terbalik
        ambil kata per index i tiap perulangan
         */
        for ( int i = panjang - 1; i >= 0; i-- ) {
            balik = balik + kalimat.charAt(i);
        }
        /*
        lakukan perbandingan antara kalimat inputan dengan kalimat yang telah dibalik, jika tidak ada perbedaan maka output COOL,
        Jika terdapat perbedaan makan output BAD. Perbandingan dilakukan dengan tidak memerhatikan besar kecil huruf
         */
        if(kalimat.equalsIgnoreCase(balik)){
            System.out.println("COOL");
        }else{
            System.out.println("BAD");
        }
    }
}
