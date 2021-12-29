import java.util.Scanner;
class  PascalsTriangle{
private static Scanner sc;

public static void main(String[] args)
sc=new Scanner(System.in);
System.out.println("enter right pascals triangle rows=");
int rows=sc.nextint();
System.out.println("printing right pascals triangle star pattern");
int j,i=0;
while(i<rows){
	j=0;
	while(j<=i){
		System.out.println("*");
		j++;
	}
	System.out.println();
	i++;
}
i=rows-1;
while(i>=0){
	j=0;
	while(j<=1-i){
		System.out.println("*");
		j++;
		
	}
	System.out.println();
	i--;
}
	
		
	}
}
}
