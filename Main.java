import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.println("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.println("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.println("Masukkan Harga Barang: ");
            double hargaBarang = Double.parseDouble(scanner.nextLine());

            System.out.println("Masukkan Jumlah Beli: ");
            int jumlahBeli = Integer.parseInt(scanner.nextLine());

            Transaksi transaksi = new Transaksi(kodeBarang, namaBarang, hargaBarang, noFaktur, jumlahBeli);
            transaksi.hitungTotal();

            System.out.println("\n--- Faktur Pembelian ---");
            System.out.println(transaksi.displayInvoice());

        } catch (NumberFormatException e) {
            System.out.println("Input salah! Pastikan harga barang adalah angka dan jumlah beli adalah bilangan bulat");
        } finally {
            scanner.close();
        }
    }
}
