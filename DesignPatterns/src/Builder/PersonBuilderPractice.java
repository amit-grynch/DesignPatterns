package Builder;

public class PersonBuilderPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeBuilder pb=new EmployeeBuilder();
		Person per=pb.buildName("amit").assignPosition("Developer").build();
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

class PersonBuilder<SELF extends PersonBuilder<SELF>>{
	protected Person person=new Person();
	public SELF buildName(String name) {
		person.name=name;
		return self();
	}
	public Person build() {
		return person;
	}
	public SELF self() {
		return (SELF) this;
	}
}

class EmployeeBuilder extends PersonBuilder<EmployeeBuilder>{
	
	public EmployeeBuilder  assignPosition(String position) {
		person.position=position;
		return self();
	}
	public EmployeeBuilder self() {
		return this;
	}
}

