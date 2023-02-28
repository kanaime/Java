
class Code {

    static String MESSAGE1 = "0@sn9sirppa@#?ia'jgtvryko1";
    static String MESSAGE2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
    static String MESSAGE3 = "aopi?sedohtém@#?sedhtmg+p9l!";
    static int START_CHAR = 5;

    private static int key(String message) {
        return message.length() / 2;
    }

    private static String sub(String message, int key) {
        int keyFigure = key;
        return message.substring(START_CHAR, START_CHAR + keyFigure);
    }

    private static String replace(String message) {
        return message.replace("@#?", " ");
    }

    private static String reverse(String message) {
        String reverseMessage = "";

        for (int i = message.length() - 1; i >= 0; i--) {
            reverseMessage += message.charAt(i);
        }

        return reverseMessage;
    }

    private static String decipherer(String message) {
        int key = key(message);
        String stepTwo = sub(message, key);
        String stepThree = replace(stepTwo);
        String stepFour = reverse(stepThree);
        return stepFour;
    }

    public static void main(String[] args) {
        System.out.println(decipherer(MESSAGE1));
        System.out.println(decipherer(MESSAGE2));
        System.out.println(decipherer(MESSAGE3));
    }
}