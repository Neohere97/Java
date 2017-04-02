import java.io.*;
public class writer{
void write(String t)throws IOException{
FileOutputStream fit;
formatter g=new formatter();
try{
fit=new FileOutputStream("comments.txt");
}
catch(FileNotFoundException e){return;}
catch(ArrayIndexOutOfBoundsException e){return;}
int u=t.length();
for(int i=0;i<u;i++)
{
char c;
c=t.charAt(i);
fit.write(c);
}

}}