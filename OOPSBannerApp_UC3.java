/**
 * OOPSBannerApp UC3 OOPS Banner Application
 * Uses String.join() for memory efficiency[cite: 169, 177].
 */
public class OOPSBannerApp_UC3 {
    public static void main(String[] args) {
        // Row 1 
        System.out.println(String.join("", " **** ", " **** ", "******", "  ***** "));
        // Row 2
        System.out.println(String.join("", "** ** ", "** ** ", "** **", "   ** ** "));
        // Row 3
        System.out.println(String.join("", "** ** ", "** ** ", "** **", "   ** "));
        // Row 4
        System.out.println(String.join("", "** ** ", "** ** ", "****** ",  " ***** "));
        // Row 5
        System.out.println(String.join("", "** ** ", "** ** ", "** ", "         ** "));
        // Row 6
        System.out.println(String.join("", "** ** ", "** ** ", "** ", "      ** ** "));
        // Row 7
        System.out.println(String.join("", " **** ", " **** ", "** ", "      ***** "));
    }
}
