import java.util.Arrays;

public class TesterFonctionDeTrie {

    public TesterFonctionDeTrie() {
    }

    public void testerAlgorithmeDeTri(int[] array, String nomAlgorithme, Triable triable) {
        int[] copieArray = Arrays.copyOf(array, array.length);
        long startTime = System.nanoTime();
        triable.trier(copieArray);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(nomAlgorithme + " a pris " + duration + " nanosecondes.");
    }

    public static void main(String[] args) {
        TesterFonctionDeTrie testeur = new TesterFonctionDeTrie();
        int[] array = {5, 3, 8, 4, 2};

        testeur.testerAlgorithmeDeTri(array, "Tri à bulles", new TriABulles());
        // Ajoutez d'autres algorithmes de tri ici
    }
}