/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklno3;
import java.util.Random;
/**
 *
 * @author LENOVO
 */
public class Hitman {
    public int bot(int hargaSebelum) {
        Random rand = new Random();
        int RNG = rand.nextInt(2);
        if(RNG != 1) {
            int harga = rand.nextInt(hargaSebelum) + hargaSebelum;
            return harga;
        } else {
            return 0;
        }
    }
}
