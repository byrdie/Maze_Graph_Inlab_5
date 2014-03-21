

package Maze_Graph;

import java.io.*;
/**
 *
 * @author byrdie
 */
public class FileOut{
   
   PrintStream fout; 
   BufferedReader fin;

 
   FileOut(String filename)
   {
     try{
         fout= new PrintStream(new FileOutputStream(filename));
     }catch(IOException fo){
         System.out.println(fo); 
      }
    }
   FileOut(String filename, String in)
   {
       try{
       fin = new BufferedReader(new FileReader(filename));

     }catch(IOException fo){
         System.out.println(fo); 
      }
    }
   public void writer(String out)
   {
     
         fout.println(out);
      
   }
   public void writer(int out)
   {
     
         fout.println(out);
      
   }
   public void writer(char out)
   {
     
         fout.println(out);
      
   }
   public void writer(double out)
   {
     
         fout.println(out);
      
   }
   public void writer(float out)
   {
     
         fout.println(out);
      
   }
   public String reader(){
      try{
       return fin.readLine();     
       }catch(IOException e){
         System.out.println("error reading from file " + e);
         return null;
       }
   }
}
