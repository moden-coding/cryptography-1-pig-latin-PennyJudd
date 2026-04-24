public class PigLatin {

    // Converts a single word to Pig Latin.
    // Move the first letter to the end, then add "ay".
    // Example: "hello" → "ellohay"
    public String pigLatinWord(String word) {
        

        char one = word.charAt(0);
        String rest = word.substring(1);
        String full = rest + one + "ay";
        
        // TODO: grab the first letter using charAt(0)

        // TODO: grab the rest of the word using substring(1)

        // TODO: return rest + firstLetter + "ay"

        return full; // replace this line with your answer
    }


    // Converts every word in a sentence to Pig Latin.
    // Example: "hello world" → "ellohay orldway"
    public String pigLatinSentence(String sentence) {

        String[] words = sentence.split(" ");
        int i = 0;
        String fullWord = "";
        String all = "";
       
      
        for(String word : words){
            all += pigLatinWord(word) + " ";
        }
        // while (i < (words.length)){
            
        // // char one = words[i].charAt(0);
        // // String rest = words[i].substring(1);
        // // fullWord = rest + one + "ay" + " ";
        // all = all + fullWord;
        // i++;
       
         
       

         

        // TODO: split the sentence into an array of words using split(" ")

        // TODO: loop through the array and call pigLatinWord on each word

        // TODO: put the words back together with spaces between them

        return all; // replace this line with your answer
    }


    public static void main(String[] args) {
        PigLatin pl = new PigLatin();

        // ── Test pigLatinWord ────────────────────────────────────
        System.out.println("=== pigLatinWord ===");

        System.out.println(pl.pigLatinWord("hello"));        // expected: ellohay
        System.out.println(pl.pigLatinWord("java"));         // expected: avajay
        System.out.println(pl.pigLatinWord("cryptography")); // expected: ryptographycay
        System.out.println(pl.pigLatinWord("string"));       // expected: tringsay
        System.out.println(pl.pigLatinWord("a"));            // expected: aay


        // ── Test pigLatinSentence ────────────────────────────────
        System.out.println("\n=== pigLatinSentence ===");

        System.out.println(pl.pigLatinSentence("hello world"));
        // expected: ellohay orldway

        System.out.println(pl.pigLatinSentence("the quick brown fox"));
        // expected: hetay uickqay rownbay oxfay

        System.out.println(pl.pigLatinSentence("java is fun to learn"));
        // expected: avajay siay unfay otay earnlay

        System.out.println(pl.pigLatinSentence("i love coding in java"));
        // expected: iay ovelay odingcay niay avajay
    }

}
