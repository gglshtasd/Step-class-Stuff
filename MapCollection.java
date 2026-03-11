import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        patternMap.put('O', new String[]{
            "  *** ", " * * ", " * * ", " * * ", " * * ", " * * ", "  *** "
        });
        patternMap.put('P', new String[]{
            " **** ", " * * ", " * * ", " **** ", " * ", " * ", " * "
        });
        patternMap.put('S', new String[]{
            "  **** ", " * ", " * ", "  *** ", "     * ", "     * ", " **** "
        });
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }

    private static void renderBanner(String word) {
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                if (patternMap.containsKey(c)) {
                    line.append(patternMap.get(c)[i]);
                }
            }
            System.out.println(line.toString());
        }
    }
}
