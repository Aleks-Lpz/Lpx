import java.util.Scanner;
public class ejer6 {
        public static void main (String[] argv){
        Scanner scanner = new Scanner(System.in);
int k, ans, v;
while (scanner.hasNextInt()){
ans=0;
k=scanner.nextInt();
	while (k>0){
	v=scanner.nextInt();
	ans += v;
	k--;	
	}
System.out.println(ans);
}
}
}
