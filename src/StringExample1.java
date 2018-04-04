
public class StringExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String exampleSentence = "The cow jumped over the moon";
		 returnLongestWord(exampleSentence);
	       
	    }
	 
	 public static String returnLongestWord (String sentence) {
	        
	        String longestWord ="";
	        String splitWords [] = sentence.split(" ");
	          
	        for (int i=0; i<splitWords.length; i++){
	           
	        		String currentWord = splitWords[i].toLowerCase();
	            int currentLength = currentWord.length();
	            int longestLength = longestWord.length();
	         
	            
	            if(currentLength > longestLength){
	                longestWord = currentWord;
	            }
	            else{}
	        
	        
	         }
	        System.out.println(longestWord.length() + "  " + longestWord);
	        return longestWord;
		 
	 }

}
