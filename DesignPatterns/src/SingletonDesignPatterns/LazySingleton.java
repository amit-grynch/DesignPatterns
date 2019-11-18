package SingletonDesignPatterns;

public class LazySingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazySingltonClass lazy=LazySingltonClass.getInstance();
		System.out.println("LazySingtonClass:"+lazy);

	}

}

class LazySingltonClass{
	private static LazySingltonClass singleton;
	private LazySingltonClass() {
		
	}
	public static synchronized LazySingltonClass getInstance() {
		if(singleton==null) {
			singleton=new LazySingltonClass();
		}
		return singleton;
	}
}
