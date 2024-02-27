/*
    Nama        : Hernan Sandi Laksono
    NIM         : 24060121130078
    Nama File   : MTitik.java
    Deskripsi   : Main class dari program Titik
*/ 

public class MTitik {
    public static void main(String[] args) {
        
        Titik t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);
        
        Titik t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);
        
        Titik t3;
        t3 = new Titik();
        
        System.out.println("Jumlah objek titik : " + Titik.getCounterTitik());
        System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");

        // jarak titik ke pusat
        System.out.println("Jarak t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ") ke pusat adalah " + t1.getJarakPusat());

        // refleksi sumbu x
        t1.refleksiX();
        System.out.println("Refleksi sumbu x t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        // refleksi sumbu y
        t1.refleksiY();
        System.out.println("Refleksi sumbu y t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        // refleksi sumbu x tanpa mengubah titik aslinya
        Titik tRefleksiX = t2.getRefleksiX();
        System.out.println("Refleksi sumbu x tRefleksiX(" + tRefleksiX.getAbsis() + ", " + tRefleksiX.getOrdinat() + ")");

        // refleksi sumbu y tanpa mengubah titik aslinya
        Titik tRefleksiY = t2.getRefleksiY();
        System.out.println("Refleksi sumbu y tRefleksiY(" + tRefleksiY.getAbsis() + ", " + tRefleksiY.getOrdinat() + ")");
    }

    // Kesimpulan 
    /* 
     *  
     */
}
