/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan60.akatsuki;

/**
 *
 @author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program Siapa Kamu
 */
public class Akatsuki {
    protected String keunikan;
    protected String BisaJurus;
    
    public Akatsuki (String keunikan, String BisaJurus){
        this.keunikan = keunikan;
        this.BisaJurus = BisaJurus;
    }
    public void hasil(){
         System.out.println("keunikan                    : "+keunikan);
         System.out.println("Bisa Jurus Apa ?            : "+BisaJurus);
    }
    public void karakter(){
        
    }
   
}
