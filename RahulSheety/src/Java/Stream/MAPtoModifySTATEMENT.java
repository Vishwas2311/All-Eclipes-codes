package Java.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class MAPtoModifySTATEMENT {
public static void main(String[] args) {

	ArrayList<String> names =new ArrayList<String>();
	names.add("Accenture");
	names.add("Atlas");
	names.add("Suraj");
	names.add("Vishwas");
	names.add("Shinde");
	names.add("Mira");
	names.add("Babasaheb");
	
}
//ptinting
@Test
public void Map() {
Stream.of("Accenture","Vishwas","Shinde","Suraj","Mira","Babasaheb").filter(s->s.startsWith("A")).limit(1).map(s->s.toUpperCase()).forEach(s->System.out.println(s));


}
}




//filter - is condition 
//ForEach - will scan all Script and help to print
//map - will modify the String
//Sorted -  sorted will sort as per alphabet
//collect- collect Methods will colectors.toList