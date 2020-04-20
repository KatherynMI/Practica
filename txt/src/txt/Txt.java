/**
package txt;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.PrintStream;
public class Txt {
 static Scanner Sc = new Scanner (System.in);
 static String n;
        static int c1,c2,c3;
        static double Promedio, suma;
    public static void main(String[] args)throws FileNotFoundException {
        // TODO code application logic here
        PrintStream DDescritor = new PrintStream("C:/Users/Admin/documents/Resultados.txt");
                System.out.print("Nombre ");
                n = Sc.nextLine();
                System.out.print("Calificacion 1er Parcial ");
                c1 = Sc.nextInt();
               System.out.print("Calificacion 2do Parcial ");
                c2 = Sc.nextInt();
               System.out.print("Calificacion 3er Parcial ");
                c3 = Sc.nextInt();
                suma=c1+c2+c3;
                Promedio= suma / 3;
                
                DDescritor.println("Nombre\t1er\t2do\t3er ");
                DDescritor.print(n);
                DDescritor.print("\t");
               DDescritor.print(c1);
                DDescritor.print("\t");
                 DDescritor.print(c2);
                DDescritor.print("\t");
                 DDescritor.print(c3);
                DDescritor.print("\t");
                
                DDescritor.println("Tu promedio es: "+Promedio);
     }}
*/


       
        
    
        
              