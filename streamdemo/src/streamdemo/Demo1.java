package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lst=new ArrayList<>();
		lst.add("user");
		lst.add("admin");
		lst.add("arvind");
		lst.add("suma");
		
		lst.stream().filter((s)->s.startsWith("a")).map(String::toLowerCase).forEach(System.out::println);
//::method reference
		//foreach terminal
	//map takes value of one type and returns the value of othe rtype
lst.stream().sorted().map(String::toLowerCase).forEach(System.out::println);
	
		//we can store the output of the list 
List<String>newList=lst.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
System.out.println(newList);
System.out.println(lst.stream().sorted().count());


	}

}
