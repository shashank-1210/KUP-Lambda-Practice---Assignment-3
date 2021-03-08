package Assignment;

import org.junit.Assert;
import org.junit.Test;
public class StringOperationTest {
    
    
    StringConcatUpperCaseImpl obj = new StringConcatUpperCaseImpl();

    @Test
    public void test1()
    {
        String expected="THELAMBDAHASTOOMANYSTRINGARGUMENTS.";
        String actual = obj.s.operation("The","lambda","has","too","many","string","arguments.");

        Assert.assertEquals(expected,actual);
    }


    ////Negative test case because expected output will be THELAMBDAHASTOOMANYSTRINGARGUMENTS.
    @Test
    public void test2()
    {
        String expected="THE LAMBDA HAS TOO MANY STRING ARGUMENTS.";
        String actual = obj.s.operation("The","lambda","has","too","many","string","arguments.");

        Assert.assertNotEquals(expected,actual);
    }




}