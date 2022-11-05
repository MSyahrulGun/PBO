import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kode;
        Scanner input = new Scanner(System.in);
        User pesan = new User();

        System.out.println("_-_-_-_-_-_-PEMESANAN TIKET BIOSKOP-_-_-_-_-_-");
        System.out.println("Masukan nama : ");
        String nama = input.next();
        System.out.println("Masukan Email : ");
        String email = input.next();
        System.out.println("Masukan No_Telpon : ");
        String no_hp = input.next();

        pesan.setNama(nama);
        pesan.setEmail(email);
        pesan.setNo_hp(no_hp);

        Teater teater = new Teater();
        String bioskop;
        System.out.println("-------------------------------");
        System.out.println(">>Bioskop<<");
        System.out.println("1. AMBARRUKMO XXI");
        System.out.println("2. EMPIRE XXI");
        System.out.println("3. JOGJA CITY XXI");
        System.out.println("4. SLEMAN CITY HALL XXI");
        System.out.println("Masukan Pilihan : ");
        int p = input.nextInt();
        if(p==1){
            bioskop = "AMBARRUKMO XXI";
        }else if(p==2){
            bioskop = "EMPIRE XXI";
        }else if(p==3){
            bioskop = "JOGJA CITY XXI";
        }else if(p==4) {
            bioskop = "SLEMAN CITY HALL XXI";
        }else{
            bioskop = "-";
            System.out.println("Pilihan tidak ada!!");
        }

        teater.setBioskop(bioskop);


        Cinema order = new Cinema();
        String jam;
        Film z = new Film();
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println(">>List Film Yang Sedang Tayang<<");
        System.out.println("1.Black Adam");
        System.out.println("2.Qodrat");
        System.out.println("3.Inang");
        System.out.println("4.Wakanda Forever");
        System.out.println("5.Perempuan Bergaun Merah");
        System.out.println("Masukan Pilihan : ");
        int n = input.nextInt();
        if(n==1){
            kode = "Black Adam";
        }else if(n==2){
            kode = "Qodrat";
        }else if(n==3){
            kode = "Inang";
        }else if(n==4){
            kode = "Wakanda Forever";
        }else{
            kode = "Perempuan bergaun merah";
        }

        System.out.println("-------------------------------------------");
        System.out.println(">>Pilih Jam Tayang<<");
        System.out.println("1. 14.15");
        System.out.println("2. 16.45");
        System.out.println("3. 18.00");
        System.out.println("4. 20.15");
        System.out.println("5. 22.10");
        System.out.println("Masukan Pilihan :");
        int i = input.nextInt();
        if(i==1){
            jam = "14.15";
        }else if(i==2){
            jam = "16.45";
        }else if(i==3){
            jam = "18.00";
        }else if(i==4){
            jam = "20.45";
        }else if(i==5){
            jam = "22.10";
        } else{
            jam = "-";
            System.out.println("Pilihan Salah!!!");
        }
        order.setKode(kode);
        order.setJam(jam);

        Film harga = new Film();
        harga.setHarga(40000);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("====================INVOICE PEMESANAN TIKET==================");
        System.out.println("Nama :"+pesan.getNama());
        System.out.println("Email :"+pesan.getEmail());
        System.out.println("No. Telepon :"+pesan.getNo_hp());
        System.out.println("============================================================= ");
        System.out.println("Bioskop \t\t   :"+teater.getBioskop());
        System.out.println("Film\t\t       :"+order.getKode());
        System.out.println("Jam Tayang\t\t  :"+order.getJam());
        System.out.println("Harga\t\t       :"+harga.getHarga());
        System.out.println("=============================================================");
        System.out.println("\n");
    }
}