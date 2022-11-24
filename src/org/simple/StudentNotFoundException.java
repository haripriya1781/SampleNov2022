package org.simple;

public class StudentNotFoundException extends Exception{
@Override
public String getMessage() {
	String msg = "Student ID stats with 1001";

	return msg;
}
}
