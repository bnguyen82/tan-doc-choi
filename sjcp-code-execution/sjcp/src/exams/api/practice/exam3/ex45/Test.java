package exams.api.practice.exam3.ex45;

public class Test {
public static void main(String... args){
	  Integer i1 = 2001;  // set 1 
	  Integer i2 = 2001; 
	  System.out.println((i1 == i2) + " " + i1.equals(i2));  // output 1 
	  Integer i3 = 21;   // set 2 
	  Integer i4 = new Integer(21); 
	  System.out.println((i3 == i4) + " " + i3.equals(i4));  // output 2 
	  Integer i5 = 21;   // set 3 
	  Integer i6 = 21; 
	  System.out.println((i5 == i6) + " " + i5.equals(i6));  // output 3
	  String s1="1";
	  String s2="1";
	  System.out.println((s1 == s2) + " " + i5.equals(i6));  // output 3
}
}
