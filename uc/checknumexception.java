import java.io.*;
public class checknumexception{
  static 
  int check()throws IOException
  { 
      commentshandler y= new commentshandler();
      BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
      int k=0;try{k=Integer.parseInt(in.readLine());}
      catch(NumberFormatException sdfgs){System.out.println("Give correct numerical value");k=check();}
      return k;}}
      
      
      
      