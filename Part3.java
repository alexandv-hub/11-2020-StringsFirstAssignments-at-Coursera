
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
    
    boolean twoOccurrences (String stringa, String stringb) {
        boolean isAAppearsTwiseInB = false;
        int counter = 0;
        int nextIndex = stringb.indexOf(stringa)+1;
        String secondPart="";
        if (stringb.contains(stringa)) {
            secondPart = stringb.substring(nextIndex); 
            counter++;            
        }
        
        if (secondPart.contains(stringa)) {
           counter++;  
        }
        
        if (counter==2)  isAAppearsTwiseInB=true;  
        System.out.println(isAAppearsTwiseInB);
        return isAAppearsTwiseInB;
    }
        
    String lastPart (String stringa, String stringb) {
          int nextIndex = stringb.indexOf(stringa)+stringa.length();
        String secondPart="";
        if (stringb.contains(stringa)) {
            secondPart = stringb.substring(nextIndex); 
            return secondPart;
        } 
        else
            return stringb;
       }
    
    void testTwoOccurrences () {
        String a = "a";
        String b = "banana";
        //twoOccurrences (a,b);
        //twoOccurrences("atg", "ctgtatgta");
        System.out.println(lastPart("zoo", "forest"));
        
    
    
    
    
    }
}
