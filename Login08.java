import java.util.Scanner;

public class Login08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Definisikan array pengguna
        String[][] pengguna = new String[][] {
                { "admin", "admin123" },
                { "user1", "user123" },
        };
        boolean menuProcess = true;
        int menu = 0;

        System.out.println("===========================");
        System.out.println("        * LOGIN *          ");
        System.out.println("===========================");
        
        System.out.print("Masukkan username: ");
        String username = sc.nextLine();
        System.out.print("Masukkan password: ");
        String password = sc.nextLine();

        // Cek kecocokan username dan password
        boolean valid = false;
        for (int i = 0; i < pengguna.length; i++) {
            if (pengguna[i][0].equals(username) && pengguna[i][1].equals(password)) {
                valid = true;
                break;
            }
        }

        // Tampilkan hasil login
        if (valid) {
            System.out.println("\nWelcome Admin!");

            while (menuProcess) {
                System.out.println("+^^^^^^^^^^^^^^^^^^^^^^^^^+");
                System.out.println("|    * PILIHAN MENU *     |");
                System.out.println("+^^^^^^^^^^^^^^^^^^^^^^^^^+");
                System.out.println("| [1] Data Pegawai        |");
                System.out.println("| [2] Perhitungan Gaji    |");
                System.out.println("| [3] Cetak Slip Gaji     |");
                System.out.println("| [4] Pencarian           |");
                System.out.println("| [5] Laporan             |");
                System.out.println("| [6] Keluar              |");
                System.out.println("+-------------------------+");
                System.out.print("Masukkan menu pilihan anda: ");
                menu = sc.nextInt();
                sc.nextLine();
            }
        } else {
            System.out.println("Login gagal!");
        }
    }
}