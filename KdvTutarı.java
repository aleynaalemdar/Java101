import java.util.Scanner;
public class KdvTutar� {
public static void main (String []args) {
	double tutar, oran_1 = 0.18 ;
    double oran_2 = 0.08, kdvliFiyat;  
    Scanner keyboard = new Scanner(System.in);  
    System.out.print("L�tfen tutar� giriniz:");
    tutar = keyboard.nextDouble();

     kdvliFiyat = tutar < 1000 ? (tutar * oran_1 + tutar) : (tutar * oran_2 + tutar);

    System.out.println("Tutar� giriniz: " + tutar);
    System.out.println("1000 TL'ye kadar olan KDV Tutar�: " + oran_1 * tutar);
    System.out.println("1000 TL'ye kadar olan KDV Oran�: " + oran_1);
    System.out.println("1000 TL ve sonras� i�in KDV Tutar�: " +  tutar * oran_2);
    System.out.println("1000 TL ve sonras� i�in KDV Oran�: " + oran_2);


    System.out.println("Girilen tutar i�in KDV'li fiyat: " + kdvliFiyat);


	
	
	
	
	
	
	
	
	
	
	
	
	
    }
}