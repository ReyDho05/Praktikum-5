import java.util.Scanner;
public class Siakad06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String nama, nim, nilaiHuruf = "", kualifikasi = "";
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir, nilaiUTS;
        System.out.print("Masukkan Nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM :");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan Nomor Absen : ");
        absen = sc.nextByte();
        System.out.print("Masukkan Nilai Kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        nilaiUjian = sc.nextDouble();
        nilaiAkhir = (nilaiKuis*0.2)+ (nilaiTugas*0.15)+(nilaiUTS*0.3) + (nilaiUjian*0.35);
       double nilaiSetara = 0;
       
       if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
           nilaiHuruf = "A";
           nilaiSetara = 4;
           kualifikasi = "Sangat Baik";
       } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
           nilaiHuruf = "B+";
           nilaiSetara = 3.5;
           kualifikasi = "Lebih dari Baik";
       } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
           nilaiHuruf = "B";
           nilaiSetara = 3;
           kualifikasi = "Baik";
       } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
           nilaiHuruf = "C+";
           nilaiSetara = 2.5;
           kualifikasi = "Lebih dari Cukup";
       } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
           nilaiHuruf = "C";
           nilaiSetara = 2;
           kualifikasi = "Cukup";
       } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
           nilaiHuruf = "D";
           nilaiSetara = 1;
           kualifikasi = "Kurang";
       } else if (nilaiAkhir <= 39) {
           nilaiHuruf = "E";
           nilaiSetara = 0;
           kualifikasi = "Gagal";
       }
       
   System.out.print("Mahasiswa dengan nama " + nama + " (NIM "+ nim + ") ");
   System.out.println(" Kelas  " + kelas + " Nomor Absen  "+absen );
   System.out.println("Nilai Akhir : " + nilaiAkhir);
   System.out.println("Nilai Akhir Huruf : " + nilaiHuruf);
   System.out.println("Kualifikasi : "+ kualifikasi);
            


    }
}