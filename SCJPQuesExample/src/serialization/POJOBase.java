package serialization;

public class POJOBase //extends POJOSuperBase 
{

	public String name="hello hk";
	public int age =30;
	public transient int doy =1985;
	static private String dop ="jhansi";
	public POJOBase(String name, int age, int doy) {
		super();
		this.name = name;
		this.age = age;
		this.doy = doy;
	}
	
	
	private String msg="base";
	 
    
 
    public String getMsg() {
        return msg;
    }
	public POJOBase(){
		System.out.println("Pjo constructor....");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDoy() {
		return doy;
	}
	public void setDoy(int doy) {
		this.doy = doy;
	}
	public static String getDop() {
		return dop;
	}
	public static void setDop(String dop) {
		POJOBase.dop = dop;
	}
}
