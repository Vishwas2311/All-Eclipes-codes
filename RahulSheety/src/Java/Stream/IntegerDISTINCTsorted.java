package Java.Stream;
//Distinct - Use to find duplicates from the list

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

//Distinct - Remove Duplicate numbers from list
//Sorted - sort as per number series
public class IntegerDISTINCTsorted {

	@Test
	public void Distinct() {
		//Arrays List
	List<Integer>numbers = Arrays.asList(3,4,6,7,8,2,45,6,7,2,9,34,52,6,43,2,45,67,8);
	//sorted only
	List<Integer> n=numbers.stream().sorted().collect(Collectors.toList());
	System.out.println(n);
	//Distinct & Sorted
	List<Integer> k =numbers.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(k);
	
}
	
	@Test
	public void PrintIndexing() {
		//Array List
		List<Integer> g= Arrays.asList(3,3,4,7,9,4,455,6,7,3,46,3,6,3,66,33,68,35,78);
		//Distinct - Sorted
		g.stream().distinct().sorted().collect(Collectors.toList());
		//SYSO - indexing
		System.out.println(g.get(5));
	}
	
	
	
	
	
}