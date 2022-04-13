class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        StringBuilder alphabet = new StringBuilder();
        for (int i = 65; i < 91; i++) {
            alphabet.append(Character.toString(i) + " ");
        }
        return alphabet.deleteCharAt(51);
    }
}