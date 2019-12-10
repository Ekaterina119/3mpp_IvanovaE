// import scannera
import java.util.Scanner;

public class Palindrome{

  //Osnovnoi metod
  public static void main(String[] args){
  	   //obyavlyaem scanner
  	    Scanner sc = new Scanner(System.in);
  	    System.out.println("Vvedite slovo ili frazy: ");
  	    //schitivaem slovo ili frazy s konsoli i prisvaivaem v "s"
        String s=sc.nextLine();
        //razbivaem po probely vvodimyu stroky na massiv slov
        String arr[]=s.split(" ",s.length());
   
       //dlya kajdogo slova iz razbitogo massiva ispolzuem metod isPalindrome
        for(int i=0;i<arr.length;i++){
        	
        	isPalindrome(arr[i].toString());
        }
    }

  //Metod dlya perevorachivania slova
  public static String reverseString(String s){
            
        //Stroka-rezultat      
        String r = "";

        // simvoli ishodnoi stroki berem s konca do nachala i dobavlyaem v stroky r 
        for (int j = s.length() - 1; j >= 0; --j){ 
        r=r.concat(Character.toString(s.charAt(j)));
        }
      return r;
  	}

    // Metod dlya sravnenia originalnoi stroki i perevernytoi
  	 public static Boolean isPalindrome(String s) {
  	 
  	    // esli stroki odinakovii, vivodim, chto stroka polindrom
  	 	if(s.equals(reverseString(s))){
            System.out.println("Polindrom");
        }
        // esli net, vivodim, chto stroka ne polindrom
        else{
            System.out.println("Ne polindrom");
        }
        // vozvrat rezultata
        return s.equals(reverseString(s));  
        
    }

}