//Dvymernii klass tochki
public class Point2d{
	private double xCoord;
	private double yCoord;

//Konstryktor inicializacii	
public Point2d(double x, double y){
	 xCoord= x;
     yCoord= y;
}

//Konstryktor po ymolchaniu
public Point2d(){
	this(0,0);
}
    //Vozvrat koordinati x
    public double getX(){
		return xCoord;
	}
	 //Vozvrat koordinati y
    public double getY(){
		return yCoord;
	}
    //Ystanovka znachenia x
	public void setX(double val){
		xCoord=val;
	}
	//Ystanovka znachenia y
    public void setY(double val){
		yCoord=val;
	}

    //Osnovoi metod 
	public static void main(String[] args) {
	//sozdanie exzemplyari classa 
	Point2d myPoint = new Point2d();
	Point2d myOtherPoint = new Point2d(5,3);
	Point2d aThirdPoint = new Point2d();
	//vivod koordinat ojecta myPoint
    System.out.println("myPoint");
    System.out.println("x= " + myPoint.xCoord + ", " + "y= " + myPoint.yCoord); 
    System.out.println("");
    //vivod koordinat ojecta myOtherPoint
    System.out.println("myOtherPoint");
    System.out.println("x= " + myOtherPoint.xCoord + ", " + "y= " + myOtherPoint.yCoord); 
    System.out.println("");
     //vivod koordinat ojecta aThirdPoint
    System.out.println("aThirdPoint");
    System.out.println("x= " + aThirdPoint.xCoord + ", " + "y= " + aThirdPoint.yCoord);  
    System.out.println("");
      //sravnenie myPoint i aThirdPoint(sravnenie ssilok na ojecti)  
    System.out.println("sravnenie myPoint i aThirdPoint");
    System.out.println(myPoint == aThirdPoint);
    System.out.println("");

// vizov metoda sravneniya znachenii polei myPoint i aThirdPoint
    if (myPoint.equals(aThirdPoint)){
		System.out.println("myPoint i aThirdPoint --- ravni");//elsi metod vozvrashaet true, to tochki ravni
	}
	else{
		System.out.println("myPoint i aThirdPoint --- ne ravni");//inache net

    }
}

//Metod dlya sravneniya znachenii dvyh ojectov Point2d
public boolean equals(Object obj)
{
	
		Point2d tmp =(Point2d)obj;
		if(tmp.getX() == getX() && tmp.getY() == getY())
			return true;
		else
			return false;
	
}}