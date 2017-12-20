package jvmInternals;

import java.sql.Connection;
import com.sun.nio.zipfs.*;

public class ClassloaderTest {

	public static void main(String[] args) {

		System.out.println("class loader for HashMap: "
				+ java.util.HashMap.class.getClassLoader());
		/*System.out.println("class loader for DNSNameService: "
				+ com.sun.nio.zipfs.ZipFileStore.class.getClassLoader());*/
		System.out.println("class loader for this class: "
				+ ClassloaderTest.class.getClassLoader());

		System.out.println(java.sql.Connection.class.getClassLoader());
//Connection c;
	}

}
