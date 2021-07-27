package main;

import demo.NewClass;

public class Runner {

	public static void main(String[] arg) {
		NewClass<Integer, String> i = new NewClass<Integer, String>(2, "Check");
		NewClass<Integer, Double> d = new NewClass<Integer, Double>(2, 3d);

		i.print();
		d.print();

	}
}
