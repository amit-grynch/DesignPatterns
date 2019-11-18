package SingletonDesignPatterns;

import java.io.File;
import java.io.IOException;

public class SingletonUsingStaticBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StaticBlockSingleton singleton=StaticBlockSingleton.getInstance();
        System.out.println("Singleton instance"+singleton);
	}

}

class StaticBlockSingleton{
	static {
		try {
			singleton=new StaticBlockSingleton();
		}catch(Exception e) {
			System.out.println("Error in creating singleton object");
		}
	}
	private StaticBlockSingleton() throws IOException {
		System.out.println("Object Inisilization is in process..");
		File.createTempFile(".", ".");
	}
	
	public static  StaticBlockSingleton singleton;
	
	public static StaticBlockSingleton getInstance() {
		return singleton;
	}
}
