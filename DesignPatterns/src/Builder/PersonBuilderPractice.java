package Builder;

public class PersonBuilderPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonBuilder pb=new PersonBuilder();
		Person per=pb.buildName("amit").build();
		//pb.buildName("sharma");
		System.out.println(per);

	}

}

class Person{
	public String name;
	public String position;
	@Override
	public String toString() {
		return "Person [name=" + name + ", position=" + position + "]";
	}
}

class PersonBuilder{
	Person person=new Person();
	public PersonBuilder buildName(String name) {
		person.name=name;
		return this;
	}
	public Person build() {
		return person;
	}
}

