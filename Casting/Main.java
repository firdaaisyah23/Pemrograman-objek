/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

/**
 *
 * @author windows 10
 */
public class Main {
    public static void main(String[] args) {
        Kucing anggora = new Kucing();
 
        Kucing hewan = anggora; //secara implisit upcasting
        
 
        Kucing hewan2 = new Kucing();
        ((Kucing) hewan2).meow(); //downcast hewan ke kucing, casting dari superclass ke subclass
    }
}
