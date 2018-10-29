/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan63.graislurus;

/**
 *Nama      : Fachrian Harits P
 *Kelas     : IF-2
 *NIM       : 10117061
 *Deskripsi : Program untuk menampilkan hasil gradien
 * 
 */
public class PBO210117061Latihan63GraisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat kdt1 = new Koordinat(2, 1, 5, 7);
        Koordinat kdt2 = new Koordinat(5, 1, 3, 12);

        System.out.println("Garis yang melalui titik (2,10) dan (5,7)"
                + " memiliki gradien sebesar " + kdt1.hitungGradien());
        System.out.println("Garis yang melalui titik (5,1) dan (3,12)"
                + " memiliki gradien sebesar " + kdt2.hitungGradien());
    }

}
