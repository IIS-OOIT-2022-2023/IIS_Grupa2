package geometry;

public class Test {

	public static void main(String[] args) {
		Point point1 = new Point();
		
		// point1.x = 3; Ne radi zbog specifikatora pristupa PRIVATE
		// point1.y = 5;
		
		point1.setX(3);
		point1.setY(5);
		point1.setSelected(false);
		
		System.out.println("X koordinata tacke je: " + point1.getX());
		System.out.println("Y koordinata tacke je: " + point1.getY());
		System.out.println("Da li je tačka selektovana:  " + point1.isSelected());
		
		System.out.println(point1);
		
		double distanceResult = point1.distance(6,7);
		System.out.println(distanceResult);
		
		distanceResult = point1.distance(1,1);
		System.out.println(distanceResult);
		
			

		// Vezbe 3 (13. 3. 2023.)
		System.out.println("Vezbe 3");
		
		Point p2 = new Point();
		Line l1 = new Line();
		Rectangle r1 = new Rectangle();
		Circle c1 = new Circle();
		
		p2.setX(15);
		p2.setY(10);
		System.out.println("X coordinate of p2: " + p2.getX());
		System.out.println("Y coordinate of p2: " + p2.getY());
				
		// 1. Inicijalizovati x koordinatu tačke point1 na vrednost y koordinate tačke p2
		
		System.out.println("X kordinata tačke point1 pre izmene: "  + point1.getX());
		point1.setX(p2.getY());
		System.out.println("X kordinata tačke point1 nakon izmene: "  + point1.getX());
		
		// 2. Postaviti za početnu tačku linije l1 tačku point1,
		// a za krajnju tačku linije l1 tačku p2
		
		l1.setStartPoint(point1);
		l1.setEndPoint(p2);
		
		System.out.println("X koordinata početne tačke linije l1: " + l1.getStartPoint().getX());
		System.out.println("Y koordinata početne tačke linije l1: " + l1.getStartPoint().getY());
		System.out.println("X koordinata krajnje tačke linije l1: " + l1.getEndPoint().getX());
		System.out.println("Y koordinata krajnje tačke linije l1: " + l1.getEndPoint().getY());
		
		// 3. Postaviti y koordinatu krajnje tačke linije l1 na 23
		
		l1.getEndPoint().setY(23);
		System.out.println("Y koordinata krajnje tačke linije l1: " + l1.getEndPoint().getY());
		
		// 4. Inicijalizovati x kordinatu početne tačke linije l1 
		// na vrednost y koordinate krajnje tačke linije l1
		
		l1.getStartPoint().setX(l1.getEndPoint().getY());
		System.out.println("X koordinata početne tačke linije l1: " + l1.getStartPoint().getX());
		
		// Izračunati dužinu linije l1
		System.out.println("Duzina linije l1 je: " + l1.length());
		
				
		// 5. Postaviti x koordinatu krajnje tačke linije l1 na vrednost
		// dužine linije l1 umanjene za vrednost zbira x i y koordinate 
		// početne tačke linije l1
		
		l1.getEndPoint().setX( (int) l1.length() - (l1.getStartPoint().getX() + l1.getStartPoint().getY()));
		System.out.println("X koordinata krajnje tačke linije l1: " + l1.getEndPoint().getX());
		
		
		// 6. Postaviti x koordinatu tačke gore levo pravougaonika r1 na vrednost 10
		// i y koordinatu na vrednost 15
		r1.setUpperLeftPoint(new Point());
		r1.getUpperLeftPoint().setX(10);
		r1.getUpperLeftPoint().setY(15);
		System.out.println("X koordinata tačke gore levo pravougaonika r1:" 
				+ r1.getUpperLeftPoint().getX());
		System.out.println("Y koordinata tačke gore levo pravougaonika r1:" 
				+ r1.getUpperLeftPoint().getY());
		
		// Povrsina i obim pravougaonika r1
		r1.setWidth(20);
		r1.setHeight(10);
		System.out.println("Površina pravouaonika r1 je: " + r1.area());
		System.out.println("Obim pravougaonika r1 je: " + r1.circumference());
		
		
		// 7. Postaviti centar kruga c1 na  koordinate tačke gore levo pravougaonika r1
		
		c1.setCenter(r1.getUpperLeftPoint());
		System.out.println("X koordinata centra kruga c1 je: " + c1.getCenter().getX());
		System.out.println("Y koordinata centra kruga c1 je: " + c1.getCenter().getY());
		
		// 8. Postaviti x koordinatu centra kruga c1 na vrednost razlike 
		// povrsine pravougaonika r1 i y koordinate pocetne tacke linije l1
		
		c1.getCenter().setX(r1.area() - l1.getStartPoint().getY());
		System.out.println("X koordinata centra kruga c1 je: " + c1.getCenter().getX());
		
		//Vežbe 4
		
		System.out.println(point1.toString());
		System.out.println(point1);
		System.out.println(l1);
		System.out.println(c1);
		System.out.println(r1);
		
		int a = 5; //primitivni tip int
		int b = 5; 
		System.out.println(a == b);
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1 == s2);  //poredjenje po referenci
		System.out.println(s1.equals(s2)); // poredjenje po vrednosti
		
		Point p3 = new Point(23, 5);
		System.out.println(point1 == p3);
		System.out.println(point1.equals(p3));

	}

}
