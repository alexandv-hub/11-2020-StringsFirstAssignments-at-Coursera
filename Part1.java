
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
    public String findSimpleGene(String dna) {
        String geneFound = "";
        int startIndex = dna.indexOf("ATG");
        int stopIndex = dna.indexOf("TAA", startIndex+3);
        if ( (startIndex < stopIndex) && ((stopIndex-startIndex)%3==0) )
            geneFound = dna.substring(startIndex, stopIndex+3);

        System.out.println("findSimpleGene=" + geneFound);
        return geneFound;
    }
    
    
    public void testSimpleGene () {
        String s1 = "AATGTTTGGGTAAHT";
        String s2 = "AATGTTTTGGGTAAHTAA";
        String s3 = "AATGAGGGTTAGTTGAATTGGGHT";
        String s4 = "AGGGTTAGTTGHT";
        String s5 = "ATTAHT";
        findSimpleGene(s1);
        findSimpleGene(s2);
        findSimpleGene(s3);
        findSimpleGene(s4);
        findSimpleGene(s5);
    }

}
