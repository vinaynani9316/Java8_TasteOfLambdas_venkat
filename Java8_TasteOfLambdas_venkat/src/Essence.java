
public class Essence {

	public static void main(String[] args) 
	{
		Thread t= new Thread(() -> System.out.println("in other thread"));
		t.start();
		System.out.println("in main");
	}

}
