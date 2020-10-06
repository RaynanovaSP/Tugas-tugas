import java.util.Scanner;

public class Sistem_login {
    public static void main(String[] args) {

        // Raynanova Setya Putra 2019071018
        // Program Sistem Login Sederhana
        String nama, pass;

        System.out.print("Selamat Datang, Silahkan Isi Kolom di Bawah ini\n");
        Scanner inputUser = new Scanner(System.in);
        //memasukan input nama pengguna
        System.out.print("Masukan Username Anda : ");
        nama = inputUser.nextLine();
        //memasukan password yang sudah ditentukan
        System.out.print("Masukkan Password Anda : ");
        pass = inputUser.nextLine();
        {
            // Membuat password dan username yang kita inginkan
            // Dan Membuat Perulangan Ketika Salah
            while (!(pass.equals("12345") && (nama.equals("upj")))) {
                System.out.print("Maaf Username atau Password Anda Salah\nSilahkan Ulangi ...\n");

                System.out.print("Masukkan Username Anda = ");
                nama = inputUser.nextLine();

                System.out.print("Masukkan Password Anda = ");
                pass = inputUser.nextLine();
            }
            // Tampilan ketika password benar
            System.out.print("Selamat Datang Username " + nama + "\nAnda Berhasil Login");

        }
    }
}


