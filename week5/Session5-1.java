class Main {
    public static void main(String[] args) {

        String[] words = {"mass", "as", "hero", "superhero"};

        System.out.println("Matching strings:");

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words.length; j++) {

                if (i != j && words[j].contains(words[i])) {
                    System.out.println(words[i]);
                    break;
                }
            }
        }
    }
}
Output
Matching strings:
as
hero
