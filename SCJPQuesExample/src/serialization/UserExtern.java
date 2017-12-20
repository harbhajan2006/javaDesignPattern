package serialization;

import java.util.*;
import java.io.*;
 
/**
 * Externalization example
 * @author www.codejava.net
 */
public class UserExtern implements Externalizable {
    public static final long serialVersionUID = 1234L;
 
    // attributes
    private int code;
    private String name;
    private String password;
    private Date birthday;
    private int socialSecurityNumber;
 
    public UserExtern() {
    }
 
    // methods (getters and setters)
    public int getCode() {
        return this.code;
    }
 
    public void setCode(int code) {
        this.code = code;
    }
 
    public String getName() {
        return this.name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getPassword() {
        return this.password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
 
    public Date getBirthday() {
        return this.birthday;
    }
 
    public void setSocialSecurityNumber(int ssn) {
        this.socialSecurityNumber = ssn;
    }
 
    public int getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		//out.writeInt(code);
	   // out.writeObject(name);
	 
	    // write empty password:
	    //out.writeObject("");
	    out.writeObject(this);
	 
	}

	
	public String toString() {
	    String details = "Code: " + code;
	    details += "\nName: " + name;
	    details += "\nBirthday: " + birthday;
	    details += "\nPassword: " + password;
	    details += "\nSSN: " + socialSecurityNumber;
	 
	    return details;
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		// this.code = in.readInt();
		//  this.name = (String) in.readObject();
		    //this.password = (String) in.readObject();
		    //this.birthday = (Date) in.readObject();
		    UserExtern u = (UserExtern)in.readObject();
		    System.out.println(u);
	}
}