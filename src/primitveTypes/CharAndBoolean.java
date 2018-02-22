package primitveTypes;

public class CharAndBoolean {

    public static void main(String[] args) {

        // char has a width of 16 - 2 bytes
        // can store only 1 character, numbers or letter, just one.
        // can store unicode characters!
        char myChar = 'D';
        char myCharUnicode  = '\u00A9'; // Copyright symbols from https://unicode-table.com/en/#00A9
        System.out.println(myCharUnicode);

        // can only be true or false
        boolean myBoolean = true;
    }
}
