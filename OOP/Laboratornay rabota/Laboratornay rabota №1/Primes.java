 //Opisanie classa
public class Primes{
    //Osnovnoi metod
	public static void main(String[] args) { 
      for (int n=2;n<=100;n++){  
   

              if (isPrime(n)){
                //Vivod na pechat prostih chisel
              System.out.println(n + " prime number"); 
              }  

        }
    }

    //Opisanie func, kotoray opredelyaet yavlyaetsya 
    //li argument prostim chislom ili net
    public static boolean isPrime(int n){ 
        //Esli chislo delitsya bez ostatka,
        //to chislo ne prostoe
         for (int i=2;i<n;i++){
            if((n%i)==0) return false; 
          }
          //Inache prostoe
         return true;
    }
}
