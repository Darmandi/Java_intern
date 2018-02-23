package ru.job4j.condition;

public class Point {
	private int x;
	private int y;
	private int z;

	public Point(int dim1, int dim2, int dim3) {
		this.x = dim1;
		this.y = dim2;
		this.z = dim3;
	}

	public double distance(Point second) {
		return  Math.sqrt(Math.pow(this.x - second.x, 2) + Math.pow(this.y - second.y, 2) + Math.pow(this.z - second.z, 2));
	}

	public static void main(String[] args) {
		Point a = new Point(1, 1, 1);
		Point b = new Point(2, 2, 2);

		System.out.println("x1 = " + a.x + "  y1 = " + a.y + "  z1 = " + a.z);
		System.out.println("x2 = " + b.x + "  y2 = " + b.y + "  z2 = " + b.z);

		System.out.println("Расстояние между точками А и В : " + a.distance(b));
	}
}