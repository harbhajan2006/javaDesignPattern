package feature.methodReference;

@FunctionalInterface 
interface MyInterface{  
    void display();  
}  


@FunctionalInterface 
interface MyInterface1{  
    void display();  
}

public class ClassObjectType {  
    public void myMethod(){  
	System.out.println("Instance Method");  
    } 
    
    
    public void myMethod2(String str){  
    	System.out.println("Instance Method" + str);  
        } 
    
    public static void main(String[] args) {  
    	ClassObjectType obj = new ClassObjectType();   
	// Method reference using the object of the class
	MyInterface ref = obj::myMethod;
	MyInterface1 ref1 = obj::myMethod;
	// Calling the method of functional interface  
	ref.display();  
    }  
}