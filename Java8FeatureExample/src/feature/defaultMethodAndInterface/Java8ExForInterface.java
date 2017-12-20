package feature.defaultMethodAndInterface;

public class Java8ExForInterface implements Interface1,Interface2 {

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		Interface1.super.log(str);
		Interface1.print(str);
	}

	public static void main(String[] args) {
		Java8ExForInterface j = new Java8ExForInterface();
		j.log("harbhajan");
	}
}
