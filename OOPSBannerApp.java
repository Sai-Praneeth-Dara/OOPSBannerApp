/**
 * OOPSBannerApp
 *
 * UC6: Render OOPS Banner using Static Helper Methods
 *
 * @author Sai Praneeth Dara 
 * @version 6.0
 */
public class OOPSBannerApp {

    // Method to generate pattern for letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "  ***   ",
            " ** **  ",
            "**   ** ",
            "**   ** ",
            "**   ** ",
            " ** **  ",
            "  ***   "
        };
    }

    // Method to generate pattern for letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            " *****  ",
            " **  ** ",
            " **   **",
            " *****  ",
            " **     ",
            " **     ",
            " **     "
        };
    }

    // Method to generate pattern for letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            " ***** ",
            " **    ",
            " **    ",
            " ***   ",
            "   **  ",
            "   **  ",
            " ***** "
        };
    }

    // Main method
    public static void main(String[] args) {

        // Get patterns using methods
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Print banner line by line
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + " " +
                oPattern[i] + " " +
                pPattern[i] + " " +
                sPattern[i]
            );
        }
    }
}