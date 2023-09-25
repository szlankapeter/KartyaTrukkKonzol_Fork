/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Lap;
import Model.Pakli;
import java.util.Scanner;

public class KartyaTrukk {

    private static final Scanner sc = new Scanner(System.in);
    private final Pakli PAK = new Pakli();
    private final Lap[] pakli = PAK.getPakli();

    public KartyaTrukk() {

    }

    public void indit() {
        kirak(pakli);
        for (int i = 0; i < 3; i++) {
            int oszlop = melyik();
            PAK.kever(oszlop);
            System.out.println("");
            kirak(PAK.getUjPakli());
        }
        String valasztott = PAK.ezVolt();
        System.out.println("A választott lap: " + valasztott);
    }

    public void kirak(Lap[] paklik) {
        Lap[] pakli = paklik;
        for (int i = 1; i < pakli.length; i++) {
            System.out.printf("%-8s", pakli[i].leiras);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
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
