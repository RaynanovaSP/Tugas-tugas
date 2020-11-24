package com.pbo;
import java.util.*;

class dataa{
    private ArrayList<Integer> bilangan = new ArrayList<Integer>();

    public void setBil(int angka){
        this.bilangan.add(angka);
    }
    public void awal(){
        System.out.print("Bilangan Saat Ini yaitu : ");
        for(Integer angka:bilangan){
            System.out.print(angka+" ");
        }
    }
    public void nyariAngka(Integer find){
        if (bilangan.contains(find)){
            System.out.println(find+" ada dalam array ========");
        } else {
            System.out.println(find+" tidak ada dalam array =======");
        }
    }
}

public class TugasArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        dataa hasil = new dataa();
        int menu;
        int cari;
        int bilangan;
        int jumlah;
        boolean mainLoop = true;
        while (true) {
            System.out.println("\n\n1. Menginput Angka Yang Anda Inginkan");
            System.out.println("2. Mencari Angka Inputan Anda");
            System.out.println("3. Program Selesai");
            System.out.print("Masukan Nomer Pilihan Anda : ");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Jumlah Bilangan yang Ingin di Input:  ");
                    jumlah = input.nextInt();
                    System.out.println("list");
                    for (int i = 0; i < +jumlah; i++) {
                        bilangan = input.nextInt();
                        hasil.setBil(bilangan);
                    }
                    hasil.awal();
                    break;

                case 2:
                    System.out.print("Anda mau cari angka yang mana? ");
                    cari = input.nextInt();
                    hasil.nyariAngka(cari);
                    break;
                case 3 :
                    System.out.println("Anda Sudah Keluar dari Program");
                    System.exit(0);

            }
        }
    }
}
