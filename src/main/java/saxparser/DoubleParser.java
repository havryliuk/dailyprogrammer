package saxparser;

class DoubleParser {

    private DoubleParser() {

    }

    static double parse(String s) {
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return Double.parseDouble(s.replace(",", "."));
        }
    }
}
