/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kartyatrukkkonzolon;

import java.util.Scanner;


public class KartyaTrukk {
    
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Pakli();
    }
    
    public KartyaTrukk() {
        
    }
    
    public int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }
    
    
}
