package ru.job4j.condition;

public class Point {
	private int x;
	private int y;


	public Point(int dim1, int dim2) {
		this.x = dim1;
		this.y = dim2;

	}

	public double distance(Point second) {
		return  Math.sqrt(Math.pow(this.x - second.x, 2) + Math.pow(this.y - second.y, 2));
	}

	public static void main(String[] args) {
		Point a = new Point(1, 1);
		Point b = new Point(2, 2);

		System.out.println("x1 = " + a.x + "  y1 = " + a.y);
		System.out.println("x2 = " + b.x + "  y2 = " + b.y);

		System.out.println("Расстояние между точками А и В : " + a.distance(b));
	}
}