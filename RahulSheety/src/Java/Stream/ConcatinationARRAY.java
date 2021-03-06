package Java.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConcatinationARRAY {

@Test
public void Boolean() {

	
	//Concatenating  Two Array LIST into Stream and directly applying condition modification

		// Declaring the Array list
		List<String> names=Arrays.asList("Accrenture","Zescal","Amazon","Flipkart","Adam","Alekhya","Aradhya");
		//Declaring the 2nd ARRAY List
		List<String> names2=Arrays.asList("Arun","Avinash","Aradhya","Arya","Ashish");
		
		//concating the stream and String into the Stream.
		Stream<String> StramName =Stream.concat(names.stream(), names2.stream());

		//after storing steam no need to apply stream again.
		//StramName.sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		//using of Assert with Booleans
boolean identifier = StramName.sorted().anyMatch(s->s.equalsIgnoreCase("Avinash"));
	
	System.out.println(identifier);
	Assert.assertTrue(identifier);
}


//filter - is condition 
//ForEach - will scan all Script and help to print
//map - will modify the String
//Sorted -  sorted will sort as per alphabet
//collect- collect Methods will colectors.toList
}