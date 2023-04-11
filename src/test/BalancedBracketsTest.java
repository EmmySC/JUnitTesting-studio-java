package test;

import org.junit.Test;

import static org.junit.Assert.*;

import main.BalancedBrackets;



public class BalancedBracketsTest {

    //TODO: add tests here
        //@Test
        //public void emptyTest() {
        assertEquals(true, true);
    }
        //}

//POSITIVE TEST CASES//

    //refactor instructions example test to  use AAA pattern & message parameter
    @Test
    public void onlyPairOfBrackets() {
        String spec = "a single pair of brackets returns true";
        String expectedTestData = "[]";
        boolean actualResult = BalancedBrackets.hasBalancedBrackets(expectedTestData);
        assertTrue(spec, actualResult));
    }

    //balanced brackets in front of other characters --> "[]LaunchCode"
    @Test
    public void pairOfBracketsBeforeCharacters() {
        String spec = "a pair of brackets before other characters returns true";
        String expectedTestData = "[]LaunchCode";
        boolean actualResult = BalancedBrackets.hasBalancedBrackets(expectedTestData);
        assertTrue(spec, actualResult));
    }

    //balanced brackets around other characters --> "[LaunchCode]"
    @Test
    public void pairOfBracketsAroundCharacters() {
        String spec = "a pair of brackets around other characters returns true";
        String expectedTestData = "[LaunchCode]";
        boolean actualResult = BalancedBrackets.hasBalancedBrackets(expectedTestData);
        assertTrue(spec, actualResult));
    }

    //"Launch[Code]"
    @Test
    public void pairOfBracketsWithinCharacters() {
        String spec = "a pair of brackets within/among other characters returns true";
        String expectedTestData = "Launch[Code]";
        boolean actualResult = BalancedBrackets.hasBalancedBrackets(expectedTestData);
        assertTrue(spec, actualResult));
    }

    //"[]"
    @Test
    public void pairOfBrackets() {
        String spec = "a single pair of brackets returns true";
        String expectedTestData = "[]";
        boolean actualResult = BalancedBrackets.hasBalancedBrackets(expectedTestData);
        assertTrue(spec, actualResult));
    }

    //nested pairs of brackets [[]];
    @Test
    public void nestedPairsOfBrackets() {
        String spec = "nested pairs of balanced brackets returns true";
        String expectedTestData = "[[]]";
        boolean actualResult = BalancedBrackets.hasBalancedBrackets(expectedTestData);
        assertTrue(spec, actualResult));
    }

//NEGATIVE TEST CASES//
    //single opening bracket --> "[";
    @Test
    public void singleOpeningBracket() {
        String spec = "a single opening bracket returns false";
        String expectedTestData = "[";
        boolean actualResult = BalancedBrackets.hasBalancedBrackets(expectedTestData);
        assertFalse(spec, actualResult));
    }

    //single closing bracket --> "]";
    @Test
    public void singleClosingBracket() {
        String spec = "a single closing bracket returns false";
        String expectedTestData = "]";
        boolean actualResult = BalancedBrackets.hasBalancedBrackets(expectedTestData);
        assertFalse(spec, actualResult));
    }

    //pair of reversed brackets --> "][";
    @Test
    public void pairOfReversedBrackets() {
        String spec = "a pair of reversed brackets returns false";
        String expectedTestData = "][";
        boolean actualResult = BalancedBrackets.hasBalancedBrackets(expectedTestData);
        assertFalse(spec, actualResult));
    }

    //single bracket with other characters --> "[LaunchCode";
    @Test
    public void singleBracketWithCharacters() {
        String spec = "a single bracket with other characters returns false";
        String expectedTestData = "[LaunchCode";
        boolean actualResult = BalancedBrackets.hasBalancedBrackets(expectedTestData);
        assertFalse(spec, actualResult));
    }

    //unbalanced brackets whithin/among other characters --> "Launch]Code["


    //a series of mixed, unbalanced, brackets --> "[[][[]]]["


//EDGE CASES//
    //empty string --> ""
    @Test
    public void emptyString() {
        String spec = "an empty string returns true";
        String expectedTestData = "";
        boolean actualResult = BalancedBrackets.hasBalancedBrackets(expectedTestData);
        assertTrue(spec, actualResult));
    }

    //string with only characters, no brackets --> "LaunchCode"
    @Test
    public void onlyCharacters() {
        String spec = "a string with only characters, no brackets, returns true";
        String expectedTestData = "LaunchCode";
        boolean actualResult = BalancedBrackets.hasBalancedBrackets(expectedTestData);
        assertTrue(spec, actualResult));
    }



