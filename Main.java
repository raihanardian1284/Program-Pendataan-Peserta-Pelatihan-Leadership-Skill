import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Username = null, Menu, tanggal_lahir;
        long nomor_Telfon = 0, nomor_KTP = 0;
        String Pilihan = null;
        Scanner Input = new Scanner(System.in);
        char again = 0;
        String Alamat = null, status = null;
        String pilihan = null;

        do {
            System.out.print("Nama = ");
            Scanner nama = new Scanner(System.in);
            Username = nama.nextLine();

            System.out.print("Tanggal Lahir = ");
            Scanner lahir = new Scanner(System.in);
            tanggal_lahir = lahir.nextLine();

            System.out.print("Nomor Telfon =");
            Scanner phone = new Scanner(System.in);
            nomor_Telfon = phone.nextLong();

            System.out.println("Apakah data yang telah anda masukkan sudah benar? (Y|N)");
            again = Input.next().charAt(0);

        } while ((again == 'N') || (again == 'n'));

        boolean kembali = false;
        do {
            System.out.println("MENU");
            System.out.println("1. Lihat Biodata Diri");
            System.out.println("2. Ubah Biodata Diri");
            System.out.println("3. Keluar");
            System.out.println("Silahkan Pilih Menu Yang Telah Tersedia Di Atas = ");
            Pilihan = Input.nextLine();

            switch (Pilihan) {
                case "1":
                    System.out.println("Nama = " + Username);
                    System.out.print("Alamat = ");
                    Alamat = Input.nextLine();
                    System.out.println(" Nomor Telfon = " + nomor_Telfon);
                    System.out.println("Tanggal Lahir = " + tanggal_lahir);
                    System.out.print("Status = ");
                    status = Input.nextLine();
                    System.out.print("Nomor nomor_KTP = ");
                    nomor_KTP = Input.nextLong();
                    break;
                case "2":
                    System.out.print("1. Nama = " + Username);
                    System.out.print("\n2. Alamat = " + Alamat);
                    System.out.print("\n3. Nomor Telfon" + nomor_Telfon);
                    System.out.print("\n4. Tanggal Lahir" + tanggal_lahir);
                    System.out.print("\n5. Status = " + status);
                    System.out.print("\n6. Nomor KTP = " + nomor_KTP);
                    System.out.print("\n7. Cancel");
                    System.out.println("\nSilahkan Pilih Nomor 7 Untuk Keluar =");
                    break;
                case "3":
                    System.out.println("Terima Kasih");
                    System.exit(0);
                    break;

                case "7":
                    kembali = true;
                    break;
            }
        } while ((again == 'Y') || (again == 'y'));
    }
}
