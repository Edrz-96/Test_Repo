package demo;

public class NewClass<T, U> {

	T obj1; // An object of type T
	U obj2; // An object of type U

	// Constructor
	public NewClass(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	// Printing objects T and U
	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1.getClass().getName());
		System.out.println(obj2.getClass().getName());
	}

}
