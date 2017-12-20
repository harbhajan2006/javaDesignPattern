package serialization;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputValidation;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class POJO  extends POJOBase implements Serializable, ObjectInputValidation
	
 {

	private String msg;
	 
    public POJO(String msg) {
        this.msg = msg;
    }
 
    public String getMsg() {
        return msg;
    }
	@Override
	public void validateObject() throws InvalidObjectException {
		// TODO Auto-generated method stub
		System.out.println("validadte Object");
	}

	
	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        System.out.println("writeObject");
        out.defaultWriteObject();
    }
	
	
	private Object writeReplace() throws ObjectStreamException {
        System.out.println("writeReplace");
        return this;
    }
 
    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        System.out.println("readObject");
        in.registerValidation(this, 0);
        in.defaultReadObject();
    }
    
    private Object readResolve() throws ObjectStreamException {
        System.out.println("readResolve");
        return this;
    }
}
