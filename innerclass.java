public class innerclass {
    public static void main(String[] args) {
        CharacterPatternMap charO = new CharacterPatternMap('O', "  *** ");
        CharacterPatternMap charP = new CharacterPatternMap('P', " **** ");
        CharacterPatternMap charS = new CharacterPatternMap('S', " **** ");

        String[] banner = {
            String.join("", charO.getPattern(), charO.getPattern(), charP.getPattern(), charS.getPattern()),
            String.join("", charO.getPattern(), charO.getPattern(), charP.getPattern(), charS.getPattern()),
            String.join("", charO.getPattern(), charO.getPattern(), charP.getPattern(), charS.getPattern()),
            String.join("", charO.getPattern(), charO.getPattern(), charP.getPattern(), charS.getPattern()),
            String.join("", charO.getPattern(), charO.getPattern(), charP.getPattern(), charS.getPattern()),
            String.join("", charO.getPattern(), charO.getPattern(), charP.getPattern(), charS.getPattern()),
            String.join("", charO.getPattern(), charO.getPattern(), charP.getPattern(), charS.getPattern())
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }

    static class CharacterPatternMap {
        private char character;
        private String pattern;

        public CharacterPatternMap(char character, String pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String getPattern() {
            return pattern;
        }
    }
}
