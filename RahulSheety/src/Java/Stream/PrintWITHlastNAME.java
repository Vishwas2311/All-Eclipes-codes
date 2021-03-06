package Java.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class PrintWITHlastNAME {

	//Stream will collect the data
	//filter - it will apply the condition to the stream
	//map-map will modify the stream as per condition
	//for each - will help to print the statement
	//collect- collect Methods will colectors.toList
	
	@Test
	 public void printWithLastName() {
		 
     Stream.of("Accenture","Vishwas","Shinde","Suraj","Mira","Babasaheb").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
     }
	
	//using array and converting the array to the ARRAY LIST
	@Test
	public void ArrayList() {
		List<String>  names= Arrays.asList("Accenture","Vishwas","Shinde","Suraj","Mira","Babasaheb");
		
		names.stream().filter(s->s.startsWith("S")).limit(2).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	}
	
	
	
}


