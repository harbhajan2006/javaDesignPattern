package serialization;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class POJOTest {
	 
    public static void main(String[] args) throws Exception {
        POJO POJO = new POJO("Hello world");
        byte[] bytes = serialize(POJO); // Serialization        
        POJO p = (POJO) deserialize(bytes); 
        // De-serialization
        
       // if(p==POJO)
        System.out.println(p.getMsg());
        
        System.out.println(p.getAge());
        System.out.println(p.getName());
    }
 
    private static byte[] serialize(Object o) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(o);
        oos.flush();
        oos.close();
        return baos.toByteArray();
    }
 
    private static Object deserialize(byte[] bytes) throws ClassNotFoundException, IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object o = ois.readObject();
        ois.close();
        return o;
    }
 
}