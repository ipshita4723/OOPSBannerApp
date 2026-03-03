/**
 * OOPSBannerApp
 * UC5: Render OOPS Banner using Inline Array Initialization
 */

public class OOPBannerApp_UC5 {

    public static void main(String[] args) {

        String[] banner = {
            " *****    *****   *****    *****",
            "*     *  *     *  *   *   *      ",
            "*     *  *     *  *****   *      ",
            "*     *  *     *  *        ***** ",
            "*     *  *     *  *             * ",
            " *****    *****   *       ****** "
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}