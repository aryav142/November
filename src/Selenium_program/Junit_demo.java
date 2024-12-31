package Selenium_program;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junit_demo {
@Before
public void setup()
{
	System.out.println("Browser open");
}
@Test
public void test()
{
	System.out.println("Test activity");
}
@After
public void browserclose()
{
	System.out.println("Browser close");
}
}
