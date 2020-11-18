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
 Deskripsi    : Program Akatsuki
 */
public class PBOIF210119060Latihan60Akatsuki {

   
    public static void main(String[] args) {
        // TODO code application logic here
        konan objkonan = new konan("Satu-satunya anggota Akatsuki perempuan", "memiliki jutsu dari origami" );
        objkonan.setNama("Konan");
        Itachi objItachi = new Itachi("Memiliki keunikan mata douzutsu sharingan","bisa bereinkarnasi menjadi burung gagak, serta bisa mengeluarkan Susano’o merah.");
        objItachi.setNama("Itachi Uchiha");
        Zetsu objZetsu = new Zetsu("memiliki 2 tubuh (Zetsu Hitam dan Putih) kepalanya diselubungi tudung semacam tanaman Venus.", "Ninja yang dapat tembus kemanapun");
        objZetsu.setNama("Zetsu");
        
        System.out.println("======== AKATSUKI =========");
        
        System.out.println("Nama                        : "+objkonan.getNama());
        objkonan.hasil();
        
        System.out.println("");
        
        System.out.println("Nama                        : "+objItachi.getNama());
        objItachi.hasil();
        
        System.out.println("");
        
        System.out.println("Nama                        : "+objZetsu.getNama());
        objZetsu.hasil();
    }
    
}
