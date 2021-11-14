/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklno3;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Lelang {

    private ArrayList<Integer> idPenawar = new ArrayList<>();
    ArrayList<Integer> idBarang = new ArrayList<>();
    ArrayList<Integer> hargaTawar = new ArrayList<>();

    public void setIdPenawar(int Id) {
        this.idPenawar.add(Id);
    }

    public void setIdBarang(int Id) {
        this.idBarang.add(Id);
    }

    public void setHargaTawar(int harga) {
        this.hargaTawar.add(harga);
    }

    public int getIdPenawar(int Id) {
        return idPenawar.get(Id);
    }

    public int getIdBarang(int Id) {
        return idBarang.get(Id);
    }

    public int getHargaTawar() {
        return 0;
    }
}
