package algorithms;

public class StringUtils {

    static boolean isUppercaseLoop(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isUpperCase(c)) return false;
        }
        return true;
    }

    static boolean isUppercaseStream(String s) {
        return s.chars().allMatch(Character::isUpperCase);
    }

    static boolean isGoodPassword(String s) {
        return s.chars().anyMatch(Character::isUpperCase) &&
                s.chars().anyMatch(Character::isLowerCase) &&
                s.chars().anyMatch(Character::isDigit);
    }

    static String normalize(String s) {
        return s.toLowerCase().replace(",", "").trim();
    }
    
}
