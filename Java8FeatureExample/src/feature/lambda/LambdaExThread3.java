package feature.lambda;

public class LambdaExThread3 {
public static void main(String[] args) {
	// pass lamda in function
	
	//Old way:
	new Thread(new Runnable() {
		@Override
		public void run() {
			System.out.println("Hello from thread");
		}
	}).start();
	
	new Thread(()->System.out.println("in thread")).start();;
}
}
