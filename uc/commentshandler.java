import java.util.*;
import java.io.*;
public class commentshandler{

void central()throws IOException{
Scanner sc=new Scanner(System.in);
Scanner sc1=new Scanner(System.in);
reader r1=new reader();
System.out.println("*Please leave your review about the converter below\n*Please type your name(space) review\n*To view the older reviews type 'previous'  ");
String m=r1.readonly(),q="";
boolean a=true;
String d=sc.next();
if(d.equals("previous")){
int o=m.length();
for(int i=0;i<o;i++){
char c;
c=m.charAt(i);
if(c!='%')
System.out.print(c);
else
System.out.print("\n");
}
System.out.print("\n");
}
else
{
a=false;
String n2=sc.nextLine();
 q=d+':'+n2;
}
if(a){
System.out.println("Please give your name(a space) followed by your views about the converter");
String n=sc1.next();
n=n+':';
String n1=sc1.nextLine();
 q=n+n1;}
r1.readtowrite(q);
}
}





