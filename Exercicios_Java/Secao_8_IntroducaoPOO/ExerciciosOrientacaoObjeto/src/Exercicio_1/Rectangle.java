package Exercicio_1;

public class Rectangle {
	public double width;
	public double height;
	
	public double Area() {
		return width * height;
	}
	
	public double Perimeter(){
		return (width + height) * 2;
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public String toString() {
		return "AREA: "
				+ String.format("%.2f", Area())
				+ " PERIMETER: "
				+ String.format("%.2f", Perimeter())
				+ " DIAGONAL: "
				+ String.format("%.2f", Diagonal());
	}
	

}
