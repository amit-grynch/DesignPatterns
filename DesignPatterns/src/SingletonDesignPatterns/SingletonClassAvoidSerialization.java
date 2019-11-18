package SingletonDesignPatterns;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonClassAvoidSerialization {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Singleton singleton=Singleton.getInstance();
		 singleton.setValue(111);
		 String fileName="Amit.txt";
		  saveToFile(fileName,singleton);
		  Singleton singleton2=readFromFile(fileName);
		  singleton2.setValue(222);
		  System.out.println(singleton==singleton2);
		  System.out.println(singleton.getValue());
		  System.out.println(singleton2.getValue());

	}
   static void saveToFile(String fileName,Singleton singleton) throws Exception {
	   try(FileOutputStream fos=new FileOutputStream(fileName);
			ObjectOutputStream out=new ObjectOutputStream(fos))
	   {
		  out.writeObject(singleton); 
	   }
   catch(Exception exp){
	   
   }
   }
   static Singleton readFromFile(String fileName) throws Exception {
	   try(FileInputStream fis=new FileInputStream(fileName);
		   ObjectInputStream ois=new ObjectInputStream(fis))
	   {
		 return (Singleton) ois.readObject();
	   }
   }
}
 class Singleton implements Serializable{
	private Singleton() {
		
	}
	int value=0;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	protected Object readResolve() {
		return singleton;
	}
	public static Singleton getSingleton() {
		return singleton;
	}
	public static final Singleton singleton=new Singleton();
	public static Singleton getInstance() {
		return singleton;
	}
}
