
abstract interface I1
{
void m1() throws RuntimeException;	
}


abstract class AbstractTest
{
	public abstract void method() ;
	
	public  void method1()
	{
		
	}
	}

class Test {

	int a = 4;

	public  void m1() {
		System.out.println("Test Classs");
	}
}

class TestB extends Test {
	 int a=10;
	public  void m1() {
		System.out.println("float");
	}
}

public class OverrloadingTest {

	public static void main(String[] args) {
		
		Test t = new TestB();
		t.m1();
		System.out.println(t.a);

		
	}

}
