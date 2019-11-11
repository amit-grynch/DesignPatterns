package FacetedBuilder;

public class PersonFacetBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      PersonBuilder pd=new PersonBuilder();
       Person person=pd.returnPersonAddressBuilderInstance().assginCity("Bangalore").assignState("Karnataka").assignPincode("560103").returnPersonJobBuilderInstance().
    		   workingPosition("Developer").workinngCompanyName("Google").withDrawSalary("123456").build();
       System.out.println(person);
	}

}

class Person{
	//Person Address
	public String city,state,pincode;
	//Person Job
	public String companyName,position,salary;
	@Override
	public String toString() {
		return "Person [city=" + city + ", state=" + state + ", pincode=" + pincode + ", companyName=" + companyName
				+ ", position=" + position + ", salary=" + salary + "]";
	}
	
}

class PersonBuilder{
	Person person=new Person();
    public Person build() {
    	return person;
    }
    
    public PersonAddressBuilder returnPersonAddressBuilderInstance() {
    	return new PersonAddressBuilder(person);
    }
    public PersonnJobBuilder returnPersonJobBuilderInstance() {
    	return new PersonnJobBuilder(person);
    }
}


class PersonAddressBuilder extends PersonBuilder{
	PersonAddressBuilder(Person Person){
		this.person=person;
	}
	public PersonAddressBuilder assginCity(String city) {
		person.city=city;
		return this;
	}
	public PersonAddressBuilder assignState(String state) {
		person.state=state;
		return this;
	}
	public PersonAddressBuilder assignPincode(String pincode) {
		person.pincode=pincode;
		return this;
	}
}

class PersonnJobBuilder extends PersonBuilder{
	public PersonnJobBuilder(Person person){
		this.person=person;
	}
	 public PersonnJobBuilder workinngCompanyName(String companyName) {
		 person.companyName=companyName;
		 return this;
	 }
	 
	 public PersonnJobBuilder workingPosition(String position) {
		 person.position=position;
		 return this;
	 }
	 public PersonnJobBuilder withDrawSalary(String salary) {
		 person.salary=salary;
		 return this;
	 }
}