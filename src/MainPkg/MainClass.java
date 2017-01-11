
package MainPkg;
/**
 * 
 * Author: Darlene January 2017
 */
  public class MainClass {
  
/**
 * public static void main is my main method required in every MainClass
 * It is a system defined argument for the Package so the program knows where to start
 * you cannot use "main" in any other method in the Package
 * 
 * @param args
 */
    public static void main(String[] args){
        System.out.println("Hello World");
        
        int myNumber = 44;
        System.out.println(myNumber);
        
        String text = "Hello";
        String blank = " ";
        String name = "Bob";
        String greeting = text + blank + name;
        
        System.out.println(text+blank+name);
        System.out.println(greeting);
        System.out.println("My Number is: " + myNumber);

        

                
        }
    }

