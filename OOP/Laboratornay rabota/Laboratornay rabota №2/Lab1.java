// import scannera
import java.util.Scanner; 

//sozdanie novogo klassa 
public class Lab1{

    private double a;
	private double b;
	private double c;

// Sozdanie obshedostypnogo statisticheskogo metoda main
  public static void main(String[] args){

//Sozzdanie 3h ojectov Point3d na osnove vvedennih dannih
Point3d a = new Point3d(); //oject a
Point3d b = new Point3d(); //oject b
Point3d c = new Point3d(); //oject c

//obyavlyaem scanner
 Scanner in = new Scanner(System.in);
 //Vvod koordinat pervoi tochki
 System.out.println("Vvedite koordinati pervoi tochki:");
 System.out.println("x= ");
 a.setX(in.nextDouble()); //ystanavlivaem znachenie ojecty a koordinati x
 System.out.println("y= ");
 a.setY(in.nextDouble()); //ystanavlivaem znachenie ojecty a koordinati y
 System.out.println("z= ");
 a.setZ(in.nextDouble()); //ystanavlivaem znachenie ojecty a koordinati z
 System.out.println("");
  //Vvod koordinat vtoroi tochki
 System.out.println("Vvedite koordinati vtoroi tochki:");
  System.out.println("x= ");
 b.setX(in.nextDouble());//ystanavlivaem znachenie ojecty b koordinati x
 System.out.println("y= ");
 b.setY(in.nextDouble());//ystanavlivaem znachenie ojecty b koordinati y
 System.out.println("z= ");
 b.setZ(in.nextDouble()); //ystanavlivaem znachenie ojecty b koordinati z
 System.out.println("");
  //Vvod koordinat tretei tochki
 System.out.println("Vvedite koordinati tretei tochki:");
 System.out.println("x= ");
 c.setX(in.nextDouble()); //ystanavlivaem znachenie ojecty c koordinati x
 System.out.println("y= ");
 c.setY(in.nextDouble()); //ystanavlivaem znachenie ojecty c koordinati y
 System.out.println("z= ");
 c.setZ(in.nextDouble()); //ystanavlivaem znachenie ojecty c koordinati z
 System.out.println("");
 //Sravnenie znachenii treh ojectov Point3d
if (a.equals(b) == false){ //vizov metoda equals iz pervogo klassa, kotorii sravnivaet tochki a i b,
//esli tochki ne ravni, to sravnivaet tochki b i c
 	if (b.equals(c) == false){ //vizov metoda equals iz pervogo klassa, kotorii sravnivaet tochki b i c,
//esli tochki ne ravni, to sravnivaet tochki a i c
 		if (a.equals(c)== false){//vizov metoda equals iz pervogo klassa, kotorii sravnivaet tochki a i c,
//esli tochki ne ravni, to vizivaetsya metod 'computeArea' i vivoditsya ploshad
		 	System.out.println("S=" + computeArea(a,b,c)); 
		}
	    else System.out.println("Odna iz tochek ravna drygoi");	//inache osfibka
	}
	else System.out.println("Odna iz tochek ravna drygoi"); //inache osfibka
}
else System.out.println("Odna iz tochek ravna drygoi"); //inache osfibka
		 	
}

//Metod dlya vichisleniya ploshadi tgeygolnika
public static double computeArea(Point3d a, Point3d b, Point3d c){
 
	double ab=a.distaceTo(b); //vichislenie rasstoyania mejdy a i b, ispolzya metod classa Point3d
	double bc=b.distaceTo(c); //vichislenie rasstoyania mejdy b i c, ispolzya metod classa Point3d
	double ac=a.distaceTo(c); //vichislenie rasstoyania mejdy a i c, ispolzya metod classa Point3d

	double p=(ab+bc+ac)/2; //vichislenie perimetra
	double s= Math.sqrt(p*(p-ab)*(p-bc)*(p-ac)); //vichislenie ploshadi i prisvoenie v peremennyy s tipa double
	return s; //vozvrat s
	
}

}
