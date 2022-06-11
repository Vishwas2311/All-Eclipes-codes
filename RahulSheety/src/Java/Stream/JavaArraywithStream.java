package Java.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Test;




public class JavaArraywithStream {
public static void main(String[] args) {

//Arrays names getting with the Uppercase "A"
	ArrayList<String> names = new ArrayList<String>();
	//adding no of arrays in the list
	names.add("Apple");
	names.add("Adem");
	names.add("kavya");
	names.add("Accenture");
	names.add("RedHat");
	names.add("Flipkart");
	names.add("Zscalar");
	
	
	//with for loop iteration .
	for(int i=0;i<names.size();i++) {
		String NAME = names.get(i);
		//if A present that will be SYSO
		if(NAME.startsWith("A")) {
		System.out.println(NAME);
		}	
	}
 
	
	
	//in just One line sorting with Stream
	//Using Stream will write script in one line	
List<String> name=names.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
System.out.println(name);
	
	
	

//filter - is condition 
//ForEach - will scan all Script and help to print
//map - will modify the String
//Sorted -  sorted will sort as per alphabet
//collect- collect Methods will colectors.toList
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
