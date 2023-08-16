package uip;

import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;


public class TestNGDemo {
@Test
	public  void run() {
	
	System.out.println("Running");
}

@Test
public  void login() {
	
	System.out.println("login");
}

@BeforeClass
public static void Checking() {
	
	System.out.println("Checking");
}
}
