public class Driver {
    public static void main(String[] args) {
        CaesarCipher caesarsCipher = new CaesarCipher();

        String message = "tqxxa iadxp";
        int shift = 12;

        String output = caesarsCipher.input(message,shift);

        System.out.println("Message : "+message+"\tShift: "+shift+"\nCipher : "+output);

    }
}
