package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            result.append(chars[i]);
        }
        System.out.print(result);
    }
}
