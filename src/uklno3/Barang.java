/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklno3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author LENOVO
 */
public class Barang extends Lelang {

    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
    private ArrayList<Boolean> Status = new ArrayList<Boolean>();

    public void setIdMasyarakat(int Id) {
        this.idMasyarakat.add(Id);
    }

    public void setNamaBarang(String nama) {
        this.namaBarang.add(nama);
    }

    public void setHargaAwal(int harga) {
        this.hargaAwal.add(harga);
    }

    public void setStatus(boolean status){
        Status.add(status);
    }
    
    public void setStatus(int index, boolean status){
        Status.add(index, status);
    }
    
   void overrideHargaTawar(){
        this.hargaTawar.clear();
    }
    public int getHargaTertinggi() {
        return Collections.max(hargaTawar);
    }
    @Override
    public void setIdBarang(int ID) {
        super.setIdBarang(ID);
    }

    public int getIdMasyarakat(int Id) {
        return idMasyarakat.get(Id);
    }

    public String getNamaBarang(int Id) {
        return namaBarang.get(Id);
    }

    public int getHargaAwal(int Id) {
        return hargaAwal.get(Id);
    }
    public boolean getStatus(int Id) {
        return this.Status.get(Id);
    }
    
    public void tampilBarang(){
        int i, n = namaBarang.size();
        for (i=0; i<n; i++){
            System.out.println("+-------------+");
            System.out.println("ID : " + namaBarang.indexOf(getNamaBarang(i)));
            setIdBarang(namaBarang.indexOf(getNamaBarang(i)));
            System.out.println("Nama Barang : " +getNamaBarang(i));
            System.out.println("Harga awal : "+getHargaAwal(i));
            System.out.println("Status lelang : "+getStatus(i));
            System.out.println("+-------------+");
            System.out.println();
        }
    }
}
