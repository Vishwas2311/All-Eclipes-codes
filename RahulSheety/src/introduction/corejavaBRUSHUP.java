package introduction;

import java.util.ArrayList;

import org.checkerframework.checker.units.qual.A;

public class corejavaBRUSHUP {

	public static void main(String[] args) {
		//VERIABLES & DATATYPES SECTION 3 
		
		//ALL VERIABLES ARE MEANING LESS IN JAVA WITHOUT DTAT TYPES
		
		int mynum=5;
		
		String website="www.udemy.com";         //Non primitive data type
		
		char letter= 'r';
		
	    double  decimal=6.88;      float decimal1 =(float) 5.79; 
	    
	    boolean BUSisRED = true ;   
	    
	    System.out.println(mynum+"=it spell five");
	    
	    
	    //Arrays = 
	    int[] arr=new  int[10];		// int[10] is value stored in variable called "arr"  
	                                 // [] this bracket means number of Arrays present in the one veriable "arr" 
	    arr[0]=9;
	    arr[1]=5;
	    arr[2]=9;
	    arr[3]=5;
	    arr[4]=7;                    //we can put amount of numbers in memory with the help of INDEX starting from 0 TO INFINITY,
	    arr[5]=7;
	    arr[6]=9;
	    arr[7]=1;
	    arr[8]=2;
	    arr[9]=2;
	 //System.out.println(arr[0]);       //for printing in console we need to put 'INDEX' in SYSO
     //System.out.println(arr[1]);  
     //System.out.println(arr[2]); 
     //System.out.println(arr[3]);
     //System.out.println(arr[4]);
     //System.out.println(arr[5]);
     //System.out.println(arr[6]);
     //System.out.println(arr[7]);
     //System.out.println(arr[8]);
     //System.out.println(arr[9]);
     
     
     int[]arr2= {9,5,9,5,7,7,9,1,2,2};     //directly can be assined value for int with numbers ,
     //System.out.println(arr2[5]);
     
     
     
     // FOR LOOP                            //for loop will be used for print the number of variable in the console
      
     for(int i=0;i<arr.length; i++)
     {
    	  System.out.println(arr[i]);
     }
     
     for (int i=0;i<arr2.length; i++)
     {
    	 System.out.println(arr2[i]);
     }
     
     
     String[]name= {"Vishwas","Shinde","Accenture"};    //String can be printed with FOR LOOP as per below
     
     for(int i=0; i<name.length; i++)
     {
    	 System.out.println(name[i]);
     }
     

     
     //enhancer for loop
    
     for(  String s: name)
     {
    	System.out.println(s);
     }
     
     
     // this will give you multiple of 2 in output with "if" & "else condition"
     
     int[] arr3= {1,2,3,4,5,6,7,8,9,10,22,33,55,66,77,88,99};
     
     for(int i=0; i<arr3.length ; i++)
     {
    	 if (arr3[i] %2 ==0)
    	 {
    		 System.out.println(arr3[i]);   
    		 //break;                              this will break the for loop after one loop it wont continue the loop 
    	 }

    	 else 
    	 {
    		 System.out.println(arr[3]+"this are not the multiple of 2");
    	 }
     }
     
     
     
     
     //Array list  &  Difference between ArrayList & Array
    
     // this will use in dynamic array list that you don't know array size ,
     //you can add number of Array after word 
     
    
     
     //ArrayList one of the class in JAVA
    //there is one package created on upper side for Array class
    // create object of class - object .method  
    //JAVA have 100 of classes so to acsess that particular classes you need to add that package.  (just need to import that package) 
    //new object will a locate a memory to variable
    
     ArrayList<String> v= new ArrayList<String>();
    v.add("shinde");
    v.add("Vishwas");
    v.add("accenture");  
    v.add("Wipro");
    v.add("cognizant");
    //v.remove(2);    with this syntax it won't count in the ArrayList.
    System.out.println(v.get(4));             // In Normal method we use "arr[4];"  
    
    
    
    
    
    //Strings in JAVA
    
    //String is an object it represent the sequence of characters 
    
    
    //THIS is String literal
    String s="Vishwas Shinde Wipro Accencure";
                                                      //if the TEXT is same no matter how many object you are creating it will assume it with 1 object
   
    //new memory a locate                             //in this case no matter character are same it explicitly create new object 
    String s2=new String("Wipro Accencure"); 
    String s3=new String("Wipro Accencure");
    
    //if i want to break in white space 
    String s1="Vishwas Shinde Wipro Accencure";        //  String s1="0 , 1, 2, 3, 4"   this is the counting of the numbers
    String[]splittedString=(s1.split(" "));            //when multiple String are there so "String[]splittedString " Hold all multiple Strings
    System.out.println(splittedString[0]);             //in this white space will assume as a breaker for charachters  
    System.out.println(splittedString[1]);
    System.out.println(splittedString[2]);                
    System.out.println(splittedString[3]);               //Vishwas
                                                         //Shinde
                                                         //Wipro
                                                         // Accencure
    String s5="Vishwas Shinde Wipro Accencure";
    String[]splittedString2=(s5.split("Shinde"));            
    System.out.println(splittedString2[0]);            //Two Strings will be created after spliting it
    System.out.println(splittedString2[1]);            // in this case it will create LEFT side String and Right side String
    System.out.println(splittedString2[1].trim());     //this will remove the white space from that String
    for(int i =0;i<s5.length();i++)
    {
    	System.out.println(s5.charAt(i));              // this is not directly an Array thats why we need to add "CharA"
    }
                     
    for(int i=s5.length()-1;i>=0;i--) 
    {
    	System.out.println(s5.charAt(i));
    }


    
	}

}
