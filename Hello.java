import java.io.*;
public class Hello {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
        System.out.println(" Hello World ... " + i);
		}
		validate(13);
	
    }
	
	static void validate(int age){  
     if(age<18)  
      throw new ArithmeticException("not valid");  
     else  
      System.out.println("welcome to vote");  
   }  
}