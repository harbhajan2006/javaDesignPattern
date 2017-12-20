package jvmInternals;

public class ClassLoaderVisibility {

	public static void main(String args[]) {
        try {          
            //printing ClassLoader of this class
            System.out.println("ClassLoaderTest.getClass().getClassLoader() : "
                                 + ClassLoaderVisibility.class.getClassLoader());

          
            //trying to explicitly load this class again using Extension class loader
            Class.forName("test.ClassLoaderTest", true 
                            ,  ClassLoaderVisibility.class.getClassLoader().getParent());
        } catch (ClassNotFoundException ex) {
            System.out.println( "exception.............." +  ClassLoaderVisibility.class.getName());
        }

//Read more: http://javarevisited.blogspot.com/2012/12/how-classloader-works-in-java.html#ixzz502fD5vLK
}
}