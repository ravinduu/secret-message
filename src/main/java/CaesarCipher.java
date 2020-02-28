public class CaesarCipher {
    private static final int noOfLetters = 26;
    private static final char first = 'a', last = 'z';

    public String input(String message, int shift){
        //return encode(message, shift);
        return decode(message,shift);
    }

    private String decode(String message, int shift) {
        char[] messageArray = message.trim().toLowerCase().toCharArray();

        for(int i = 0; i < messageArray.length; i++){
            messageArray[i] = decodeCharacter(messageArray[i],shift);
        }
        return String.valueOf(messageArray);
    }

    private char decodeCharacter(char c, int shift) {
        if (c != ' ') {
            c -= shift%noOfLetters;
            if(c < first){
                c = (char) (last - (first - c -1));
            }
        }
        return c;
    }

    private String encode(String message, int shift) {
        char[] messageArray = message.trim().toLowerCase().toCharArray();

        for(int i = 0; i < messageArray.length; i++){
            messageArray[i] = encodeCharacter(messageArray[i],shift);
        }
        return String.valueOf(messageArray);
    }
    private char encodeCharacter(char c, int shift) {
        if (c != ' ') {
            c += shift%noOfLetters;
            if(c > last){
                c = (char) (first + (c - last-1));
            }
        }
        return c;
    }
}
