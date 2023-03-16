package Java.seminar4.hw2;

public class Ex {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        char[] charArray = new char[s.length()];
        charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i += 2) {
            if (charArray[i] == '(' && charArray[i + 1] != ')') {
                return false;
            } else if (charArray[i] == '[' && charArray[i + 1] != ']') {
                return false;
            } else if (charArray[i] == '{' && charArray[i + 1] != '}') {
                return false;
            }
        }
        return true;
    }
}
