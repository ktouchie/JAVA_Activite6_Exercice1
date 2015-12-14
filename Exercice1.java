import java.util.*;
class Exercice1 {

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a value for X:");
        String x = sc.nextLine();
        
        System.out.println("Enter a value for Y:");
        String y = sc.nextLine();
        
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        
        swap(x,y);
        
	}

    public static void swap(String A, String B) {
        String x = A;
        A = B;
        B = x;
        
        System.out.println("SWAP!");
        System.out.println("X: " + A);
        System.out.println("Y: " + B);
    }
}