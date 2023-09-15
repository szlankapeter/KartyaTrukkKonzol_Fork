package kartyatrukkkonzolon;

import java.util.Scanner;

public class KartyaTrukkKonzolon {

    private static String[] pakli = new String[22];
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        feltolt();
        for (int i = 0; i < 3; i++) {
            kirak();
            melyik();
            kever();
        }
        ezVolt();
    }

    private static void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; e < ertekek.length && i < pakli.length; e++) {
                pakli[i++] = szin + "_" + ertekek[e];
            }
        }
        
    }
    
    private static void kirak() {
        for (int i = 1; i < pakli.length; i++) {
            System.out.printf("%-8s",pakli[i]);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }

    private static void melyik() {
        boolean jo;
        do{
            System.out.print("melyik oszlop (1-3): ");
            int oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        }while(!jo);
        
    }

    private static void kever() {
        // mindig középre a választott
    }

    private static void ezVolt() {
        System.out.println("A választott lap: " + pakli[11]);
    }
}
