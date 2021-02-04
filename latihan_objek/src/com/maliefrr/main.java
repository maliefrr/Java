package com.maliefrr;

class Mahasiswa{
    String nama;
    String nim;


    Mahasiswa(String nama , String nim){
        this.nama = nama;
        this.nim = nim;
    }

    void show(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
    }


}


public class main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Alief","F1G119031");
        mahasiswa1.show();
        

    }
    
}
