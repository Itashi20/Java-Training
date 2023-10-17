package methodRef;

import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lst.stream().sorted().map(String::toLowerCase).forEach(System.out::println);
List<Person>p=Person.createRoster();
		//p.stream().map(mp->mp.getName()).forEach(System.out::println);
	//	p.stream().filter(e -> e.getGender() == Person.Sex.MALE).forEach(e -> System.out.println(e.getName()));
		
System.out.println(p.stream().filter(e -> e.getGender() == Person.Sex.MALE).mapToInt(Person::getAge).average().getAsDouble());

		

	}

}
