/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;
import Beasiswa.Mahasiswa;
import Beasiswa.Pelajar;
import Beasiswa.InputNilai;


/**
 *
 * @author USER
 */
public class Main {
    static int umur;

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("---------------------------------------");
        System.out.println("|     SELEKSI BEASISWA PENDIDIKAN     |");
        System.out.println("---------------------------------------");
        System.out.println("Menu Utama : ");
        System.out.println(" 1. Beasiswa Pelajar");
        System.out.println(" 2. Beasiswa Mahasiswa");
        System.out.print("Pilih Jenis Beasiswa : ");
        int pilih = input.nextInt();
        
        System.out.println("\n-------- FORMULIR BEASISWA --------");
        Scanner data = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        System.out.print("  Input Nama  : ");
        String nama = inputString.nextLine();
        
        System.out.print("  Umur        : ");
        umur = input.nextInt();
        
        
        
        if (pilih == 1 && umur >= 16 && umur <=24 ){
            System.out.println("\n----Penilaian----");
            System.out.println("Keterangan: Nilai yang valid berada di antara 0-100");
            System.out.print("Input Nilai Struktur dan Konten Esai : ");
            double tesA = data.nextDouble();
            System.out.print("Input Nilai Teknik Visualisasi : ");
            double tesB = data.nextDouble();
            System.out.print("Input Nilai Kemampuan Design Thinking : ");
            double tesC = data.nextDouble();
            Pelajar pelajar = new Pelajar(nama,tesA,tesB,tesC);
            do{
                System.out.println("\n-------- SUB MENU--------");
                System.out.println(" 1. Tampilkan Hasil");
                System.out.println(" 2. Ubah Nilai Pendaftar");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih : ");
                int pilihMenu = input.nextInt();
                if (pilihMenu == 1){
                    System.out.println("Nilai Akhir : " + pelajar.hitungNilaiTotal());
                    System.out.println("Keterangan : " + pelajar.keterangan());
                }
                else if (pilihMenu == 2){
                    System.out.print("Input Nilai Struktur dan Konten Esai : ");
                    pelajar.inputA(input.nextDouble());
                    System.out.print("Input Nilai Teknik Visualisasi : ");
                    pelajar.inputB(input.nextDouble());
                    System.out.print("Input Nilai Kemampuan Design Thinking : ");
                    pelajar.inputC(input.nextDouble());
                    
                }
                else {
                    break;
                }
            }while(true);
        }
        else if (pilih == 2 && umur >= 16 && umur <=24 ){
            System.out.println("\n---- Penilaian ----");
            System.out.println("Keterangan: Nilai yang valid berada di antara 0-100");
            System.out.print("Input Nilai Struktur dan Konten Jurnal : ");
            double tesA = data.nextDouble();
            System.out.print("Input Nilai Relevansi Data : ");
            double tesB = data.nextDouble();
            System.out.print("Input Nilai Kemampuan Problem Solving : ");
            double tesC = data.nextDouble();
            Mahasiswa mhs = new Mahasiswa(nama, tesA, tesB, tesC);
            do{
                System.out.println("\n-------- SUB MENU --------");
                System.out.println(" 1. Tampilkan Hasil");
                System.out.println(" 2. Ubah Nilai Pendaftar");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih : ");
                int pilihMenu = input.nextInt();
                
                if(pilihMenu == 1){
                    System.out.println("Nilai Akhir : " + mhs.hitungNilaiTotal());
                    System.out.println("Keterangan : " + mhs.keterangan());
                }
                else if (pilihMenu == 2){
                    System.out.print("Input Nilai Struktur dan Konten Jurnal : ");
                    mhs.inputA(input.nextInt());
                    System.out.print("Input Nilai Relevansi Data : ");
                    mhs.inputB(input.nextInt());
                    System.out.print("Input Nilai Kemampuan Problem Solving : ");
                    mhs.inputC(input.nextInt());
                }
                else {
                    break;
                }
            }while(true);
        }
        else {
            System.out.print("Anda tidak bisa mendaftar! ");
        }
    
        }
}
