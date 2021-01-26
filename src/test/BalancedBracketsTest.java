package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void returnsTrueOnEmptyString(){
        boolean expected = BalancedBrackets.hasBalancedBrackets("");
        assertTrue(expected);
    }

    @Test
    public void returnsTrue(){
        boolean expected = BalancedBrackets.hasBalancedBrackets("[]");
        assertTrue(expected);
    }

    @Test
    public void returnsFalse(){
        boolean expected = BalancedBrackets.hasBalancedBrackets("[");
        assertFalse(expected);
    }

    @Test
    public void returnsFalse2(){
        boolean expected = BalancedBrackets.hasBalancedBrackets("]");
        assertFalse(expected);
    }

    @Test
    public void returnsTrueOnNested(){
        boolean expected = BalancedBrackets.hasBalancedBrackets("[[meow]]");
        assertTrue(expected);
    }

    @Test
    public void returnsTrueOnBalanced(){
        boolean expected = BalancedBrackets.hasBalancedBrackets("[]meow[]");
    }

    @Test
    public void returnsFalseOnMisNested(){
        boolean expected = BalancedBrackets.hasBalancedBrackets("][[]");
        assertFalse(expected);
    }

    @Test
    public void returnsFalseOnMisNested2(){
        boolean expected = BalancedBrackets.hasBalancedBrackets("[]][");
        assertFalse(expected);
    }

    @Test
    public void returnsFalseOnImbalancedLeft(){
        boolean expected = BalancedBrackets.hasBalancedBrackets("[[meowwwwch!]");
        assertFalse(expected);
    }

    @Test
    public void returnsFalseOnImbalancedRight(){
        boolean expected = BalancedBrackets.hasBalancedBrackets("[meow!]]");
        assertFalse(expected);
    }

}
