package geometry;

public class Donut extends Circle {

	private int innerRadius;
	
	public Donut() {

	}
	
	public Donut(Point center, int radius, int innerRadius) {
		super(center, radius);
		this.innerRadius = innerRadius;
	}
	
	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		super(center, radius, selected);
		this.innerRadius = innerRadius;
	}
	
	@Override
	public double area() {
		return super.area() - innerRadius*innerRadius*Math.PI;
	}

	@Override
	public double circumference() {
		return super.circumference() + 2*innerRadius*Math.PI;
	}

	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	} 
	
	
}
