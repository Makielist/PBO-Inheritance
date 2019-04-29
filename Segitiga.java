import java.util.*;
public class Segitiga extends BangunDatar 
{

    float alas;
    float tinggi;
	
	float luas() {
        float luas = alas * tinggi;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    } 
	
	float keliling(){
        float keliling = alas + tinggi;
        System.out.println("Keliling Segitiga: " + keliling);
        return keliling;
    }
}