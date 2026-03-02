public class OOPSBannerApp6 {

    public static String[] getOPattern() {
        return new String[] {
            "   *****   ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            "   *****   "
        };
    }

    public static String[] getPPattern() {
        return new String[] {
            "  ******  ",
            " **    ** ",
            " **    ** ",
            " ******   ",
            " **       ",
            " **       ",
            " **       "
        };
    }

    public static String[] getSPattern() {
        return new String[] {
            "  ******  ",
            " **     ** ",
            " **       ",
            "  ******  ",
            "        ** ",
            " **     ** ",
            "   ******  "
        };
    }

    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        String[] lines = new String[oPattern.length];

        for (int i = 0; i < oPattern.length; i++) {
            lines[i] = String.join("   ",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]);
        }

        for (String line : lines) {
            System.out.println(line);
        }
    }
}