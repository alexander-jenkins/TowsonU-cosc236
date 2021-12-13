/*
 * Alex Jenkins
 * 5/17/2020
*/
public class Rectangle {
	// fields
	private int width;
	private int height;
	// methods
	// these methods get the fields
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getArea() {
		return width * height;
	}
	// these methods set the fields
	public void setWidth(int w) {
		width = w;
	}
	public void setHeight(int h) {
		height = h;
	}
}
