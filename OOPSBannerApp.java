/**
 * OOPSBannerApp UC4 – Render OOPS using String Array and Loop
 *
 * Improves UC3 by storing banner lines in a String array
 * and printing them using a for-each loop.
 *
 * @author Sai Praneeth Dara
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] lines = new String[7];

        lines[0] = String.join("", "  *****   ", "  *****   ", " ******** ", " *******  ");
        lines[1] = String.join("", " **   **  ", " **   **  ", " **     **", " **     **");
        lines[2] = String.join("", " **   **  ", " **   **  ", " **     **", " **       ");
        lines[3] = String.join("", " **   **  ", " **   **  ", " ******** ", "  ******  ");
        lines[4] = String.join("", " **   **  ", " **   **  ", " **       ", "       ** ");
        lines[5] = String.join("", " **   **  ", " **   **  ", " **       ", " **    ** ");
        lines[6] = String.join("", "  *****   ", "  *****   ", " **       ", "  ******  ");

        // Loop to print
        for (String line : lines) {
            System.out.println(line);
        }
    }
}