import java.io.*;
public class reader{
formatter f8=new formatter();
 void readtowrite(String y)throws IOException{
    int r,i;
   String s="";
    FileInputStream f;
    writer w=new writer();
   try{
       f=new FileInputStream("comments.txt");
        }
   catch(FileNotFoundException e){return;}
   catch(ArrayIndexOutOfBoundsException e){return;}
   do{
       i=f.read();
       if(i!=-1)
       s=s+((char)i);
    }while(i!=-1);
    s=s+'%'+y;
    w.write(s);
}
String readonly()throws IOException{
 int r,i;
   String s="";
    FileInputStream k;
    k=new FileInputStream("comments.txt");
    commentshandler ch=new commentshandler();
   
   
       { do{
       i=k.read();
       if(i!=-1 && i!=0){
       s=s+((char)i);}
      
    }while(i!=-1);}
     return s;   


}
}    




