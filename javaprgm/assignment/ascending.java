 import java.util.Scanner; 

class Main {
  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in); 
    System.out.print("Enter three numbers.");

    int x = reader.nextInt();
    int y = reader.nextInt();
    int z = reader.nextInt();

    if (x <= y){
            if (y <= z)
                System.out.print("In order " + z + " "+ y + " " + x);

            if  (z <= x)
                System.out.print("In order " + y + " "+ x + " " + z);

            if (x < z)
                System.out.print("In order " + y + " " + z + " " + x);
    }

    if (y < x)
    {
            if (z <= y)
                System.out.print("In order " + x + " " + y + " "+ z);
        if (z <= x)
            System.out.print("In order " + y + " " + x + " " + z);
        if (x < z)
            System.out.print("In order " + y + " " + z + " " + x);
    }


  }
}