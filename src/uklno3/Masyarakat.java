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
public class Masyarakat implements User{
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    
    public void Masyarakat(String nama, String alamat, String telp){
        setNama(nama);
        setAlamat(alamat);
        setTelepon(telp);
        
    }
    public int getIndexFromNama(String nama) {
        return namaMasyarakat.indexOf(nama);
    }
    
    public int getIdMasyarakat(int id) {
        return idMasyarakat.get(id);
    }
    @Override
    public void setNama(String nama) {
        this.namaMasyarakat.add(nama);
    }

    @Override
    public void setAlamat(String Alamat) {
        this.alamat.add(Alamat);
    }

    @Override
    public void setTelepon(String telp) {
        this.telepon.add(telp);
    }

    @Override
    public String getNama(int ID) {
        return namaMasyarakat.get(ID);
    }

    @Override
    public String getAlamat(int ID) {
        return alamat.get(ID);
    }

    @Override
    public String getTelepon(int ID) {
        return alamat.get(ID);
    }
}
