//trehmernii class tochki 
public class Point3d{
	private double x;
	private double y;
	private double z;

//Konstryktor inicializacii
public Point3d(double x, double y, double z){
	 this.x =x;
	 this.y =y;
	 this.z =z;
}

//Konstryktor po ymolchaniu
public Point3d(){
	this.x= 0.0;
    this.y= 0.0;
    this.z= 0.0;
}
//Osnovoi metod 
public static void main(String[] args) {
	//sozdanie exzemplyari classa 
	Point3d p1 = new Point3d(); //sozdaet tochky (0,0,0)
	Point3d p2 = new Point3d(0.2, 0.5, 0.9); //sozdaet tochky (0.2,0.5,0.9)
	Point3d p3 = new Point3d(0.3, 0.6, 0.8); //sozdaet tochky (0.3, 0.6, 0.8)
	//vivod koordinat ojecta p1
    System.out.println("p1");
    System.out.println("x= " + p1.x + ", " + "y= " + p1.y + ", "+"z= " + p1.z); 
    //vivod koordinat ojecta p2
    System.out.println("");
    System.out.println("p2");
    System.out.println("x= " + p2.x + ", " + "y= " + p2.y + ", "+"z= " + p2.z);  
    //vivod koordinat ojecta p3
    System.out.println("");
    System.out.println("p3");
    System.out.println("x= " + p3.x + ", " + "y= " + p3.y + ", "+"z= " + p3.z);  
    System.out.println("");
    //Vivod rasstoyaniya mejdy tochkoi p1 i p3 
    System.out.println("rasstoyanie mejdy tochkoi p1 i p3");
    System.out.println(p1.distaceTo(p3));// vizov metoda dlya nahojdeniya rasstoyania mejdy dvymya tochkami
    System.out.println("");
    //Vivod rasstoyaniya mejdy tochkoi p2 i p3 
    System.out.println("rasstoyanie mejdy tochkoi p2 i p3");
    System.out.println(p2.distaceTo(p3));// vizov metoda dlya nahojdeniya rasstoyania mejdy dvymya tochkami
    System.out.println("");
    //Sravnenie ssilok na objecti
    System.out.println("sravnenie p1 i p2");
    System.out.println(p1 == p2);
    System.out.println("");
     //Sravnenie ssilok na objecti
    System.out.println("sravnenie p1 i p3");
    System.out.println(p1 == p3);
    System.out.println("");
    //Sravnenie ssilok na objecti
    System.out.println("sravnenie p2 i p3");
    System.out.println(p2 == p3);
    System.out.println("");

    // vizov metoda sravneniya znachenii polei p1 i p2 
    if (p1.equals(p2)){
		System.out.println("Tochki p1 i p2 ravni"); //elsi metod vozvrashaet true, to tochki ravni
	}
	else{
		System.out.println("Tochki p1 i p2 ne ravni"); //inache net
        } 
     // vizov metoda sravneniya znachenii polei p2 i p3
          if (p1.equals(p3)){
		System.out.println("Tochki p1 i p3 ravni"); //elsi metod vozvrashaet true, to tochki ravni
	}
	else{
		System.out.println("Tochki p1 i p3 ne ravni"); //inache net
        } 

    // vizov metoda sravneniya znachenii polei p2 i p3
          if (p2.equals(p3)){
		System.out.println("Tochki p2 i p3 ravni"); //elsi metod vozvrashaet true, to tochki ravni
	}
	else{
		System.out.println("Tochki p2 i p3 ne ravni"); //inache net
        }      
 }

     //Vozvrat koordinati x
	public double getX(){
		return x;
	}
	 //Vozvrat koordinati y
    public double getY(){
		return y;
	}
	 //Vozvrat koordinati z
    public double getZ(){
		return z;
	}
	//Ystanovka znachenia x
	public void setX(double val){
		x=val;
	}
	//Ystanovka znachenia y
    public void setY(double val){
		y=val;
	}
	//Ystanovka znachenia z
	public void setZ(double val){
		z=val;
	}	


//Metod dlya sravneniya znachenii dvyh ojectov Point3d
public boolean equals(Object obj)
{
		Point3d tmp =(Point3d)obj; 
		//esli koordinati dvyh ojectov ravni
		if(tmp.getX() == getX() && tmp.getY() == getY() && tmp.getZ() == getZ())
			return true;
		else
			return false;
	
}

//Metod dlya vichisleniya rasstoyaniya mejdy dvymya tochkami
 public double distaceTo(Point3d other){
 	double dx = getX() - other.getX(); 
 	double dy = getY() - other.getY();
 	double dz = getZ() - other.getZ();
   	double r = Math.sqrt(dx*dx + dy*dy + dz*dz);
    return Math.round(r * 100)/100.0; //vozvrat rasstoyaniya s zadannoi tochknostiu
}
}
