package factory;

public class ComputerFactory {

	
	public static Computer getInstance(String type){
		
		if(type.equals("W")){
			return new WindowComputer();
		} else if (type.equals("M"))
			return new MacComputer();
		return null;
	} 
}
