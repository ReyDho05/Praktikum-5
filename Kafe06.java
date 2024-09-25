import java.util.Scanner;
public class Kafe06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean keanggotaan;
        int jmlkopi, jmlteh, jmlroti;
        double hargakopi=12000, hargateh=7000, hargaroti=20000, total, nominalBayar;
        float diskon=10/100f;
        System.out.print("Masukkan keanggotan (true/false): ");
        keanggotaan= sc.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlkopi = sc.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlteh= sc.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlroti =sc.nextInt();
        total =(jmlkopi*hargakopi) +(jmlteh *hargateh)+ (jmlroti* hargaroti);
        nominalBayar = total-(diskon *total);
        nominalBayar = (int) nominalBayar;
        if (keanggotaan) {
            diskon=0.1f;
            System.out.println("Selamat anda mendapatkan diskon 10%");
        } else {
            System.out.println("Mohon maaf anda belum bisa mendapatkan diskon");
        }
        System.out.println("Keanggotaan pelanggan " + keanggotaan); 
        System.out.println("Item pembelian " +  jmlkopi + " kopi, " +  jmlteh +" teh, "+jmlroti+ " roti");
        System.out.println("Nominal bayar Rp" + nominalBayar);
    }
}