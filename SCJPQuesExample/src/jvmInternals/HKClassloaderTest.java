package jvmInternals;




import java.lang.reflect.Method;

public class HKClassloaderTest {
 
    public static void main(String args[]) throws Exception {
    	args= new String[1];
    	args[0]="jvmInternals.OneClassObjectPerClass";
        String progClass = args[0];
        String progArgs[] = new String[args.length - 1];
        System.arraycopy(args, 1, progArgs, 0, progArgs.length);

        HKClassloader ccl = new HKClassloader(HKClassloaderTest.class.getClassLoader());
        Class clas = ccl.loadClass(progClass);
        Class mainArgType[] = { (new String[0]).getClass() };
        Method main = clas.getMethod("main", mainArgType);
        Object argsArray[] = { progArgs };
        main.invoke(null, argsArray);

        /*// Below method is used to check that the Foo is getting loaded
        // by our custom class loader i.e CCLoader
        Method printCL = clas.getMethod("printCL", null);
        printCL.invoke(null, new Object[0]);*/
    }
 
}