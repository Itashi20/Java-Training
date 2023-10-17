 package product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ProductMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Product pro=new Product();
		ArrayList<Product> al=new ArrayList<>();
		
		
		al.add(new Product(1,"TV","Electronics",900000));
		al.add(new Product(2,"laptop","Electronics",100000));
		al.add(new Product(3,"bike","vehicles",800000));
		al.add(new Product(4,"car","vehicles",900000));
		al.add(new Product(5,"mango","fruit",700000));
		al.add(new Product(6,"truck","vehicles",300000));
		al.add(new Product(7,"microwave","Electronics",950000));
		al.add(new Product(8,"geyser","Electronics",900000));
		al.add(new Product(9,"fan","Electronics",70000));
		al.add(new Product(10,"apple","fruit",30000));
		
		
		//List<String> categ = al.stream().map(e->e.getCategory()).collect(Collectors.toList());
		//categ.stream().forEach(System.out::println);
		
		
		Map<Object,List<Product>> product=al.stream().collect(Collectors.groupingBy(i->i.getCategory()));
		for (Map.Entry<String,List<Product>> entry : product.entrySet()) //using map.entrySet() for iteration  
		{  
		//returns keys and values respectively  
		System.out.println("Category: " + entry.getKey() + ", Products: " + entry.getValue());   
		}   
		
		Integer max= al.stream().collect(Collectors.groupingBy(i->i.getCategory().mapToInt(i->i.getPrice().max()));
		//Integer max = al.stream().mapToInt(v -> v).max()
		
		

	}

}
