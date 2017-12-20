package jvmInternals.classInternals;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import annotation.Author;

public class ClassVersionChecker {
    public static void main(String[] args) throws IOException {
      //  for (int i = 0; i < args.length; i++)
            checkClassVersion("C:\\workSpace\\java\\SCJPQuesExample\\bin\\classInternals\\ClassVersionChecker.class");
    }
@Author("Harbhajan")
    private static void checkClassVersion(String filename)
        throws IOException
    {
	
	
        DataInputStream in = new DataInputStream
         (new FileInputStream(filename));

        int magic = in.readInt();
        if(magic != 0xcafebabe) {
          System.out.println(filename + " is not a valid class!");;
        }
        int minor = in.readUnsignedShort();
        int major = in.readUnsignedShort();
        System.out.println(filename + ": " + major + " . " + minor);
        in.close();
    }
}

/////

/*major  minor Java platform version 
45       3           1.0
45       3           1.1
46       0           1.2
47       0           1.3
48       0           1.4
49       0           1.5
50       0           1.6
51       0           1.7
52       0           1.8



A Java class file holds the Java bytecode for a Java 
class that can be executed on a Java virtual machine (VM)
. Encoded at the beginning of a class file is a major 
and minor version number of the class file format that is used in it.
 This major.minor number indicates which Java VM can
  execute this class file. The class file format is
 typically changed with a new release of Java.
 
 
 
 The error regarding the unsupported major.minor version 
 is because during compile time you are using
  a higher JDK and a lower JDK during runtime.
  
  
  The reported number is the required number, 
  not the number you are using. To solve this, 
  it's always better 
  to have the jdk and jre pointed to the same version.
*/