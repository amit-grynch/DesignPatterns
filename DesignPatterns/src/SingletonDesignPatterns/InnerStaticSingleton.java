package SingletonDesignPatterns;

public class InnerStaticSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      InnerSingleton singleton= InnerSingleton.getInstance();
      System.out.println("InnerSingleton:"+singleton);
	}
}

class InnerSingleton{
	private InnerSingleton() {	
	}
	 static class Innerstatic{
		private static final InnerSingleton SINGLETON=new InnerSingleton();
		}
	 public static InnerSingleton getInstance() {
			return Innerstatic.SINGLETON;
		}

}


