public class Main {
    public static void main(String[] args) {
//        1. Параметирине String тибинде соз алып ал созду тескерисинен кылып кайтарган метод туз.
        System.out.println("1.");
        System.out.println(method1("Aiturgan"));

//        2. StringBuilder аркылуу создордун массивдерин алып, аларды бир сапка бириктирген метод түз.
        System.out.println("2.");
        System.out.println(method2(new String[]{"limon", "apelsin", "vishnya", "granata", "malina"}));

//        3. Параметирине соз алып ал создун ичинде канча ундуу тамга бар экенин эсептеген метод туз.
        System.out.println("3.");
        method3("antidisestablishmentarianism");

//        4. StringBuilder жардамы менен берилген. соз палиндром экенин текшеруучу метод туз.
        System.out.println("4");
        System.out.println("kazak");
        method4("kazak");
        System.out.println("water");
        method4("water");

//        5. StringBuilder аркылуу сүйлөмдөгү ар бир сөздүн биринчи тамгасын баш тамга менен жазуучу  метод туз.
        System.out.println("5.");
        System.out.println(method5("string is an object that represents sequence."));

//        6. String жана StringBuilder жардамы менен сүйлөмдөгү сөздөрдүн санын эсептөөчу метод туз.
        System.out.println("6.");
        System.out.println("string is an object that represents sequence");
        method6("string is an object that represents sequence.");

//        7. StringBuilder аркылуу ар бир тамганын өзүнүн ASCII коду менен алмаштырган метод туз.
        System.out.println("7.");
        System.out.println("string is an object that represents sequence");
        System.out.println(method7("string is an object that represents sequence"));

//        8. StringBuilder аркылуу cуйломдон бардык боштуктарды (пробелдерди) алып салуучу метод туз.
        System.out.println("8.");
        System.out.println("string is an object that represents sequence");
        System.out.println(method8("string is an object that represents sequence"));
    }

    public static String method1(String word) {
        StringBuilder stringBuilder = new StringBuilder(word.toLowerCase());
        stringBuilder.reverse();
        String reversedWord = stringBuilder.toString();
        char firstLetter = reversedWord.toUpperCase().charAt(0);
        stringBuilder.setCharAt(0, firstLetter);
        return stringBuilder.toString();
    }

    public static String method2(String[] words) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            stringBuilder.append(word);
        }
        return stringBuilder.toString();
    }

    public static void method3(String word) {
        int counter = 0;
        if (word.toLowerCase().contains("a")) counter++;
        if (word.toLowerCase().contains("e")) counter++;
        if (word.toLowerCase().contains("i")) counter++;
        if (word.toLowerCase().contains("o")) counter++;
        if (word.toLowerCase().contains("u")) counter++;
        if (word.toLowerCase().contains("y")) counter++;
        System.out.println("There are " + counter + " vowels in the word.");
    }

    public static void method4(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        String originalWord = word;
        String reversedWord = stringBuilder.reverse().toString();
        if (originalWord.equals(reversedWord)) {
            System.out.println("This is a palindrome word.");
        } else {
            System.out.println("This is not a palindrome word.");
        }
    }

    public static String method5(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.setCharAt(0, word.toUpperCase().charAt(0));
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                char greatLetter = word.toUpperCase().charAt(i + 1);
                stringBuilder.setCharAt(i + 1, greatLetter);
            }
        }
        return stringBuilder.toString();
    }

    public static void method6(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                counter++;
            }
        }
        System.out.println("There are " + (counter + 1) + " words in the sentence.");
    }

    public static String method7(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : word.toCharArray()) {
            int asciivalue = (int)ch;
            stringBuilder.append(asciivalue).append(" ");
        }
        return stringBuilder.toString();
    }

    public static String method8(String word){
        StringBuilder stringBuilder = new StringBuilder(word);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if(stringBuilder.charAt(i) ==' '){
                    stringBuilder.delete(i, i+1);
            }
        }
        return stringBuilder.toString();
    }
}