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
public class AeroPlan extends  Vehicle 
{

    @Override
    public void walk() {
     System.out.println("AEROPLAN IS FLYING");
    }
    public static void main(String[] args) {
        AeroPlan garuda = new AeroPlan ();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }

    @Override
    void fuel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
