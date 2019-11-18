package SingletonDesignPatterns;

public class BasicSinletonImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BasicSingleton basicSingleton =BasicSingleton.getInstance();
      basicSingleton.setValue(123);
      System.out.println("Value variable is ="+basicSingleton.getValue());
      System.out.println("Class Object is="+basicSingleton);
	}

}

class BasicSingleton{
	public static final BasicSingleton SINGLETON=new BasicSingleton();
	private int value;
	private BasicSingleton() {
		
	}
	public static BasicSingleton getInstance() {
		return SINGLETON;
	}
	public int getValue() {
		return value;
	}
	/*@Override
	public String toString() {
		return "BasicSingleton [value=" + value + "]";
	}*/
	public void setValue(int value) {
		this.value = value;
	}
	
}
