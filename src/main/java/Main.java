import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Letter> letters1 = List.of(new Letter('a'), new Letter('b'), new Letter('c'));
        List<Letter> letters2 = List.of(new Letter('a'), new Letter('b'), new Letter('c'), new Letter('a'));
        List<Letter> letters3 = List.of(new Letter('a'), new Letter('a'), new Letter('b'));

        Word word1 = new Word(letters1);
        Word word2 = new Word(letters2);
        Word word3 = new Word(letters3);

        Sentence sentence = new Sentence(List.of(word1, word2, word3));
        Text text = new Text(List.of(sentence));

        List<Word> sortedWords = text.sortWordsByLetterCount('a');

        for (Word word : sortedWords) {
            System.out.println(word.getLetters() + ": " + countLetter(word, 'a'));
        }
    }

    private static long countLetter(Word word, char targetLetter) {
        return word.getLetters().stream()
                .filter(letter -> letter.getValue() == targetLetter)
                .count();
    }
}
