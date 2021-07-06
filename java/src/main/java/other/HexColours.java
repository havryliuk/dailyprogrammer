package other;

class HexColours {

    String hexColor(int... values) {
        if (values.length != 3) {
            return "";
        } else {
            var hex = new StringBuilder("#");
            for (int value : values) {
                var part = Integer.toHexString(value);
                if (part.length() == 1) {
                    hex.append("0").append(part);
                } else {
                    hex.append(part);
                }
            }
            return hex.toString().toUpperCase();
        }
    }
}
