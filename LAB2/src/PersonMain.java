
public class PersonMain {
	public static void main(String[] args)
	{
		Person p1 = new Person("Ajit","Kumar",Gender.M, 97682323);
		
		Person p = new Person();
		p.setFirstName("Nitisha");
		p.setLastName("Agarwal");
		p.setGender(Gender.F);
		p.setPhoneNumber(897064011);
		System.out.println("Person Details :");
		System.out.println("___________");
		System.out.println("");
		p.dispfirstName();
		p.dispLastName();
		p.dispGender();
		p.dispPhoneNumber();
		
		System.out.println("Person Details :");
		System.out.println("___________");
		System.out.println("");
		p1.dispfirstName();
		p1.dispLastName();
		p1.dispGender();
		p1.dispPhoneNumber();
	
	}
}
