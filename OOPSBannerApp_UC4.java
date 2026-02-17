/**
 * OOPSBannerApp UC4 Render OOPS as Banner using String Array and Loop
 * * This class improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improving modularity and reusability. [cite: 324, 332]
 * * @author Developer
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        
       
        String[] bannerLines = new String[7];

       
        
        bannerLines[0] = String.join("", " **** ", " **** ", "*****", "   ***** ");
        bannerLines[1] = String.join("", "** ** ", "** ** ", "** ** ", "  ** ** ");
        bannerLines[2] = String.join("", "** ** ", "** ** ", "** ** ", "  ** ");
        bannerLines[3] = String.join("", "** ** ", "** ** ", "*****",  "   ***** ");
        bannerLines[4] = String.join("", "** ** ", "** ** ", "** ", "        ** ");
        bannerLines[5] = String.join("", "** ** ", "** ** ", "** ", "     ** ** ");
        bannerLines[6] = String.join("", " **** ", " **** ", "** ", "     ***** ");

        
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}