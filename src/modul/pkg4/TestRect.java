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
public class TestRect {
    public static int tambah(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        Rect r1 = new Rect();
        Rect r2=new Rect(8,9);
        System.out.println("<"+r1.isInside(2, 3)+">is Inside the union" + "");
        Rect r3=r1.union(r2);
        System.out.println("r1 union r2 = " + r3.x1 + "," +r3.x2+ "," + r3.y1 + "," + r3.y2);
    }
}
