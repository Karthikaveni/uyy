# uyy
import java.io.*;
import java.util.*;
public class workingday
{
    public static void main(String args[])throws IOException
    {
        
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the day");
    String str=br.readLine();
        
    if(str.equalsIgnoreCase("monday")||str.equalsIgnoreCase("tuesday")||str.equalsIgnoreCase("wednesday")||str.equalsIgnoreCase("thursday")||str.equalsIgnoreCase("friday"))
    System.out.println("Given day is wroking day");
    if(str.equalsIgnoreCase("sunday")||str.equalsIgnoreCase("saturday"))
    System.out.println("Given day is not a wroking day");
        
        }
        
        }
