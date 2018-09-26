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
public class Shape
{
    private String color;
    public Shape(String color){
        this.color=color;
    }
    
    public String toString(){
        return"Shape[color ="+color+"]";
    }
    public double getArea(){
      System.err.println("Shape unkown  cannot complete area!!!!!!!!!!!!!!!!!!!");
      return 0;
    }

    }

