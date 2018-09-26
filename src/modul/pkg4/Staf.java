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
public class Staf extends pegawai {
     private static final int gajistaf=100000;
    private static final int bonusStaf = 50000;
    
    public int gaji () {
        return gajistaf;
    }
    public int Bonus (){
        return bonusStaf;
    }
    
}
