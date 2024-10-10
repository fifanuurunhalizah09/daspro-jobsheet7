
import java.util.Scanner;

public class TugasJb709 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTiket, hargaTiket = 50000;
        double diskon = 0.0, totalHarga = 0;

    do {
        System.out.print("Masukkan jumlah tiket yang dibeli. (ketik '0' jika keluar): ");
        jumlahTiket = sc.nextInt();
        if (jumlahTiket < 0) {
            System.out.println("input tidak valid");
            continue;
        }
        if (jumlahTiket > 4 && jumlahTiket <11) {
            diskon = 0.1;
        } else if (jumlahTiket > 10) {
            diskon = 0.15;
        }else{
            diskon=0;
        }
        totalHarga += (jumlahTiket * hargaTiket) - (jumlahTiket * hargaTiket *diskon);
    } while (jumlahTiket !=0);
        System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
    }

}
