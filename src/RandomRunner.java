//Comment out when you write your own class
import java.util.Random;

public class RandomRunner {
	public static void main(String args[]){
		Random r = new Random();

        System.out.println("Integer = " + r.nextInt(5) );

		System.out.println(r.nextInt(-5) );

        System.out.println("Double = " + r.nextDouble() );

        System.out.println("Boolean = " + r.nextBoolean() );
	}
}
