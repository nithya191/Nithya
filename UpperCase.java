import java.io.*;
 import java.util.*;
  class File
  {
   public static void main (String[] args) 
  {
     try
    {
     FileReader fr = new FileReader("f1.txt");
     BufferedReader br = new BufferedReader(fr);
     PrintWriter out = (new PrintWriter(new FileWriter("f2.txt")));
     String s="";
     while((s = br.readLine()) != null) 
       {
           out.write(s.toUpperCase()+"\n");
      }
     out.close();
     }
      catch(Exception e)
       {
           e.printStackTrace();
       }
   }
 }