package Java.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class DirectlyintoSTREAM {
	
	
	//filter - is condition 
	//ForEach - will scan all Script and help to print
	//map - will modify the String
	//Sorted -  sorted will sort as per alphabet
	//collect- collect Methods will colectors.toList
@Test
	public void StreamFilter() {
	//directly storing the Strings in the Stream
	List<String> Anames=Stream.of("Accrenture","Zescal","Amazon","Flipkart","Adam","Alekhya","Aradhya").sorted().filter(s->s.contains("A")).collect(Collectors.toList());
	System.out.println(Anames);
	
	//printing counting
	long r=Stream.of("Accrenture","Zescal","Amazon","Flipkart","Adam","Alekhya","Aradhya").filter(s->
	{
		s.startsWith("A");
	return true ;
	}).count();
	System.out.println(r);
	
	
	
	}
	
}
 