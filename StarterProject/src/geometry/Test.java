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
		
		

	}

}
