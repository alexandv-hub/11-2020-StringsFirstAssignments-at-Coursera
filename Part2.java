
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {

    public String findSimpleGene(String dna, String startCodon, String stopCodon ) {
   String geneFound = "";
            int startIndex = dna.indexOf(startCodon);
            int stopIndex = dna.indexOf(stopCodon, startIndex + 3);
            if ((startIndex < stopIndex) && ((stopIndex - startIndex) % 3 == 0)) {
                geneFound = dna.substring(startIndex, stopIndex + 3);
            } else {
                startCodon = startCodon.toLowerCase();
                stopCodon = stopCodon.toLowerCase();
                startIndex = dna.indexOf(startCodon);
                stopIndex = dna.indexOf(stopCodon, startIndex + 3);
                if ((startIndex < stopIndex) && ((stopIndex - startIndex) % 3 == 0)) {
                    geneFound = dna.substring(startIndex, stopIndex + 3);
                    geneFound.toLowerCase();
                }
            }

            System.out.println("findSimpleGene=" + geneFound);
            return geneFound;
        }
    
    
    public void testSimpleGene () {
   
        findSimpleGene("AAATGCCCTAACTAGATTAAGAAACC", "ATG", "TAA");
        // findSimpleGene("gatgctataat", "ATG", "TAA");
    }

}
