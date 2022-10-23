import java.util.Scanner;
public class KullanýcýGiriþi {

	public static void main(String[] args) {
		
     Scanner keyboard = new Scanner(System.in);
     
     System.out.println("Kullanýcý adýnýz : ");
     String userName =keyboard.nextLine();
     System.out.println("Þifreniz : ");
     String password=keyboard.nextLine();
   
   if (password.equals("12345")&&(!userName.equals("Aleynaalemdar"))){
     System.out.println("Kullanýcý adýnýz yanlýþ");
     System.out.println("Kullanýcý adýnýzý sýfýrlamak ister misiniz?; "
     		+ "evet için 1,hayýr için 2 giriniz. ");
             int a = keyboard.nextInt();
             
             
     if (a==1) {
     System.out.println("Yeni kullanýcý adý giriniz.");
     keyboard.nextLine();
     String newUserName =keyboard.nextLine();
     
     if (newUserName.equals("Aleynaalemdar")) {
    	 System.out.println("Yeni kullanýcý adýnýz eskisiyle ayný olamaz."
    	 		+ "Lütfen baþka bir kullanýcý adý giriniz.");}
    	 else 
    		 System.out.println("Kullanýcý adý oluþturuldu."); }
    	  
     if (a==2) {
    	 System.out.println("Sistemden çýkýþ yapýlýyor...");}
     
    if (!(a==2) && !(a==1)) {
     
     System.out.println("Yanlýþ giriþ yaptýnýz,tekrar deneyiniz.");
     }
     
  }		
   
   if (!(password.equals("12345"))&&(userName.equals("Aleynaalemdar"))){
	     System.out.println("Þifreniz yanlýþ");
	     System.out.println("Þifrenizi sýfýrlamak ister misiniz?; "
	     		+ "evet için 1,hayýr için 2 giriniz. ");
	             int a = keyboard.nextInt();
	             
	             
	     if (a==1) {
	     System.out.println("Yeni bir þifre giriniz.");
	     keyboard.nextLine();
	     String newPassword =keyboard.nextLine();
	     
	     if (newPassword.equals("Aleynaalemdar")) {
	    	 System.out.println("Yeni þifreniz eskisiyle ayný olamaz."
	    	 		+ "Lütfen baþka bir þifre giriniz.");}
	    	 else 
	    		 System.out.println("Þifre oluþturuldu."); }
	    	  
	     if (a==2) {
	    	 System.out.println("Sistemden çýkýþ yapýlýyor...");}
	     
	    if (!(a==2) && !(a==1)) {
	     
	     System.out.println("Yanlýþ giriþ yaptýnýz,tekrar deneyiniz.");
	     }
	     
	  }		
   
   if (!((password.equals("12345"))||(userName.equals("Aleynaalemdar")))){
   System.out.println("Þifreniz ve kullanýcý adýnýz yanlýþ...");
  } 
   
   
   
   
   
   
   
   
   
   
   
}
}
