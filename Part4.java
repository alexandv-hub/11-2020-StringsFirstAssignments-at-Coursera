import edu.duke.*;

/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Part4 {
    
 void checkYouTubeLinks (URLResource ur) {
 
         for (String s : ur.lines()) {
            if (s.contains("youtube.com")) {
                String link = "";    
                int startIndex = s.indexOf("\"http")+1;
                int stopIndex = s.indexOf("\">");
                link = s.substring(startIndex, stopIndex);
                System.out.println(link);
            }
            if (s.contains("YouTube.com")) {
                String link = "";    
                int startIndex = s.indexOf("\"http")+1;
                int stopIndex = s.indexOf("\">");
                link = s.substring(startIndex, stopIndex);
                System.out.println(link);
            }
            if (s.contains("YOUTUBE.com")) {
                String link = "";    
                int startIndex = s.indexOf("\"http")+1;
                int stopIndex = s.indexOf("\">");
                link = s.substring(startIndex, stopIndex);
                System.out.println(link);
            }
     
        }
    
    
    }
    
 void test () {
        URLResource ur = new URLResource("https://www.dukelearntoprogram.com/course2/data/manylinks.html");
        checkYouTubeLinks(ur);
        
 }
    

}

