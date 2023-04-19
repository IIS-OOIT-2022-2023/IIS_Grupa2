package geometry;

import java.awt.Graphics;

public class Rectangle extends Shape{

	private Point upperLeftPoint;
	// private int xCoordUpperLeft;
	// private int yCoordUpperLeft;
	private int width;
	private int height;
		
	public Rectangle() {
	
	}

	public Rectangle(Point upperLeftPoint, int width, int height) {
		this.upperLeftPoint = upperLeftPoint;
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point upperLeftPoint, int width, int height, boolean selected) {
		this(upperLeftPoint, width, height);
		this.selected = selected;
	}

	// Povr�ina pravougaonika P = w*h
	public int area() {
		return width * height;
	}
	
	// Obim pravougaonika O = 2*w + 2*w
	public int circumference() {
		return 2 * (width + height);
	}
	
	public String toString() {
		return "Upper left point: " + upperLeftPoint + ", width = " + width 
				+ ", height = " + height;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle pomocna = (Rectangle) obj;
			if (this.upperLeftPoint.equals(pomocna.upperLeftPoint) && this.width == pomocna.width 
					&& this.height == pomocna.height)
				return true;
			else 
				return false;
		} else
			return false;
	}
	
	public boolean contains(int x, int y) {
		return (x >= this.upperLeftPoint.getX() 
				&& x <= this.upperLeftPoint.getX() + width
				&& y >= this.upperLeftPoint.getY()
				&& y <= this.upperLeftPoint.getY() + height);
	}

	
	// Metode pristupa
	public Point getUpperLeftPoint() {
		return upperLeftPoint;
	}
	public void setUpperLeftPoint(Point upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void draw(Graphics g) {
		g.drawRect(upperLeftPoint.getX(), upperLeftPoint.getY(), width, height);
		
	}

	@Override
	public void moveTo(int x, int y) {
		this.upperLeftPoint.moveTo(x,y);
		
	}

	@Override
	public void moveBy(int byX, int byY) {
		this.upperLeftPoint.moveBy(byX,byY);
		
	}
	
	public int compareTo(Object o) {
		if (o instanceof Rectangle)
			return (int) (this.area() - ((Rectangle) o).area());
		return 0;
	}
}
