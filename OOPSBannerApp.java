/**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 *
 * This use case extends UC6 by implementing a CharacterPatternMap
 * inner static class to encapsulate character-to-pattern mappings.
 *
 * @author Sai Praneeth Dara
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * CharacterPatternMap – Inner static class for storing
     * character and its ASCII banner pattern.
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character the character
         * @param pattern ASCII pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /** Getter for character */
        public char getCharacter() {
            return character;
        }

        /** Getter for pattern */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates and initializes pattern maps for O, P, S and space
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
            "  ***   ",
            " ** **  ",
            "**   ** ",
            "**   ** ",
            "**   ** ",
            " ** **  ",
            "  ***   "
        };

        String[] P = {
            " *****  ",
            " **  ** ",
            " **   **",
            " *****  ",
            " **     ",
            " **     ",
            " **     "
        };

        String[] S = {
            " ***** ",
            " **    ",
            " **    ",
            " ***   ",
            "   **  ",
            "   **  ",
            " ***** "
        };

        String[] SPACE = {
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       "
        };

        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', O),
            new CharacterPatternMap('P', P),
            new CharacterPatternMap('S', S),
            new CharacterPatternMap(' ', SPACE)
        };
    }

    /**
     * Returns pattern for given character
     */
    public static String[] getCharacterPattern(char ch,
                                               CharacterPatternMap[] maps) {

        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return maps[maps.length - 1].getPattern(); // return space
    }

    /**
     * Prints banner message
     */
    public static void printMessage(String message,
                                    CharacterPatternMap[] maps) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, maps);
                line.append(pattern[row]).append(" ");
            }

            System.out.println(line);
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        CharacterPatternMap[] maps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, maps);
    }
}