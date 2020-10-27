
import java.util.Scanner;
class Manusia{
    private String _nama;

    public Manusia(){
        this._nama="";
    }
    public String getNama(){
        return this._nama;
    }
    public void setNama(String newName){
        this._nama=newName;
    }
}
class Pegawai extends Manusia {
    private String NIP;
    private int golongan;
    private int jamKerja;

    Pegawai() {
        this.NIP = "";
        this.golongan = 0;
        this.jamKerja = 0;
    }
    public String getNIP() {
        return NIP;
    }
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
    public int getGolongan() {
        return golongan;
    }
    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }
    public int getJamKerja() {
        return jamKerja;
    }
    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
    public void gaji() {

        double gaji;
        int gajiPokok = 0;
        int tunjangan = 0;
        int gajiLembur;
        int lembur = 0;

        if (golongan == 1) {
            gajiPokok = 1486500;
            tunjangan = 250000;
        }
        else if (golongan == 2) {
            gajiPokok = 1926000;
            tunjangan = 300000;
        }
        else if (golongan == 3) {
            gajiPokok = 2456700;
            tunjangan = 350000;
        }
        else if (golongan == 4) {
            gajiPokok = 2899500;
            tunjangan = 400000;
        }
        else {
            System.out.println("\n\nERROOOORR !!!!!!!!!\nInput yang dimasukkan salah, silihkan isi Golongan Pekerja 1 - 4");
        }

        System.out.println("Gaji Pokok = Rp." + gajiPokok);
        System.out.println("Tunjangan = Rp." + tunjangan);
        System.out.println("\n");
        gaji = gajiPokok + tunjangan;
        System.out.println("gaji sebelum dipotong pajak = Rp." + gaji);
        gaji = gaji * 0.95;
        System.out.println("gaji setelah kena pajak 0.5% = Rp." + gaji);
        System.out.println("\n");

        if (jamKerja >173){
            lembur = jamKerja - 173;
        }
        System.out.println("Jam Lembur = " + lembur + " jam");
        gajiLembur = lembur * 20000;
        System.out.println("Gaji lembur = Rp." + gajiLembur);
        gaji = gaji + gajiLembur;
        System.out.println("\nTotal Gaji Yang di dapatkan = Rp." + gaji);
    }
}
public class TugasGajiPBO {

    public static void main(String[] args) {

        Pegawai peg = new Pegawai();
        Scanner input = new Scanner(System.in);
        int jamKerja;
        String nama;
        int golongan;
        String NIP;
        System.out.print("Silahkan Isi sesuai Biodata Anda\n");
        System.out.print("Masukkan Nama Anda : ");
        nama = input.nextLine();
        peg.setNama(nama);
        System.out.print("Masukkan NIP Anda : ");
        NIP = input.next();
        peg.setNIP(NIP);
        System.out.print("Golongan Pekerja (1-4) : ");
        golongan = input.nextInt();
        peg.setGolongan(golongan);
        System.out.print("Jam Kerja dalam Sebulan : ");
        jamKerja = input.nextInt();
        peg.setJamKerja(jamKerja);
        System.out.println("\n\n-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-");
        System.out.println("Selamat Datang, Berikut Info Gaji Anda dalam Sebulan\n");
        System.out.println("Nama : "+peg.getNama());
        System.out.println("NIP : "+peg.getNIP());
        System.out.println("Golongan Pekerja Anda : "+peg.getGolongan());
        System.out.println("Jam Kerja sebulan : "+peg.getJamKerja());
        peg.gaji();

    }
}