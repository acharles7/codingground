import java.util.Scanner;
import java.util.*;
//java program to identify whether string is Palindrome or not.
public class Palindrome{

public static void main(String []args){
    String original,reverse="";
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter String : ");
    original = sc.nextLine();
    int l = original.length();
    
    for(int i=l-1;i>=0;i--){
        reverse = reverse + original.charAt(i);
    }
    
    if(original.equals(reverse))
    System.out.println("String is Palindrome");
    else
    System.out.println("String is NOT Palindrome");
 
 
 
 
 
    
}
}
