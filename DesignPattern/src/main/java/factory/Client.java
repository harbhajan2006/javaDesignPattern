package factory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer c = ComputerFactory.getInstance("W");
		c.getCPU();
	}

}
