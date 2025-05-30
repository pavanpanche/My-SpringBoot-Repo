package MyApp.management.services;

import org.junit.*;

import java.util.Date;

public class CalculatorServiceTest {

     // test cases using jUnit 4

    @BeforeClass
    public static void init(){
        System.out.println("before all test cases");
        System.out.println("Testing started :" + new Date());
    }
    @Before
    public void beforeEach(){
        System.out.println("Before each test cases");
    }
    @Test
    public void  addTwoNumbersTest(){
        System.out.println("addTwONumberTest");
        int result =CalculatorService.addTwoNumbers(12,45);
        // Expected result
        int expected =57;
        Assert.assertEquals(expected, result);

        //result = actual result

    }
    @Test
    public void productTwoNumbersTest(){

        System.out.println("productTwoNumberTest");
        int result = CalculatorService.productAnyNumbers(12,5);
            // Expected result
            int expected = 60;
            Assert.assertEquals(expected, result);

    }
    @Test
    public void divideTwoNumbersTest(){
        System.out.println("divideTwoNumberTest");
        int result = (int) CalculatorService.divideTwoNumbers(10, 2);
        //expected result
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumAnyNumbersTest(){
        System.out.println("sumAnyNumbersTest");
        int result = CalculatorService.sumAnyNumbers(1,2,4,7,9);
        //expected result
        int expected = 23;
        Assert.assertEquals(expected, result);
    }
    @AfterClass
    public static void cleanUp(){
        System.out.println("after all test cases:");
        System.out.println("Test Ended: " + new Date());
    }
}
