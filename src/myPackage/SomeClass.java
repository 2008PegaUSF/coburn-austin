package myPackage;

public class SomeClass extends MyParent implements MyInterface {
	private String className = "";
	
//	public void printAMessage() {
//		System.out.println("A message");
//	}
	
	public String getCName() {
		return className;
	}
	
	public void setCName(String className) {
		this.className = className;
	}

	@Override
	public void interfaceMessage() {
		System.out.println("Interface Message");
	}
	
	
}
