package txtFile;

public class MyException extends Exception{
	String str1;
	MyException(String v)
	{
		str1=v;
	}
	public String toString()
	{
		return ("Policy Number "+str1+" is expired");
	}

}
