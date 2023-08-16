package uip;



import org.testng.annotations.Test;

public class TestNG2 {
	@Test
  	public void test1() {
  		System.out.println("I am test1");
  	}
@Test(priority=1)

  	public  void test2() {
  		System.out.println("I am test2");
  	}
@Test
public  void test3() {
		System.out.println(" a I am test3");
	}
}
