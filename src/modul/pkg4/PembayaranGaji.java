/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg4;

/**
 *
 * @author win 7
 */
public class PembayaranGaji {
    public int hitungGaji(pegawai peg) {
        int uang=peg.gaji();
        if(peg instanceof Direktur)
            uang +=((Direktur)peg).tunjangan();
        
          if(peg instanceof Staf)
            uang +=((Staf)peg).Bonus();
          return uang;
    }
    public static void main(String[] args) {
        PembayaranGaji pg = new PembayaranGaji();
        Staf ali=new Staf();
        Direktur Bayu=new Direktur();
        System.out.println("GAJI YANG DIBAYAR UNTUK STAF : "+pg.hitungGaji(ali));
         System.out.println("GAJI YANG DIBAYAR UNTUK DIREKTUR : "+pg.hitungGaji(Bayu));
        
    }
}
