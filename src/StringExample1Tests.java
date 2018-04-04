import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringExample1Tests {

	@Test
	public void noWordsShowsZero() {
		String as ="";
        assertEquals("", StringExample1.returnLongestWord(as), "No words is 0");
        
    }
    
}
