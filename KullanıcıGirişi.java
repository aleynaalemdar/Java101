import java.util.Scanner;
public class Kullan�c�Giri�i {

	public static void main(String[] args) {
		
     Scanner keyboard = new Scanner(System.in);
     
     System.out.println("Kullan�c� ad�n�z : ");
     String userName =keyboard.nextLine();
     System.out.println("�ifreniz : ");
     String password=keyboard.nextLine();
   
   if (password.equals("12345")&&(!userName.equals("Aleynaalemdar"))){
     System.out.println("Kullan�c� ad�n�z yanl��");
     System.out.println("Kullan�c� ad�n�z� s�f�rlamak ister misiniz?; "
     		+ "evet i�in 1,hay�r i�in 2 giriniz. ");
             int a = keyboard.nextInt();
             
             
     if (a==1) {
     System.out.println("Yeni kullan�c� ad� giriniz.");
     keyboard.nextLine();
     String newUserName =keyboard.nextLine();
     
     if (newUserName.equals("Aleynaalemdar")) {
    	 System.out.println("Yeni kullan�c� ad�n�z eskisiyle ayn� olamaz."
    	 		+ "L�tfen ba�ka bir kullan�c� ad� giriniz.");}
    	 else 
    		 System.out.println("Kullan�c� ad� olu�turuldu."); }
    	  
     if (a==2) {
    	 System.out.println("Sistemden ��k�� yap�l�yor...");}
     
    if (!(a==2) && !(a==1)) {
     
     System.out.println("Yanl�� giri� yapt�n�z,tekrar deneyiniz.");
     }
     
  }		
   
   if (!(password.equals("12345"))&&(userName.equals("Aleynaalemdar"))){
	     System.out.println("�ifreniz yanl��");
	     System.out.println("�ifrenizi s�f�rlamak ister misiniz?; "
	     		+ "evet i�in 1,hay�r i�in 2 giriniz. ");
	             int a = keyboard.nextInt();
	             
	             
	     if (a==1) {
	     System.out.println("Yeni bir �ifre giriniz.");
	     keyboard.nextLine();
	     String newPassword =keyboard.nextLine();
	     
	     if (newPassword.equals("Aleynaalemdar")) {
	    	 System.out.println("Yeni �ifreniz eskisiyle ayn� olamaz."
	    	 		+ "L�tfen ba�ka bir �ifre giriniz.");}
	    	 else 
	    		 System.out.println("�ifre olu�turuldu."); }
	    	  
	     if (a==2) {
	    	 System.out.println("Sistemden ��k�� yap�l�yor...");}
	     
	    if (!(a==2) && !(a==1)) {
	     
	     System.out.println("Yanl�� giri� yapt�n�z,tekrar deneyiniz.");
	     }
	     
	  }		
   
   if (!((password.equals("12345"))||(userName.equals("Aleynaalemdar")))){
   System.out.println("�ifreniz ve kullan�c� ad�n�z yanl��...");
  } 
   
   
   
   
   
   
   
   
   
   
   
}
}
