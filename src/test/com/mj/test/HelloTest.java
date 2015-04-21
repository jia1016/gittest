package test.com.mj.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mj.test.Hello;
import com.sun.net.httpserver.Authenticator.Success;

public class HelloTest {

	@Test
	public void testSayYes() {
		
	}

	/**
	 * 
	 */
	@Test
	public void testHelloHi() {
		Hello h=new Hello();
		boolean hello=h.hello("Hi");
		assertTrue(hello);
	}
	
	@Test
	public void testHelloNoHi() {
		Hello h=new Hello();
		boolean hello=h.hello("Hi2");
		assertFalse(hello);
	}

}
