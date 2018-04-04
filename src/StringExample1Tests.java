import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringExample1Tests {

	@Test
	public void noWordsShowsZeroTest() {
		String testString = "";
		assertEquals("", StringExample1.returnLongestWord(testString), "No words is 0");

	}

	@Test
	public void longestWordTest() {
		String testString = "this is the longest word";
		assertEquals("longest", StringExample1.returnLongestWord(testString), "Longest is the longest word");

	}

	@Test
	public void firstWordIsTheLongestTest() {
		String testString = "Latitude is the longest";
		assertEquals("latitude", StringExample1.returnLongestWord(testString), "First word can be longest");
	}

	@Test
	public void lastWordIsTheLongestTest() {
		String testString = "this is the longest";
		assertEquals("longest", StringExample1.returnLongestWord(testString), "Last word can be longest");
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
