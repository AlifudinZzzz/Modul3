package ProjectPegawai;

import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        pegawai bca, bsi;
        bca = new pegawai();
        bsi = new pegawai();
        Scanner input = new Scanner(System.in);
        System.out.println("Input pegawai");
        System.out.print("Nama Pegawai: ");
        bca.setNama(input.nextLine());
        System.out.print("Nomor Pegawai: ");
        bca.setNip(input.nextLine());
        System.out.print("Alamat Pegawai: ");
        bca.setAlamat(input.nextLine());
        bca.setTotalGaji(5 , 2000000);
        bca.cetakKeLayar();
        System.out.println();
        System.out.print("Nama Pegawai: ");
        bsi.setNama(input.nextLine());
        System.out.print("Nomor Pegawai: ");
        bsi.setNip(input.nextLine());
        System.out.print("Alamat Pegawai: ");
        bsi.setAlamat(input.nextLine());
        bsi.setTotalGaji(3500000);
        bsi.cetakKeLayar();
    }
}