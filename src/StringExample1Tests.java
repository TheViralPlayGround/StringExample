import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringExample1Tests {

	@Test
	public void noWordsShowsZero() {
		String testString ="";
		assertEquals("", StringExample1.returnLongestWord(testString), "No words is 0");
        
    }
	
	@Test
    public void longestWord() {
    		String testString ="this is the longest word";
        assertEquals("longest", StringExample1.returnLongestWord(testString), "Longest is the longest word");
        
    }
    
    @Test
    public void firstWordIsTheLongestTest() {
    		String testString = "Latitude is the longest";
    		assertEquals("latitude", StringExample1.returnLongestWord(testString), "First word is the longest string");
    }
    
    @Test
    public void ignoreCapitalizationTest() {
    		String testString = "this is AaaAAaaAaAaA sentence";
    		assertEquals("aaaaaaaaaaaa", StringExample1.returnLongestWord(testString), "Ignores capitalization");
    }
    
    @Test
    public void allowSpecialCharactersTest() {
    		String testString = "special !@#$%^&*():";
    		assertEquals("!@#$%^&*():", StringExample1.returnLongestWord(testString), "Allow special characters");
    }
    
}
