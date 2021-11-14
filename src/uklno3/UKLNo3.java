/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklno3;

import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class UKLNo3 {
    static Masyarakat masyarakat = new Masyarakat();
    static Barang barangLelang = new Barang();
    static Petugas petugas = new Petugas("Anonimus", "jalan jalan", "08123425624");
    
    static Scanner masukkan = new Scanner(System.in);
    static Scanner ulangi = new Scanner(System.in);
    
    static String jawab = "";
    static String user_input = "";
    static int Pilihan;

    static String loginNama = "";
    static Hitman hitman = new Hitman();
    static int currentHarga;

    static int bot_harga;
    static int user_harga;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        register();
        generatebarang();
        System.out.println("Daftar barang");
        System.out.println();
        
        barangLelang.tampilBarang();
        
        System.out.print("barang mana yang ingin anda tawar ? : ");
        Pilihan = masukkan.nextInt();
        if (Pilihan > barangLelang.idBarang.size() || !barangLelang.getStatus(Pilihan)){
            System.out.println("nomor barang tidak valid");
        }else{
            System.out.println("Barang : " + barangLelang.getNamaBarang(Pilihan));
            System.out.println("harga awal : " + barangLelang.getHargaAwal(Pilihan));
            System.out.println("Status : " + barangLelang.getStatus(Pilihan));
            

            lelangStart();
        }
        pemenang();
        
    }
    static void register(){
        System.out.println("Silahkan Register :");
        System.out.print("Nama : ");
        String nama = masukkan.nextLine();
        loginNama = nama;
        System.out.print("Alamat : ");
        String alamat = masukkan.nextLine();
        System.out.print("Telp : ");
        String telp = masukkan.nextLine();
        masyarakat.Masyarakat(nama, alamat, telp);
    }
    
    
    static boolean Jawab(String input){
        return input.equalsIgnoreCase("y");
    }
    
     static void lelangStart() {
        do {
            currentHarga = barangLelang.getHargaTertinggi();
            System.out.println("harga Saat Ini : " + currentHarga);
            System.out.println();
            System.out.print("Masukkan Harga : ");
            int harga = masukkan.nextInt();

            System.out.println();

            if (harga <= barangLelang.getHargaTertinggi()){
                System.out.println("harga anda terlalu rendah");
            }else {
                barangLelang.setHargaTawar(harga);
                user_harga = harga;
            }
            

            currentHarga = barangLelang.getHargaTertinggi();

            
            bot_harga = hitman.bot(currentHarga);
            if (bot_harga <= barangLelang.getHargaTertinggi()){
                System.out.println("Hitman :  aku panggil bosku dulu");
            }else {
                barangLelang.setHargaTawar(bot_harga);
                System.out.println("Hitman : " + bot_harga);
            }
            currentHarga = barangLelang.getHargaTertinggi();
            System.out.println();
            

            System.out.print("Lanjut menawar? (Y/N) : ");
            jawab = ulangi.nextLine();

        } while (Jawab(jawab));
    }
     static void generatebarang() {
        barangLelang.setNamaBarang("RTX 3090");
        barangLelang.setHargaAwal(10000);
        barangLelang.setHargaTawar(10000);
        barangLelang.setStatus(true);

        barangLelang.setNamaBarang("NFT ART");
        barangLelang.setHargaAwal(400000);
        barangLelang.setHargaTawar(400000);
        barangLelang.setStatus(true);

        barangLelang.setNamaBarang("Kaos nya kepin");
        barangLelang.setHargaAwal(200000);
        barangLelang.setHargaTawar(200000);
        barangLelang.setStatus(true);
        
        barangLelang.setNamaBarang("Legion");
        barangLelang.setHargaAwal(180000);
        barangLelang.setHargaTawar(180000);
        barangLelang.setStatus(true);
    }
     static void pemenang(){
        barangLelang.setStatus(Pilihan, false);
        if (currentHarga == user_harga){
            System.out.println("");
            System.out.println("Pemenang " + barangLelang.getNamaBarang(Pilihan));
            System.out.println("Adalah : " + loginNama);
            System.out.println("Dengan harga : " + currentHarga);
            System.out.println("");
            System.out.println("Hitman :  sial, aku kalah");
        }else {
            System.out.println("");
            System.out.println("Pemenang " + barangLelang.getNamaBarang(Pilihan));
            System.out.println("Adalah : Hitman");
            System.out.println("Dengan harga : " + currentHarga);
            System.out.println("");
            System.out.println("Hitman :  keburuntungan mu sudah habis");
            
        }
    
     }
}
