import java.util.*;
public class formatter{

String dub(double k,String b){
String a="";
Formatter ft =new Formatter();
if(k>1000)
{
ft.format("%,.2f",k);
System.out.println(ft+b);
}else
System.out.println(k+b);
return a;
}
String dub1(int k){
String a="";
Formatter fg=new Formatter();
if(k>1000)
{

fg.format("%,d",k);
System.out.print(fg);
}else
System.out.print(k);
return a;
}


}
