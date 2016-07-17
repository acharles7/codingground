import java.util.Scanner;

public class HelloWorld{

     public static void main(String []args){
        int a;
        int vowels=0;
        int conso=0;
        int space=0;
        String str;
        
      /*  Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number");
        a = sc.nextInt();
        System.out.println("Number is"+a);*/
        
        Scanner scc = new Scanner(System.in);
        
        System.out.println("Enter String");
        str = scc.nextLine();
        System.out.println("String is"+" "+str);
        
        for(int i=0;i<str.length();i++)
        {
            char l = str.charAt(i);
            
            if(l=='a'||l=='e'||l=='i'||l=='o'||l=='u')
            vowels++;
            else if(l==' ')
            space++;
            else
            conso++;
        }
        System.out.println("Vowels="+vowels+"\nConsonents ="+conso+"\nSpaces ="+space);
        
        
     }
}
