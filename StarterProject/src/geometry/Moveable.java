package geometry;

public interface Moveable {

	void moveTo(int x, int y); // kljucne reci public i abstract ne moram da navodim, one se podrazumevaju
	public abstract void moveBy(int byX, int byY); 
}
