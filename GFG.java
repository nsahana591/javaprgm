class GFG {
private static void displayUpperPart(int size)
{
int m, n;
for (m = size - 1; m>=0;m--) {
for (m= size - 1; m>=0; n++){
system.out.println(" ");
}
for ( n = m; n<= size - 1; n++){
system.out.println("*" + " ");
}
system.out.println();
}
}
public static void main (String[] args){
int size = 5;
displayUpperPart(size);
}
}
