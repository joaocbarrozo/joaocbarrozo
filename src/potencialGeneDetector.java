public class potencialGeneDetector {
    public static boolean isGene(String dna) {
        // Sequence must be multiple of three
        if(dna.length() % 3 != 0){
            return false;
        }

        // Begins with a start codon
        if (!dna.startsWith("ATG")){
            return false;
        }

        //no intervening stop codon
        for(int i = 3; i < dna.length() - 3; i = i + 3){
            String codon = dna.substring(i, i+3);
            if(codon.startsWith("TAA")){
                return false;
            }
            if(codon.startsWith("TAG")){
                return false;
            }
            if(codon.startsWith("TGA")){
                return false;
            }
        }

        //ends with a ending codon
        if(dna.endsWith("TAA")){
            return true;
        }
        if(dna.endsWith("TAG")){
            return true;
        }
        if(dna.endsWith("TGA")){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        if(args.length < 1){
            throw new IllegalArgumentException("Usage: PotencialGeneDetector <sequence>");
        }
        String sequence = args[0];
        System.out.println(isGene(sequence));
    }
}
