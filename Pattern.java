package Pattern;

public class Pattern {

	public static void main(String[] args) {
		int n=5, j;
		for(int i =1; i<=n; i++) {
			for( j =1; j<=n; j++) {
				System.out.print(i+ "     ");
				j=i+(n-1);
			}
			
			System.out.println();
		}
	}

}
  
/* int k=2;
for(int i =1; i<=5; i++) {
for(int j =1; j<=5; j++) {
	System.out.print(k+"  	");
	k=k+2;
}
System.out.println();
} */