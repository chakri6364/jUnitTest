package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitTestFunctions junitstring = new jUnitTestFunctions();
		String result = junitstring.addStrings("capstone", "project");
		assertEquals("capstoneproject", result);
	}

}