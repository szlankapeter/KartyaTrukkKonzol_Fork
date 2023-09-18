/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kartyatrukkkonzolon;

/**
 *
 * @author szlanka.peter
 */
public class Pakli {

    private Lap[] pakli = new Lap[22];
    
    
    public Pakli() {
        
        feltolt();
        for (int i = 0; i < 3; i++) {
            kirak();
            int oszlop = new KartyaTrukk().melyik();
            kever(oszlop);
        }
        ezVolt();
        
    }
    
    public void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; e < ertekek.length && i < pakli.length; e++) {
                this.pakli[i++] = new Lap(szin + "_" + ertekek[e]);
            }
        }
    }
    
    public void kirak() {
        for (int i = 1; i < this.pakli.length; i++) {
            System.out.printf("%-8s", this.pakli[i].leiras);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }
    
    public void kever(int oszlop) {
        // mindig középre a választott
        Lap[] ujPakli = new Lap[22];
        switch (oszlop) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[20 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 2:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[20 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 3:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[21 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[20 - (i - 1) * 3];
                }
                break;
        }
        pakli = ujPakli;
    }
    
    public void ezVolt() {
        System.out.println("A választott lap: " + pakli[11].leiras);
    }
    
    
}
