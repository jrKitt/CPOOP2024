package Lab04;

public class Rectangle {
	private double w;
	private double l;
	
	Rectangle(double w, double l){
		this.w = w;
		this.l = l;
	}
	
	public double getW() {
		return w;
	}
	
	public double getL() {
		return l;
	}
	
	public void setW(double w) {
		this.w = w;
	}
	
	public void setL(double l) {
		this.l = l;
	}
	
	public double calArea(double w, double l) {
		return w * l;
	}
}
