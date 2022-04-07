/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beasiswa;

import Seleksi.Seleksi;

/**
 *
 * @author USER
 */
public class Mahasiswa extends InputNilai implements Seleksi{

    public Mahasiswa(String nama, double tesA, double tesB, double tesC) {
        super(nama, tesA, tesB, tesC);
    }
    
    public void inputA(double tesA) {
        this.tesA = tesA;
    }

    public void inputB(double tesB) {
        this.tesB = tesB;
    }

    public void inputC(double tesC) {
        this.tesC = tesC;
    }
     
    @Override
    public double hitungNilaiTotal() {
       return (0.6 * super.tesA) + (0.25 * super.tesB) + (0.15 * super.tesC);
    }

    @Override
    public String keterangan() {
        if(this.hitungNilaiTotal() >= 87.5) 
            return "LULUS\nSelamat kepada " + this.nama + " telah DITERIMA sebagai Peserta Beasiswa Mahasiswa\n";
        else 
            return "GAGAL\nMohon maaf kepada  " + this.nama + " telah DITOLAK sebagai Peserta Beasiswa Mahasiswa\n";
    }
}


