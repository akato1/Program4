/***
* Example JUnit testing class for Circle1 (and Circle)
*
* - must have your classpath set to include the JUnit jarfiles
* - to run the test do:
*     java org.junit.runner.JUnitCore Circle1Test
* - note that the commented out main is another way to run tests
* - note that normally you would not have print statements in
*   a JUnit testing class; they are here just so you see what is
*   happening. You should not have them in your test cases.
***/

import org.junit.*;

public class Circle1Test
{
   // Data you need for each test case
   private Circle2 circle2;
   private Circle2 circle3;

// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   //System.out.println("\nTest starting...");
   circle2 = new Circle2(1,2,3);
   circle3 = new Circle2(3,9,4);
}

//
// Stuff you want to do after each test case
//
@After
public void teardown()
{
   //System.out.println("\nTest finished.");
}

//
// Test a simple positive move
//
@Test
public void simpleMove()
{
   Point p;
   //System.out.println("Running test simpleMove.");
   p = circle2.moveBy(1,1);
   Assert.assertTrue(p.x == 2 && p.y == 3);
}

// 
// Test a simple negative move
//
@Test
public void simpleMoveNeg()
{
   Point p;
   //System.out.println("Running test simpleMoveNeg.");
   p = circle2.moveBy(-1,-1);
   Assert.assertTrue(p.x == 0 && p.y == 1);
}

// 
// Test a simple scale up
//
@Test
public void simpleScaleUp()
{
   double radius = circle2.scale(2);
   Assert.assertTrue(radius == 6);
}

// 
// Test a simple scale down
//
@Test
public void simpleScaleDown()
{
   double radius = circle2.scale(0.5);
   Assert.assertTrue(radius == 1.5);
}

// 
// Test a simple intersection
//
@Test
public void simpleIntersection()
{
   Assert.assertTrue(circle2.intersection(circle3);
}

/*** NOT USED
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("Circle1Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
***/

}
