import java.util.HashMap;
import java.util.Map;

public class SymbolConverter {
    private static final HashMap<String, String> symbolDict = new HashMap<>();

    static {
        symbolDict.put("\uD835\uDE70", "A");
        symbolDict.put("\uD835\uDE71", "B");
        symbolDict.put("\uD835\uDE72", "C");
        symbolDict.put("\uD835\uDE73", "D");
        symbolDict.put("\uD835\uDE74", "E");
        symbolDict.put("\uD835\uDE75", "F");
        symbolDict.put("\uD835\uDE76", "G");
        symbolDict.put("\uD835\uDE77", "H");
        symbolDict.put("\uD835\uDE78", "I");
        symbolDict.put("\uD835\uDE79", "J");
        symbolDict.put("\uD835\uDE7A", "K");
        symbolDict.put("\uD835\uDE7B", "L");
        symbolDict.put("\uD835\uDE7C", "M");
        symbolDict.put("\uD835\uDE7D", "N");
        symbolDict.put("\uD835\uDE7E", "O");
        symbolDict.put("\uD835\uDE7F", "P");
        symbolDict.put("\uD835\uDE80", "Q");
        symbolDict.put("\uD835\uDE81", "R");
        symbolDict.put("\uD835\uDE82", "S");
        symbolDict.put("\uD835\uDE83", "T");
        symbolDict.put("\uD835\uDE84", "U");
        symbolDict.put("\uD835\uDE85", "V");
        symbolDict.put("\uD835\uDE86", "W");
        symbolDict.put("\uD835\uDE87", "X");
        symbolDict.put("\uD835\uDE88", "Y");
        symbolDict.put("\uD835\uDE89", "Z");

        symbolDict.put("\uD835\uDE8A", "a");
        symbolDict.put("\uD835\uDE8B", "b");
        symbolDict.put("\uD835\uDE8C", "c");
        symbolDict.put("\uD835\uDE8D", "d");
        symbolDict.put("\uD835\uDE8E", "e");
        symbolDict.put("\uD835\uDE8F", "f");
        symbolDict.put("\uD835\uDE90", "g");
        symbolDict.put("\uD835\uDE91", "h");
        symbolDict.put("\uD835\uDE92", "i");
        symbolDict.put("\uD835\uDE93", "j");
        symbolDict.put("\uD835\uDE94", "k");
        symbolDict.put("\uD835\uDE95", "l");
        symbolDict.put("\uD835\uDE96", "m");
        symbolDict.put("\uD835\uDE97", "n");
        symbolDict.put("\uD835\uDE98", "o");
        symbolDict.put("\uD835\uDE99", "p");
        symbolDict.put("\uD835\uDE9A", "q");
        symbolDict.put("\uD835\uDE9B", "r");
        symbolDict.put("\uD835\uDE9C", "s");
        symbolDict.put("\uD835\uDE9D", "t");
        symbolDict.put("\uD835\uDE9E", "u");
        symbolDict.put("\uD835\uDE9F", "v");
        symbolDict.put("\uD835\uDEA0", "w");
        symbolDict.put("\uD835\uDEA1", "x");
        symbolDict.put("\uD835\uDEA2", "y");
        symbolDict.put("\uD835\uDEA3", "z");
    }

    public static String convertSymbolToChar(String input){
        for (Map.Entry<String, String> entry : symbolDict.entrySet()) {
          input =  input.replaceAll(entry.getKey(),entry.getValue());
        }
        return input;
    }

}


