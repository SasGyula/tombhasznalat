/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombokhasznalata;

public class TombokHasznalata {

    public static void main(String[] args) {
//      indexek
//      pyLista = ["egy", "kettő", "három"]
        String[] tomb = {"egy", "kettő", "három"};
        // igy nem lehet printelni
        //System.out.println("tomb = " +tomb);
//      a tömb mérete nem változtatható
        // tomb = {"nulla" ,"egy", "kettő", "három"}
        System.out.println("A tömb elemei:");
        for(int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s°\n", i, tomb[i]);
        }
        tomb = new String[4];
        System.out.println("üres tömb:");
        for(int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s°\n", i, tomb[i]);
        }
        tomb[2] = "zwei";
        System.out.println("hozzáadott string:");
        for(int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s°\n", i, tomb[i]);
        }
        System.out.println("vegyesen feltöltött tömb:");
        tomb[0] = "null";
        tomb[1] = "one";
        tomb[3] = "three";
        //tomb[4] = "";
        for(int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s°\n", i, tomb[i]);
        }
        System.out.println("teljesen angolus feltöltött tömb:");
        tomb[0] = "null";
        tomb[1] = "one";
        tomb[2] = "two";
        tomb[3] = "three";
        //tomb[4] = "";
        for(int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s°\n", i, tomb[i]);
        }
//        String s = null;
        if ("null" == null){
            System.out.println("Egyezik");
        }else{
            System.out.println("nem egyezik");
        }
        String[] nevek = {};
        nevek[0] = "Pista";
        nevek[1] = "Géza";
        nevek[2] = "Lajos";
        
        int[] korok = {};
        korok[0] = 40;
        korok[1] = 50;
        korok[2] = 60;
        int osszKor = 0;
        for(int i = 0; i>korok.length; i++){
            String nev = nevek[i];
            int kor = korok[i];
            System.out.printf("%5s kora: %3d én\n", nev, kor);
            osszKor += kor;
        }
        double atlag = osszKor / 2;
        System.out.printf("A versenyzők átlag kora: %d év°\n" , atlag);
    }
}

