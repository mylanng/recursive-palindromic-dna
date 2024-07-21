public class Main {
	
    public static boolean checkPalidromicSeq(String fivePrimeToThreePrime, String threePrimeToFivePrime) {
    	// Initialize index i and length of the dna sequence
    	int i = 0;
    	int length = fivePrimeToThreePrime.length();
    	return DNAsequence (fivePrimeToThreePrime, threePrimeToFivePrime, i, length);
    }
    
    public static boolean DNAsequence (String fivePrimeToThreePrime, String threePrimeToFivePrime, int i, int length){
    	
        //Check each element of the two sequences until the index reach half of them.  
    	if (fivePrimeToThreePrime.charAt(i) == threePrimeToFivePrime.charAt(length-i-1) && i<length/2){
        	return DNAsequence (fivePrimeToThreePrime, threePrimeToFivePrime, i+1, length);
        }
        
        //If the index reach length/2 without any issue, it means the two sequences are palindromic. 
        else if (i==length/2) {
        	return true;
        }
        
        // If not, it means 2 sequences are not palindromic.
        else {
        	return false;
        }
    } 

    public static void main(String[] args) {
        System.out.println(checkPalidromicSeq("ATGC","GCAT"));
        System.out.println(checkPalidromicSeq("GAATTC","CTTAAG"));
        System.out.println(checkPalidromicSeq("GGATCC","CCTAGG"));
    }
}
