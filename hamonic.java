import java.util.Scanner;

public class hamonic {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        double result=0,i;
        System.out.print("N sayisi gir: ");
        n= inp.nextInt();

        for(i=1;i<=n;i++){

            result+= 1/i;

        }
        System.out.print(result);
    }
}
