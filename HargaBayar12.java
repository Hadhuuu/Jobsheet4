import java.util.Scanner;
public class HargaBayar12 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String Merkbuku;
        int harga, jumlah, jmlhhal;
        double dis, total, bayar, jmlDis;
        System.out.println("Masukkan merk buku yang anda mau");
        Merkbuku=input.next();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah barang yang dibeli");
        jumlah=input.nextInt();
        System.out.println("Masukkan jumlah halaman buku ");
        jmlhhal=input.nextInt();
        System.out.println("Masukkan diskon yang diinginkan");
        dis=input.nextDouble();
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Jumlah yang harus dibayar adalah" +bayar);
    }
}