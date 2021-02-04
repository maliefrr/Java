package com.maliefrr;

class Mahasiswa{
    String nama;
    String Stambuk;
    String Prodi;

    Mahasiswa(String inputnama , String inputstambuk , String inputprodi){
        nama = inputnama;
        Stambuk = inputstambuk;
        Prodi = inputprodi;

        System.out.println(nama);
        System.out.println(Stambuk);
        System.out.println(Prodi);

    }
}


public class main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Alief", "F1G119031" , "Ilmu Komputer");
    }
    
}
