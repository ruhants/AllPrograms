package StringArraysProgram;

public class Singleton {
	// to hold singleton instance
	public static Singleton instance;

	// Private constructor to prevent instantiation
	private Singleton() {

	}

	// Public static method to provide access to the instance
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;

	}

	public void message() {
		System.out.println("singleton method");
	}

	public static void main(String[] args) {
		 // Get the single instance of Singleton
		Singleton singleton = Singleton.getInstance();
		singleton.message();
	}

}
