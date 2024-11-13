import java.util.Scanner;
public class ejer2 {
	public static void main (String[] argv) {
	 Scanner scanner = new Scanner(System.in);

int a, b;
while( (((a= scanner.nextInt())>=0) && ((b= scanner.nextInt())>=0)) && a+b!=0 ) 
{
System.out.println(a+b);
}
}
}
