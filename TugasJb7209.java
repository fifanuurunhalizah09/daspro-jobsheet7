
import java.util.Scanner;

public class TugasJb7209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;

    do {
        System.out.println("jenis kendaraan");
        System.out.println("1 mobil");
        System.out.println("2 motor");
        System.out.println("0 keluar");
        System.out.print("Masukkan Jenis Kendaraan: ");
        jenis = sc.nextInt();

        if (jenis == 1 || jenis == 2) {
            System.out.print("Masukkan Durasi: ");
            durasi = sc.nextInt();
            if (durasi > 5) {
                total += 12500;
            } else if (jenis == 1) {
                total += durasi * 3000;
            } else if (jenis == 2) {
                total += durasi * 2000;
            }
        } 
    } while (jenis != 0);
    System.out.println("Total bayar parkir: " + total);
    }

}
