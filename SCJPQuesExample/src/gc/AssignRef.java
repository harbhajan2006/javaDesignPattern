package gc;




public class AssignRef
{
	// to store object name
	String obj_name;
	
	public AssignRef(String obj_name) 
	{
		this.obj_name = obj_name;
	}
	
	// Driver method
	public static void main(String args[])
	{
		AssignRef t1 = new AssignRef("t1");
		AssignRef t2 = new AssignRef("t2");
		
		//t1 now referred to t2
		t1 = t2;
		
		// calling garbage collector
		System.gc();
	}
	
	@Override
	/* Overriding finalize method to check which object
	is garbage collected */
	protected void finalize() throws Throwable 
	{
		// will print name of object
		System.out.println(this.obj_name + " successfully garbage collected");
	}
}
