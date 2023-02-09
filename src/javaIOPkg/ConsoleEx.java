import java.io.Console;  
class ConsoleEx{    
public static void main(String args[]){    
Console c=System.console();    
System.out.println("Enter your name: ");    
String n=c.readLine();    
System.out.println("userbame "+n);  
System.out.println("Enter your password: ");   
char[] ch = c.readPassword();

String ps = String.valueOf(ch);
System.out.println("password "+ps);
}    

}  
