package test;

import static org.junit.Assert.*;

import org.junit.Test;

import hello.MyClass;

public class MyClassTest {

	@Test
	public void test() {
		MyClass mc = new MyClass();
		assertEquals("Hello World", mc.getHello());
	}

}
