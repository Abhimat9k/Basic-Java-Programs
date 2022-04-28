//Objective :- Java program to calculate simple interest.

//Code :-
 class SI {
  	public static void main(String[] a1){ 
	      double p,r,t,si;  	
                  p=Double.parseDouble(a1[0]);  	
                  r=Double.parseDouble(a1[1]);  	
                  t=Double.parseDouble(a1[2]);  	
                  si=(p*r*t)/100; 
 	      System.out.println("Simple Interest="+si);
                    
 	} 
}


//Objective :- Input character and check, it is vowel or consonant without using if-else statement.

//Code :-
 import java.util.*;
 class Lab2 {
  	public static void main(String[] a1) { 
             Scanner sc=new Scanner(System.in);   
             System.out.print("\n Enter a character = ");  
             char x=sc.next().charAt(0); 
 	  String r = (x=='a'||x=='e'||x=='i'||x=='o'||x=='u'
                                  ||x=='A'||x=='E'||x=='I'||x=='O'||x=='U')?"Vowel":"Consonant"; 
 	 System.out.println("The character is a "+r); 
             
 	} 
 }


//Objective :- Java program to print Fibonacci series for the first 100 values. Do not print the value if divided by 5. 

//Code :-
 import java.util.*;
 class Fibo { 
     public static void main(String[] a1){ 
        int n,Term1 = 0, Term2 = 1;
        Scanner sc=new Scanner(System.in);  
        System.out.print("\n Enter number of terms = "); 
        n=sc.nextInt(); 
        System.out.println(" Fibonacci Series till " + n + " terms is"); 
        for (int i = 1; i <= n; ++i) {
               System.out.print(" " + Term1 );  	
               int nextTerm = Term1 + Term2; 
               Term1 = Term2;  	
               Term2 = nextTerm;  	
               if(Term1%5==0){
                    nextTerm = Term1 + Term2; 
                    Term1 = Term2; 
                    Term2 = nextTerm; 
 	   } 
        } 
     } 
} 


//Objective :- Java program to find the maximum number among 10 numbers. 

//Code :-   
import java.util.*;
class maxNo {
  public static void main(String[] a1){
    Scanner sc=new Scanner(System.in); 
    int max=0,n,i;  
    System.out.print(" \nEnter ten numbers = ");
    for(i=1;i<11;i++){     
         n=sc.nextInt();  
        max=Math.max(n,max); 
     } 
   System.out.println("  "+max+" is the largest number"); 
   
   } 
}


//Objective :- Java program to sort 10 names in ascending order using the String array. 

//Code :-
import java.util.*; 
class namesorting { 
  public static void main(String[] a1)  { 
    Scanner sc=new Scanner(System.in); 
    String[] name=new String[10];
    for(int i=1;i<=10;i++){ 
    System.out.print(" Enter name "+i+" -- "); 
    name[i-1]=sc.next();  } 
    String t;
    for(int j=0;j<10;j++){
     for(int k=j+1;k<10;k++){
      if(name[j].compareTo(name[k])>0){ 
 	t=name[j];  	
        name[j]=name[k]; 
 	name[k]=t; } } } 
    System.out.print(" Names in order are -- "); 
    for(int l=0;l<10;l++){  
         System.out.print(name[l]+" ");  
        } 
     
    } 
}                


//Objective :- Java program to create a class teacher with teacherid and name. There are two types of teachers in college. 1. Programming teacher and 2. Theory teacher. Every type of teacher has the subject allocated to them in a semester. Display details of minimum two teachers with their id, name and subject.

//Code :-  import java.util.*;
   class teacher{ 
    String Name,Course,Type;  
    int teacherid;
    void input(){  
      Scanner sc=new Scanner(System.in); 
      System.out.print(" Enter name of the teacher -- "); 
      Name=sc.next(); 
      System.out.print("Enter Course - "); 
      Course=sc.next(); 
      System.out.print("Enter teacher ID = "); 
      teacherid=sc.nextInt(); 
      while(true){  
      System.out.print("Enter teacher type -- "); 
      Type=sc.next(); 
      if(Type.equalsIgnoreCase("Programming")||Type.equalsIgnoreCase("Theory"))  break;
     }
   }  
      void display(){ 
      System.out.println("Teacher name:-"+Name); 
      System.out.println("Teacher ID:-"+teacherid); 
      System.out.println("Course:-"+Course);  
      System.out.println("Teacher type:-"+Type);
   }  
      public static void main(String[] a1){  
      teacher t1=new teacher(); 
      t1.input();  
      t1.display();  
      teacher t2=new teacher(); 
      t2.input();  
      t2.display();
    }
}


//Objective :- Java program to create an interface for simple calculator to perform +, - , *, / and %. Implement this interface in a class. 

//Code :- 
import java.util.*; 
interface Calculator{
double add(double a,double b);
double multiply(double a,double b);
double subtract(double a,double b);
double division(double a,double b);
double modulus(double a,double b);
}
class SimpleCal implements Calculator{
  public double add(double a,double b){return a+b;}        
public double multiply(double a,double b){return a*b;}
public double subtract(double a,double b){ return a-b;}
public double division(double a, double b){return a/b;}
public double modulus(double a, double b){return a%b;}
public static void main(String[] a1){
SimpleCal obj = new SimpleCal();
Scanner sc=new Scanner(System.in);
    System.out.print("\n Enter mathematical expression = "); 
    int a=sc.nextInt();
    char ch=sc.next().charAt(0); 
    int b=sc.nextInt();
  switch(ch){ 
     case '+':  
    System.out.println("Result : "+obj.add(a,b)); break; 
     case '-':  
    System.out.println("Result : "+obj.subtract(a,b)); break;
     case '*':  
    System.out.println("Result : "+obj.multiply(a,b)); break; 
     case '/':  
    System.out.println("Result : "+obj.division(a,b)); break; 
    case '%':  
    System.out.println("Result : "+obj.modulus(a,b)); break;
     default: 
    System.out.println("Invalid Input!!!"); }
     }
}







