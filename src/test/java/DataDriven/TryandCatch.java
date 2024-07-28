package DataDriven;

import org.apache.commons.compress.archivers.ArchiveException;

public class TryandCatch {

	public static void main(String[] args) {

System.out.println("main method start");
try {
int i=1/0;
System.out.println("main method start2");
}catch(ArithmeticException e)
{
System.out.println("Handled");

	}
System.out.println("main method start2");
}
}
