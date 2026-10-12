
public class IntelligentDNAPatternSearch {

    static int[] computeLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0;
        int i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    static void search(String dna, String pattern) {
        int[] lps = computeLPS(pattern);
        int i = 0, j = 0;
        boolean found = false;

        while (i < dna.length()) {
            if (dna.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == pattern.length()) {
                System.out.println(
                    "Pattern found at index " + (i - j));
                found = true;
                j = lps[j - 1];
            } else if (i < dna.length()
                    && dna.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        if (!found) {
            System.out.println("Pattern not found");
        }
    }

    public static void main(String[] args) {
        String dna = "ATGCGATGACCTG";
        String pattern = "ATG";

        System.out.println("DNA Sequence: " + dna);
        System.out.println("Search Pattern: " + pattern);

        search(dna, pattern);
    }
}


DNA Sequence: ATGCGATGACCTG
Search Pattern: ATG
Pattern found at index 0
Pattern found at index 5
