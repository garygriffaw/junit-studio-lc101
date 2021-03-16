package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("abc"));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsWithTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[a]"));
    }

    @Test
    public void nestedBracketsWithTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[a[b]]"));
    }

    @Test
    public void twoSameLevelNestedBracketsWithTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[a[b]cd[]]"));
    }

    @Test
    public void twoLevelsDeepNestedBracketsWithTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[a[bc[d]]]"));
    }

    @Test
    public void onlyLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void unbalancedRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void reversedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void unbalancedNestedBracketsWithTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[a[b]"));
    }

    @Test
    public void unbalancedTwoLevelsDeepNestedBracketsWithTextReturnsTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[a[bc][d]]]"));
    }
}
