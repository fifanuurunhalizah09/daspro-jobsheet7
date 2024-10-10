
import java.util.Scanner;

public class SiakadFor09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int jumlahMahasiswa = 10, jumlahMhsLulus = 0, jumlahMhsTidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                jumlahMhsLulus++;
            } else {
                jumlahMhsTidakLulus++;
            }
        }
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
        System.out.println("Jumlah Mahasiswa Lulus: " + jumlahMhsLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + jumlahMhsTidakLulus);
    }
}