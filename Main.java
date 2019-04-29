import java.util.*;
public class Main 
{

    public static void main(String[]args) 
	{
		
		//Inisialisasi objek
        BangunDatar bangundatar = new BangunDatar();
		Lingkaran lingkaran = new Lingkaran();
		lingkaran.r = 22;
		Persegi persegi = new Persegi();
		persegi.sisi = 2;
		Segitiga segitiga = new Segitiga();
		segitiga.alas = 12;
        segitiga.tinggi = 8;
		
        
		
		//Pemanggilan method
		bangundatar.luas();
		persegi.luas();
		segitiga.luas();
		lingkaran.luas();

		bangundatar.keliling();
		persegi.keliling();
		segitiga.keliling();
		lingkaran.keliling();
		
    }

}