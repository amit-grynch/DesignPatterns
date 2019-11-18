package SingletonDesignPatterns;

public class DoubleCheckSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LazyDoubleCheckSingleton singleton=LazyDoubleCheckSingleton.getInstance();
       System.out.println("LazyThreadsafe SingleTon:"+singleton);
	}

}

class LazyDoubleCheckSingleton{
	private static LazyDoubleCheckSingleton singleton;
	private LazyDoubleCheckSingleton() {
		
	}
	public static LazyDoubleCheckSingleton getInstance() {
		  if(singleton==null) {
			  synchronized (LazyDoubleCheckSingleton.class) {
				     if(singleton==null) {
				    	 singleton=new LazyDoubleCheckSingleton();
				     }
			}
		  }
		  return singleton;
	}
}
