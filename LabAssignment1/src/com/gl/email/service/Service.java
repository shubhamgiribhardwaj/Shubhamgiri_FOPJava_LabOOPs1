package com.gl.email.service;

import java.util.Random;
import com.gl.email.model.Employee;
public class Service{


public char[] generatePassword() {
	
	String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String lowerCase = "abcdefghijklmaoparstuvwxyz";
	String number = "0123456789";
	String special = "^1⑥#＄%^&*";
	String bigString = caps+lowerCase+number+special;
	Random random = new Random() ;
	char[] password = new char[8];
	
	password[0] = lowerCase.charAt(random.nextInt(lowerCase.length())); 
	password[1] = caps.charAt(random.nextInt(caps.length())); 
	password[2] = special.charAt(random.nextInt(special.length())); 
	password[3] = number.charAt(random.nextInt(number.length())); 

		for (int i=0; i<8; i++) {
			int rand= (int) (Math.random()*bigString.length());
			password[i]= bigString.charAt (rand);
		 
		}
		return password;
}

public String generateEmailAddress( String firstName, String lastName, String department) {
return  firstName+lastName+"@"+department+"gl.com";
}

public void showCredentials(Employee emp, String email, char[] password) {
System.out.println("Dear"+emp.getFirstname()+" , your generated credentials are as follows:- ");
System.out.println("Email: "+ email);
System.out.println("Password: "+ String.valueOf(password));

}


}


