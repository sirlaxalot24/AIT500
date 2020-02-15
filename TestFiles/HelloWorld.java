/* This is a simple Java program. 
FileName : "HelloWorld.java". */
class HelloWorld 
{ 
	// Your program begins with a call to main(). 
	// Prints "Hello, World" to the terminal window. 
	public static void main(String args[]) 
	{ 
		int a = 5;
		int b = 10 * a++;
		int c = b * ++a;

		System.out.printf("c = %d%n", c);
	} 
}

