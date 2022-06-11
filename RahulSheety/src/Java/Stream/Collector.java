package Java.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Collector {
//Collector USE
	
	@Test
	public void Morethan4Length() {
	List<String> LIST=	Stream.of("Accrenture","Zescal","Amazon","Flipkart","Adam","Alekhya","Aradhya").
		filter(s->s.length()>4).collect(Collectors.toList());
		System.out.println(LIST);
    }
	
	
	
	
	
	
}
