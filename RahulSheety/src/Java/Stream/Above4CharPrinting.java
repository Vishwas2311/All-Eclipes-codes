package Java.Stream;

import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Above4CharPrinting {
@Test           //for testNG we have create class

//printing the names above 4 character with Stream and Lambda Expression
//filter - is condition 
//ForEach - will scan all Script and help to print
//collect- collect Methods will colectors.toList
	public void Morethan4Length() {
	Stream.of("Accrenture","Zescal","Amazon","Flipkart","Adam","Alekhya","Aradhya").filter(s->s.length()>4).forEach(s->System.out.println(s));

}

//printing the names with uyppercase in MAP command
//Map - help to modify out stream result 
@Test
 public void Map() {
	 //printing the result with upper case 
	 Stream.of("Arav","Zescal","Amit","Flipkart","Amar","Alekhya","Ananya").filter(s->s.startsWith("A")).map(s->s.toUpperCase()).forEach(s-> System.out.println(s));

 }

@Test
public void Above4withLIMIT() {
	
Stream.of("Kaveri","Amazon3","Laptop","Arush3","Abhay","Akshay").filter(s->s.startsWith("A")).limit(2).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
} 

 








}
