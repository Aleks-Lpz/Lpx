import java.util.Scanner;
public class ejer4 {
        public static void main (String[] argv){
        Scanner scanner = new Scanner(System.in);
int a,b,c=1;
while (scanner.hasNextInt()){
a=scanner.nextInt();
b=scanner.nextInt();
System.out.println ("Case "+ c +" "+ (a+b));
c=c+1;
}
}
}
