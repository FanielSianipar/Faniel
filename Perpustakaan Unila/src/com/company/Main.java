package com.company;

// Buku
class Buku{
    String judulBuku, penerbit;
    int tahunTerbit;
    Peminjam orangPeminjam;

    //Method
    void dataPeminjam(Peminjam orangPeminjam){
        this.orangPeminjam = orangPeminjam;
    }

    // Constructor
    Buku(String judulBuku, String penerbit, int tahunTerbit){
        this.judulBuku = judulBuku;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }
    void dataBuku(){
        System.out.println("Judul Buku: " + judulBuku);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println(" ");
        orangPeminjam.dataPeminjam();
    }
}


// Peminjam
class Peminjam{
    String namaPeminjam, jabatan;
    int nomorKartu;

    //Constructor
    Peminjam(String namaPeminjam, String jabatan, int nomorKartu){
        this.namaPeminjam = namaPeminjam;
        this.jabatan = jabatan;
        this.nomorKartu = nomorKartu;
    }

    // Method
    void dataPeminjam(){
        System.out.println("Nama Peminjam: " + namaPeminjam);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Nomor Kartu Perpustakaan: " + nomorKartu);
    }
}


public class Main {

    public static void main(String[] args) {
	   Buku sains = new Buku("Buku Mahir Praktikum Biologi", "Priya Santosa", 2018);

       Peminjam buku = new Peminjam("Faniel", "Mahasiswa", 201506);

       sains.dataPeminjam(buku);

       sains.dataBuku();
    }
}
