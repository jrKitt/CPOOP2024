/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        WordLib dic = new WordLib();
        String sentence1 = "This is a sample sentence for similarity measurement.";
        String sentence2 = "For measuring similarity, this sample sentence is used.";

        dic.addTokenFromSentence(sentence1);
        dic.addTokenFromSentence(sentence2);
        dic.showAll();
        List<String> tokens = new ArrayList<>();
        tokens = WordLib.tokenize(sentence2);
        System.out.println(" ---- Sentence to tokens ---");
        tokens.forEach(System.out::println);

        System.out.println();
        int[] vector1 = new int[0];
        int[] vector2 = new int[0];

        for(int i = 0; i < vector2.length; i++) {
            System.out.print(vector2[i]);
        }
        System.out.println();

        // Compute the cosine similarity between the two vectors
        double similarity = WordLib.cosineSimilarity(vector1, vector2);
        System.out.println("Cosine Similarity: " + similarity);

    }
}