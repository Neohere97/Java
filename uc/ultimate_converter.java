import java.io.*;
import java.util.Scanner;
public class ultimate_converter

{
formatter f=new formatter();
writer gh=new writer();
checknumexception check=new checknumexception();
     public void main(String args[])throws IOException
     {

        System.out.println("uuu  uuu  lll     tttttttttt iiiiiiiiii  mmm        mmm    a a    tttttttttt  eeeeeeee      ");
        System.out.println("uuu  uuu  lll         tt         ii      mm  m     m mm  aa   aa      tt      ee            ");
        System.out.println("uuu  uuu  lll         tt         ii      mm   m  m   mm  aaaaaaa      tt      eeeeeeee      ");
        System.out.println("uuu  uuu  lll         tt         ii      mm    mm    mm  aa   aa      tt      ee            ");
        System.out.println(" uuuuuu   lllllll     tt     iiiiiiiiii  mm          mm  aa   aa      tt      eeeeeeee      ");
        System.out.println();
        System.out.println(" cccc  oooo   nnn   nn  vv  vv  eeeee  rrrrrr    tttttttt  eeeee  rrrrrr  " );
        System.out.println("cc    oo  oo  nn n  nn  vv  vv  e      rr    rr     tt     e      rr    rr" );
        System.out.println("cc    oo  oo  nn  n nn   v  v   eeeee  rrrrrr       tt     eeeee  rrrrrr  " );
        System.out.println(" cccc  oooo   nn   nnn    v     eeeee  rr    rr     tt     eeeee  rr    rr\n" );

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("WELCOME TO THE ULTIMATE CONVERTER");
        System.out.println("HERE YOU CAN CONVERT ANY PHYSICAL QUANTITY INTO ITS DIFFERENT UNITS AT EASE");
        System.out.println("YOU CAN DO MANY MATHEMATICAL FUNCTIONS");
        System.out.println("**************************************************************");
        System.out.println("**************************************************************");
         System.out.println("Here some complex numbers are generated like 1.7E7, here E7 means that you have to move 7 \n decimal places to the right of the given answer, if it is E-7 the to the left");
        main_menu();
    }
     void main_menu()throws IOException
    {

        System.out.println("**************************************************************");
        System.out.println("**************************************************************");
        System.out.println("Here these functions can be done\n *****CONVERSIONS*****                                    *****Mathematical Functions*****\n 1.Distances                                                     10.Multiplication Tables\n 2.power                                                         11.Square of a number\n 3.velocity                                                      12.Squareroot of a number\n 4.Temperature\n 5.Mass/Weight\n 6.Angle\n 7.Currency\n 8.Miscellenious\n 9.Area\n 13.Time ");
        System.out.println("==============================================================");
        System.out.println("choose the category by typing the category number");
        System.out.println("if you want to exit the program press 100");
        System.out.println("==============================================================");
        MEnu_choice();
    }
      void MEnu_choice()throws IOException{
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         Scanner sc= new Scanner(System.in);
         int a=0;
         a = check.check();
         String o;
        if(a==1)
        distance();
        else if(a==2)
        power();
        else if(a==3)
        velocity();
        else if(a==4)
        temperature();
        else if(a==5)
        mass();
        else if(a==6)
        angle();
        else if(a==7)
        currency();
        else if(a==8)
        miscellenious();
        else if(a==9)
        area();
        else if(a==10)
        mtable();
        else if(a==11)
        sq();
        else if(a==12)
        sqrt();
        else if(a==13){

        System.out.println("Under Construction COMING SOON");
         main_mennu();        }

        else if(a==100)
        thankyou();
        else if(a>13 || a<1){
        System.out.print("\rWRONG CHOICE;Re-enter your choice");
         System.out.println("\n==============================================================");
        MEnu_choice();}
          }
   void miscellenious()throws IOException
          {
              System.out.println("==============================================================");
              System.out.println("==============================================================");
              BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
              System.out.println("Here these functions can be done\n 1.newtons(N) to dyne\n 2.dyne to newtons(N)");
             int k=0;String o;
              k =check.check();
                         if(k==1){
                 System.out.println("Give the value to be converted");
                 System.out.println("**************************************************************");
                 double dyne,y=0;try{ y=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");miscellenious();}
                 System.out.println("**************************************************************");
                 dyne=y*100000;
                 System.out.println("**************************************************************");
                 f.dub(dyne,"dyne");


                }
                else if(k==2){
                 System.out.println("Give the value to be converted");
                 System.out.println("**************************************************************");
                 double dyne=0,n;try{ dyne=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");miscellenious();}
                 System.out.println("**************************************************************");
                 n=dyne/100000;
                 System.out.println("**************************************************************");
                 f.dub(n,"N(newton)");


                }
                   else if (k>2 || k<1){
                   System.out.println("WRONG CHOICE");
                   miscellenious();}
                   System.out.println("**************************************************************");
                   System.out.println(" **If u want to get back to main menu press 'yes'\n **If you want to get back to the miscellenious section type 'misc' \n **To get out of the converter press any word or letter");
                   o=in.readLine();
                   if(o.equals("yes"))
                   main_menu();
                   else if(o.equalsIgnoreCase("misc"))
                   miscellenious();
                   else
                   thankyou();

            }
     void distance()throws IOException
    {
          System.out.println("==============================================================");
          System.out.println("==============================================================");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Here these func can be done \n1. cm(centimeter) to  km(kilometer)-m(meter)-inch-ft(feet)\n2. m to  cm(centimeter)-km(kilometer)-inch-ft(feet)\n3. km(kilometer) to ft(feet)-inch-cm(centimeter)-m(meter)\n4. inch to  ft(feet)-m(meter)-km(kilometer)-cm(centimeter)");
        String o;int k=0;
         k=check.check();
         if(k==1)
        {
          System.out.println("Give the value to be converted");
          System.out.println("**************************************************************");
          double fo,iu,ui,c,y=0;try{ y=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");distance();}
          System.out.println("**************************************************************");
          c = y/100; ui = y/100000 ; iu=y/2.54;fo=iu/12;
          System.out.println("**************************************************************");
          System.out.println(f.dub(c,"m(meter)")+f.dub(ui,"km(kilometer)")+f.dub(iu,"inch")+f.dub(fo,"ft(feet)"));
          System.out.println("**************************************************************");}
       else if(k==2)
       {
            System.out.println("Give the value to be converted");
            System.out.println("**************************************************************");
            double ui,c,iu,fo,y=0;try{ y=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");distance();}
            System.out.println("**************************************************************");
            c = y*100;ui = y/1000; iu=(y*100)/2.54;fo=iu/12;
            System.out.println("**************************************************************");
            System.out.println(f.dub(c,"cm(centimeter)")+f.dub(ui,"km(kilometer)")+f.dub(iu,"inch")+f.dub(fo,"ft(feet)"));
            System.out.println("**************************************************************");}
       else if(k==3){
            System.out.println("Give the value to be converted");
            System.out.println("**************************************************************");
            double c,ui,iu,fo,y=0;try{ y=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");distance();}
            System.out.println("**************************************************************");
            c = y*100000; ui = c/100;iu=c/2.54;fo=iu/12;
            System.out.println("**************************************************************");
            System.out.println(f.dub(c,"cm(centimeter)")+f.dub(ui,"m(meter)")+f.dub(iu," inch")+f.dub(fo," ft(feet)"));
            System.out.println("**************************************************************");}
       else if(k==4){
            System.out.println("Give the value to be converted");
            System.out.println("**************************************************************");
            double fo,iu,ui,c,y=0;try{ y=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");distance();}
            System.out.println("**************************************************************");
            c = y*2.54; ui =c/100  ; iu=ui/1000;fo=y/12;
            System.out.println("**************************************************************");
            System.out.println(f.dub(c,"cm(centimeter)")+f.dub(ui,"m(meter)")+f.dub(iu,"km(kilometer)")+f.dub(fo," ft(feet)"));
            System.out.println("**************************************************************");}
             else if (k>4 || k<1){
                System.out.println("WRONG CHOICE");
             distance();}
             System.out.println("**************************************************************");
            System.out.println(" **If u want to get back to main menu press 'yes' \n **If you want to get back to the distance section press 'distance' \n **To get out of the converter press any word or letter");
            o=in.readLine();
          if(o.compareTo("yes")==0)
             main_menu();
            else if(o.equalsIgnoreCase("distance"))
            distance();
            else
            thankyou();

}
 void power()throws IOException
   {
        System.out.println("==============================================================");
        System.out.println("==============================================================");
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("In this section these functions can be done");
            System.out.println("**************************************************************");
            System.out.println("1. W(watt) to kW(kilowatt)-HP(Horse power)\n2. kW(Kilowatt) to  W(watt)-HP(HorsePower)\n3. HP(Horsepower) to  W(watt)-kW(kilowatt)");
            System.out.println("**************************************************************");
            String o;int k=0; k=check.check();
         if(k==1){
              System.out.println("Give the value to be converted");
              System.out.println("**************************************************************");
              double kw,hp ,y=0;try{ y=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");power();}
              System.out.println("**************************************************************");
              kw = y/1000;hp=y/745.6;
              System.out.println("**************************************************************");
              System.out.println(f.dub(kw,"kW(kilowatt)")+f.dub(hp,"HP(HorsePower)"));
              System.out.println("**************************************************************");
            }
          else if(k==2){
              System.out.println("Give the value to be converted");
              System.out.println("**************************************************************");
              double w,hp ,y=0;try{ y=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");power();}
              System.out.println("**************************************************************");
              w = y*1000;hp=w/745.6;
              System.out.println("**************************************************************");
              System.out.println(f.dub(w,"W(watt)")+f.dub(hp,"HP(HorsePower)"));
              System.out.println("**************************************************************");
            }
          else if(k==3){
              System.out.println("Give the value to be converted");
              System.out.println("**************************************************************");
              double w,kw, y=0;try{ y=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");power();}
              System.out.println("**************************************************************");
              w = y*745.6;kw=w/1000;
              System.out.println("**************************************************************");
              System.out.println(f.dub(w,"W(watt)")+f.dub(kw,"kw(kilowatt)"));
              System.out.println("**************************************************************");
            }
            else if( k>3 || k<1){
               System.out.println("WRONG CHOICE");
              power();}
              System.out.println("**************************************************************");
              System.out.println(" **If u want to get back to main menu press 'yes' \n **If u want to return to the power section type 'power' \n **To get out of the converter press any letter or word");
              o=in.readLine();
             if(o.compareTo("yes")==0)
             main_menu();
             else if(o.equalsIgnoreCase("power"))
             power();
             else
             thankyou();
        }
 void velocity()throws IOException
        {
            System.out.println("==============================================================");
            System.out.println("==============================================================");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
              System.out.println("In this section these functions can be done");
              System.out.println("**************************************************************");
              System.out.println("1.m/s(meter per second) to km/h(kilometer per hour)-miles/h(miles per hour)\n2.Km/h(kilometer per hour) to m/s(meter per second)-miles/h(miles per hour)\n3.miles/h(miles per hour) to  m/s(meter per second)-km/hr(kilometer per second)");
              System.out.println("**************************************************************");
              String o;int k=0;  k=check.check();
         if(k==1){
              System.out.println("Give the value to be converted");
              System.out.println("**************************************************************");
              double kms,mps,y=0;try{ y=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");velocity();}
              System.out.println("**************************************************************");
              kms=(y*18)/5;mps=kms/1.601;
              System.out.println("**************************************************************");
              System.out.println(f.dub(kms,"km/h(kilometer per hour)")+f.dub(mps,"miles/h(miles per hour)"));
              System.out.println("**************************************************************");
            }
         else if(k==2)
         {
              System.out.println("Give the value to be converted");
              System.out.println("**************************************************************");
              double ms,mps,y=0;try { y=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");velocity();}
              System.out.println("**************************************************************");
              ms=(y*5)/18;mps=y/1.601;
              System.out.println("**************************************************************");
              System.out.println(f.dub(ms,"m/s(meter per second)")+f.dub(mps,"miles/h(miles per hour)"));
              System.out.println("**************************************************************");
            }
         else if(k==3)
         {
              System.out.println("Give the value to be converted");
              System.out.println("**************************************************************");
              double ms,kms,y=0;try { y=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");velocity();}
              System.out.println("**************************************************************");
              kms=y*1.6;ms=(kms*5)/18;
              System.out.println("**************************************************************");
              System.out.println(f.dub(kms,"km/h(kilometer per hour)")+f.dub(ms,"m/s(meter per second)"));
              System.out.println("**************************************************************");
            }
            else if (k>3 || k<1){
              System.out.println("WRONG CHOICE");
                velocity();}
                  System.out.println("**************************************************************");
              System.out.println(" **If u want to get back to main menu press 'yes'\n **If you want to get back to the velocity section type 'velocity' \n **To get out of the converter press any letter or word");
              o=in.readLine();
             if(o.compareTo("yes")==0)
             main_menu();
             else if(o.equalsIgnoreCase("velocity"))
             velocity();
             else
             thankyou();
                        }
  void temperature() throws IOException
         {
             System.out.println("==============================================================");
             System.out.println("==============================================================");
             BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("In this section these functions can be done");
            System.out.println("**************************************************************");
            System.out.println("1. degree celcius(C) to  degree farenhiet(F)-kelvin(K)\n2. degree farenhiet(F) to  degree celcius(C)-kelvin(K)\n3. kelvin(K)  to  degree farenhiet(F)-degree celcius(C)");
            System.out.println("**************************************************************");
            int k=0;   k=check.check();
            String o;
            if(k==1)
            {
                 System.out.println("Give the value to be converted");
                 System.out.println("**************************************************************");
                 double ke,f1,y=0;try { y=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");temperature();}
                 System.out.println("**************************************************************");
                 f1=(9*y+160)/5;ke=y+273.15;
                 System.out.println(f.dub(f1," F(degree farenhiet)")+f.dub(ke," K(kelvin)"));
                 System.out.println("**************************************************************");
        }
          else if(k==2){
                 System.out.println("Give the value to be converted");
                 System.out.println("**************************************************************");
                 double ke,c,y=0;try { y=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");temperature();}
                 System.out.println("**************************************************************");
                 c=(5*y-160)/9;ke=c+273.15;
                 System.out.println(f.dub(c," C(degree celcius)")+f.dub(ke,"K(kelvin)"));
                 System.out.println("**************************************************************");
                }
          else if(k==3){
                 System.out.println("Give the value to be converted");
                 System.out.println("**************************************************************");
                 double f1,c,y=0;try { y=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");temperature();}
                 System.out.println("**************************************************************");
                 c=y-273.15;f1=(9*c+160)/5;
                 System.out.println(f.dub(c," C(celcius)")+f.dub(f1,"F(degree farenhiet)"));
                 System.out.println("**************************************************************");
                }
                else if (k>3 || k<1){
                  System.out.println("WRONG CHOICE");
                temperature();}
                    System.out.println("**************************************************************");
                System.out.println(" **If u want to get back to main menu press 'yes'\n **If you want to get back to the Temperature section type 'temp' \n **To get out of the converter press any letter or word");
                 o=in.readLine();
                 if(o.compareTo("yes")==0)
                 main_menu();
                 else if(o.equalsIgnoreCase("temp"))
                 temperature();
                 else
                 thankyou();
                }
  void thankyou()throws IOException
             {
                 commentshandler ch=new commentshandler();
                 ch.central();
                 System.out.println("==============================================================");
                 System.out.println("Thankyou for using the Ultimate Converter\nCoded by:Neo \nCopyrights Reserved@");
                 System.exit(0);

                }
  void mass()throws IOException
                {
              System.out.println("==============================================================");
              System.out.println("==============================================================");
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("In this section these functions can be done");
                System.out.println("**************************************************************");
                System.out.println(" 1.g(gram)  to  pounds-kg(Kilogram)-carat-tonne-quintals\n 2.kg(Kilogram)  to  pounds-gram(g)-carat-tonne-quintals\n 3.carats  to  pounds-kg(Kilogram)-g(grams)-tonne-quintal\n 4.tonnes  to  pounds-kg(Kilogram)-g(grams)-carats-quintals\n 5.pounds to kg(Kilogram)-g(gram)-carats-tonnes-quintals");
                System.out.println("**************************************************************");
                int k=0;   k=check.check();;
                System.out.println("**************************************************************");
                String o;
                   if(k==1){
                     System.out.println("Give the value to be converted");
                     System.out.println("**************************************************************");
                     double pou,gm=0,kg,ca,tn,qn;try { gm=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");mass();}
                     System.out.println("**************************************************************");
                     kg=gm/1000;ca=gm*5;tn=gm/1000000;qn=gm/100000;pou=kg*2.204;
                     System.out.println(f.dub(kg,"kg(kilogram)")+f.dub(ca,"carat")+f.dub(tn,"tonnes")+f.dub(qn,"quintals")+f.dub(pou,"pounds"));
                     System.out.println("**************************************************************");
                }
                else if(k==2){
                    System.out.println("Give the value to be converted");
                    System.out.println("**************************************************************");
                    double kg=0,gm,ca,tn,qn,pou;try { kg=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");mass();}
                    System.out.println("**************************************************************");
                    gm=kg*1000;ca=gm*5;tn=gm/1000000;qn=gm/100000;pou=kg*2.204;
                    System.out.println(f.dub(gm,"g(gram)")+f.dub(ca,"carats")+f.dub(tn,"tonnes")+f.dub(qn,"quintals")+f.dub(pou,"pounds"));
                    System.out.println("**************************************************************");

            }
            else if(k==3){
                   System.out.println("Give the value to be converted");
                   System.out.println("**************************************************************");
                   double pou,ca=0,kg,gm,qn,tn;try { ca=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");mass();}
                   System.out.println("**************************************************************");
                   gm=ca/5;kg=gm/1000;tn=gm/1000000;qn=gm/100000;pou=kg*2.204;
                   System.out.println(f.dub(gm,"g(gram)")+f.dub(kg,"kg(kilogram)")+f.dub(tn,"tonnes")+f.dub(qn,"quintals")+f.dub(pou,"pounds"));
                   System.out.println("**************************************************************");
            }
            else if(k==4){
                   System.out.println("Give the value to be converted");
                   System.out.println("**************************************************************");
                   double pou,tn=0,kg,ca,qn,gm;try { tn=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");mass();}
                   System.out.println("**************************************************************");
                   kg=tn*1000;gm=kg*1000;ca=gm*5;qn=gm/100000;pou=kg*2.204;
                   System.out.println(f.dub(kg,"kg(kilogram)")+f.dub(ca,"carats")+f.dub(gm,"g(gram))")+f.dub(qn,"quintals")+f.dub(pou,"pounds"));
                   System.out.println("**************************************************************");
            }
            else if(k==5){
                   System.out.println("Give the value to be converted");
                   System.out.println("**************************************************************");
                   double pou=0,tn,kg,ca,qn,gm;try { pou=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");mass();}
                   System.out.println("**************************************************************");
                   kg=pou/2.204;gm=kg*1000;ca=gm*5;qn=gm/100000;tn=kg/1000;
                   System.out.println(f.dub(kg,"kg(kilogram)")+f.dub(ca,"carats")+f.dub(qn,"quintals")+f.dub(tn,"tonnes")+f.dub(gm,"g(gram)"));
                   System.out.println("**************************************************************");

            }
            else if (k>5 || k<1){
                System.out.println("WRONG CHOICE");
             mass();}
                 System.out.println("**************************************************************");
            System.out.println(" **If u want to get back to main menu press 'yes'\n **If you want to get back to the Mass section type 'mass' \n **To get out of the converter press any letter or word");
            o=in.readLine();
          if(o.compareTo("yes")==0)
             main_menu();
             else if(o.equalsIgnoreCase("mass"))
             mass();
            else
            thankyou();

        }
  void angle()throws IOException
            {
              System.out.println("==============================================================");
              System.out.println("==============================================================");
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("In this section these functions can be done");
                System.out.println("**************************************************************");
                System.out.println("1. degrees to  radian\n2. radian to degrees");
                System.out.println("**************************************************************");
              int k=0;  k=check.check();
                System.out.println("**************************************************************");
                String o;
             if(k==1){

                   System.out.println("Give the value to be converted");
                   System.out.println("**************************************************************");
                   double an=0,rn;try { an=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");angle();}
                   System.out.println("**************************************************************");
                   rn=an*0.0174532925199433;
                   System.out.println(f.dub(rn,"radian"));
                   System.out.println("**************************************************************");
                }
            else if(k==2){
                   System.out.println("Give the value to be converted");
                   System.out.println("**************************************************************");
                   double an=0,rn;try { an=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");angle();}
                   System.out.println("**************************************************************");
                   rn=an*57.295;
                   System.out.println(f.dub(rn,"degree"));
                   System.out.println("**************************************************************");
                }
             else if (k>3 || k<1){
                System.out.println("WRONG CHOICE");
                angle();}
                    System.out.println("**************************************************************");
           System.out.println(" **If u want to get back to main menu press 'yes'\n **If you want to get back to the Angle section type 'angle' \n **To get out of the converter press any letter or word");
            o=in.readLine();
            if(o.compareTo("yes")==0)
             main_menu();
             else if(o.equalsIgnoreCase("angle"))
             angle();
            else
            thankyou();
        }
   void currency()throws IOException
        {
             System.out.println("==============================================================");
             System.out.println("==============================================================");
            System.out.println("**** NOTE:Currency values taken on 11th May 2012 *****");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                 System.out.println("In this section these functions can be done");
                 System.out.println("**************************************************************");
                 System.out.println(" 1. UK Pounds to INR(Rupees)-US dollars\n 2. US dollars to  UK pounds-INR(Rupees)\n 3. INR(Rupees) to  UK pounds-US dollars");
                 System.out.println("NOTE:Please give the paise or cents or pence after giving a '.' eg:Rs100.25");
                 System.out.println("**************************************************************");
                 int k=0;   k=check.check();
                 System.out.println("**************************************************************");
                 String o;
                 if(k==1)
                 {
                     System.out.println("Give the value to be converted");
                     System.out.println("**************************************************************");
                     double inr,pou=0,dlr;try { pou=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");currency();}
                     System.out.println("**************************************************************");
                     inr=pou*81.88;dlr=inr/52.375;
                     System.out.println(f.dub(inr,"INR(Rupees)")+f.dub(dlr,"$(US dollar)"));
                     System.out.println("**************************************************************");
                    }
             else if(k==2){
                     System.out.println("Give the value to be converted");
                     System.out.println("**************************************************************");
                     double inr,pou,dlr=0;try { dlr=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");currency();}
                     System.out.println("**************************************************************");
                     inr=dlr*52.375;pou=inr/81.88;
                     System.out.println(f.dub(inr,"INR(Ruupee)")+f.dub(pou,"pounds"));
                     System.out.println("**************************************************************");
                    }
             else if(k==3){
                 System.out.println("Give the value to be converted");
                     System.out.println("**************************************************************");
                     double inr=0,pou,dlr;try { inr=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");currency();}
                     System.out.println("**************************************************************");
                     dlr=inr/52.375;pou=inr/81.88;
                     System.out.println(f.dub(dlr,"$(US dollar)")+f.dub(pou,"Pounds"));
                     System.out.println("**************************************************************");
                    }

             else if (k>3 || k<1){
                System.out.println("WRONG CHOICE");
              currency();}
                  System.out.println("**************************************************************");
            System.out.println(" **If u want to get back to main menu press 'yes'\n **If you want to get back to the Currency section type 'currency' \n **To get out of the converter press any letter or word");
            o=in.readLine();
        if(o.compareTo("yes")==0)
             main_menu();
             else if(o.equalsIgnoreCase("currency"))
            currency();
            else
            thankyou();
        }
      void area()throws IOException
     {
         System.out.println("==============================================================");
         System.out.println("==============================================================");
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Here this functions can be done");
         System.out.println("**************************************************************");
         System.out.println(" 1.acre to hectare-square meters-square feet-square kilometer \n 2.hectare to acre-square meter-square feet-square kilometer \n 3.square meter to acre-hectare-squarefeet-square kilometer \n 4.sqaure feet to acre-hectare-square meter\n 5.square kilometer to acre-hectare-square meters-square feet ");
         System.out.println("**************************************************************");
         System.out.println("Choose the function");
        int k=0;  k=check.check();
         String o;
         System.out.println("**************************************************************");
        if(k==1)
        {
          System.out.println("give the value");
          System.out.println("**************************************************************");
          double ar=0,har,sqf,skm,sm; try { ar=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");area();}
          System.out.println("**************************************************************");
          har=ar/2.471;sqf=ar*43560;sm=ar*4046.85;skm=sm/1000000;
          System.out.println(f.dub(har,"hectares")+f.dub(sqf,"square feet")+f.dub(sm,"square meter")+f.dub(skm,"square kilometer"));
          System.out.println("**************************************************************");
        }
        else if(k==2){
            System.out.println("give the value");
          System.out.println("**************************************************************");
          double ar,har=0,sqf,skm,sm; try { har=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");area();}
          System.out.println("**************************************************************");
          ar=har*2.471;sqf=ar*43560;sm=ar*4046.85;skm=sm/1000000;
          System.out.println(f.dub(ar,"acres")+f.dub(sqf,"square feet")+f.dub(sm,"square meter")+f.dub(skm,"square kilometer"));
          System.out.println("**************************************************************");
        }
          else if(k==4)
          {
          System.out.println("give the value");
          System.out.println("**************************************************************");
          double ar,har,sqf=0,skm,sm; try { sqf=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");area();}
          System.out.println("**************************************************************");
          ar=sqf/43560;sm=ar*4046.85;skm=sm/1000000;har=ar/2.471;
          System.out.println(f.dub(ar,"acres")+f.dub(sm,"square meter")+f.dub(har,"hectares")+f.dub(skm,"square kilometer"));
          System.out.println("**************************************************************");
        }
            else if(k==3)
            {
          System.out.println("give the value");
          System.out.println("**************************************************************");
          double ar,har,sqf,skm,sm=0; try { sm=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");area();}
          System.out.println("**************************************************************");
          ar=sm/4046.85;sqf=ar*43560;skm=sm/1000000;har=ar/2.471;
          System.out.println(f.dub(ar,"acres")+f.dub(sqf,"square feet")+f.dub(har,"hectares")+f.dub(skm,"square kilometer"));
          System.out.println("**************************************************************");
        }
        else if(k==5)
        {
          System.out.println("give the value");
          System.out.println("**************************************************************");
          double ar,har,sqf,skm=0,sm; try { skm=Double.parseDouble(in.readLine());} catch(NumberFormatException dsfg){System.out.println("Please Give correct value");area();}
          System.out.println("**************************************************************");
          ar=skm*247.1;sqf=ar*43560;sm=skm*1000000;har=ar/2.471;
          System.out.println(f.dub(ar,"acres")+f.dub(sqf,"square feet")+f.dub(har,"hectares")+f.dub(sm,"square meter"));
          System.out.println("**************************************************************");
        }

         else if (k>5 || k<1){
                System.out.println("WRONG CHOICE");
              area();}
                  System.out.println("**************************************************************");
             System.out.println(" **If u want to get back to main menu press 'yes'\n **If you want to get back to the Area section, type 'area' \n ** To get out of the converter press any letter or word");
            o=in.readLine();
            if(o.compareTo("yes")==0)
             main_menu();
             else if(o.equalsIgnoreCase("area"))
             area();
            else
            thankyou();

        }
         void mtable()throws IOException {
            System.out.println("==============================================================");
            System.out.println("==============================================================");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("**************************************************************");
            System.out.println("Give the number for which you want the multiplication table to be generated");
            int k, y=0; y=check.check();
                System.out.println("**************************************************************");
            System.out.println("Give the multiple till which the multiplication table has to be gernerated");
            int x=0; x=check.check();
            System.out.println("Here you have");
            String o;
             for(int i=1;i<=x;i++)
             {

              k=y*i;
              System.out.print(y+"X"+i+"=");
              f.dub1(k);
              System.out.println();


          }
              System.out.println("**************************************************************");
          System.out.println(" **If u want to get back to main menu press 'yes'\n **If you want to get back to the Mathematical table section, type 'MTB' \n **To get out of the converter press any letter or word");
            o=in.readLine();
            if(o.compareTo("yes")==0)
             main_menu();
             else if(o.equalsIgnoreCase("MTB"))
             mtable();
            else
            thankyou();

  }
     void sq()throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String o;

           System.out.println("**************************************************************"); System.out.println("Give the number");
        int y=Integer.parseInt(in.readLine());
        System.out.print("Square of "+y+" is =");
        f.dub(y*y,"");
       /** if(j==2)
        {
                System.out.println("**************************************************************");
            System.out.println("Give the number");
            int y=Integer.parseInt(in.readLine());
            System.out.println("Square root of "+y+" is ="+Math.sqrt(y));}
            else if(j>2 ||j<1){
            System.out.println("WRONG CHOISE");
            sqsqrt();
        }*/
            System.out.println("**************************************************************");
         System.out.println(" **If u want to get back to main menu press 'yes'\n **If you want to get back to the Square/Squareroot section, type 'sqr' \n **To get out of the converter press any letter or word");
            o=in.readLine();
            if(o.compareTo("yes")==0)
             main_menu();
             else if(o.equalsIgnoreCase("sq"))
             sq();
            else
            thankyou();

}
 void sqrt()throws IOException{
      BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
      String o;
      System.out.println("********************************************************************");
      System.out.println("Give the number");
      System.out.println("********************************************************************");
      int y=Integer.parseInt(in.readLine());
      System.out.println("********************************************************************");
      System.out.print("Square root of "+y+" is =");
      f.dub(Math.sqrt(y),"");
      System.out.println("********************************************************************");
      System.out.println("**************************************************************");
         System.out.println(" **If u want to get back to main menu press 'yes'\n **If you want to get back to the Square/Squareroot section, type 'sqrt' \n **To get out of the converter press any letter or word");
            o=in.readLine();
            if(o.compareTo("yes")==0)
             main_menu();
             else if(o.equalsIgnoreCase("sqrt"))
             sqrt();
            else
            thankyou();

}
/** void time()throws IOException
{
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     String o;
     System.out.println("==============================================================");
     System.out.println("==============================================================");
     System.out.println("In this section these conversions can be done");
     System.out.println("**************************************************************");
     ddddddddddddddddddddddddddddddddddddddddddddddddddddddddd




        }
    }*/
  void main_mennu()throws IOException
 {
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("******************************************************");
    System.out.println("Press 'yes' if you want to get back to main menu\nPress anything to get out of the converter");
    String a=in.readLine();
    if(a.equalsIgnoreCase("yes"))
    main_menu();
    else
    thankyou();

    }

      }
