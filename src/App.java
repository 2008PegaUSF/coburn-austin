import myPackage.*;
import myPackage.SomeClass;


public class App {

	public static void main(String[] args) {

		SomeClass someclass = new SomeClass();
		someclass.printAMessage();
		someclass.setCName("Something");
		
		printObjectMessage(someclass);
		doInterfaceThings(someclass);
	}
	
	
	public static void printObjectMessage(MyParent mp) {
		mp.printAMessage();
	}
	
	public static void doInterfaceThings(MyInterface i) {
		i.interfaceMessage();
	}

}
