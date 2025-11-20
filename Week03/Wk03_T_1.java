package Week03;
/**
 * Write a description of class Wk03_T_1 here.
 *Data Type example
 * @author (Ayush)
 * @version (a version number or a date)
 */
public class Wk03_T_1
{
   public static void main(String[]arg)
   {
       /**
        * Finding out Maximum, Minimum, Bytes and size values of integer given by Java.
        * Here Integer; is a wrapper (made for all primitive data types by Java), it is in "Snake case" denoting that it is a 
        * static variable. */
      System.out.println(Integer.MAX_VALUE); 
      System.out.println(Integer.MIN_VALUE);
      System.out.println(Integer.BYTES);
      System.out.println(Integer.SIZE);
      
      // Float
      System.out.print(Float.MAX_VALUE+"\n"+Float.MIN_VALUE+"\n"+Integer.BYTES+"\n"+Integer.SIZE); // using escape sequence
      System.out.println("\n========================================================================");
      
      // Type Casting
      int a = 2;
      float b = a + 22.2f; //implicit type casting
      System.out.println(b);
      int e = (int)b; //explicit type casting
      System.out.println(e);
      float f = 233.3f;
      System.out.println("\n========================================================================");
      
      // ASCII Values
      int AsciiValue = (int)'A';
      System.out.println( (char)AsciiValue+" = "+(AsciiValue)+"\n"+(char)(AsciiValue+10)+" = "+(AsciiValue+10));
      
   }
}