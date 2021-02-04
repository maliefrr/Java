package com.maliefrr;


// Membuat Kelas Pada Java
class Mahasiswa {
    String nama;
    int nim;

    Mahasiswa(String InputNama,int InputNIM){
        this.nama = InputNama;
        this.nim = InputNIM;

        System.out.println(nama);
        System.out.println(nim);

    }
}


public class Main {
    public static void main(String[] args) {
        // membuat object pada bahasa pemrograman Java
        Mahasiswa mahasiswa1 = new Mahasiswa("Napoleon Bonaparte",46788598);
    }
    
}
