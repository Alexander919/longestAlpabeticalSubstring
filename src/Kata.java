import java.util.ArrayList;

public class Kata {

    public static String longestAlpabeticalSubstring(String text) {
        if (text.length() == 1) return text;
        char[] chars = text.toCharArray();
        StringBuilder sub = new StringBuilder();

        ArrayList<String> subs = new ArrayList<>();

        for (int i = 1; i < chars.length; i++) {
            char c1 = chars[i - 1];
            char c2 = chars[i];

            sub.append(c1);

            if (c2 >= c1 && i == chars.length - 1) {
                sub.append(c2);
                subs.add(sub.toString());
            }

            if (c2 < c1) {
                subs.add(sub.toString());
                sub.setLength(0);
            }

            if (c2 < c1 && i == chars.length - 1) {
                subs.add(Character.toString(c2));
            }
        }
        System.out.println(subs);

        return subs.stream().reduce((acc, v) -> v.length() > acc.length() ? v : acc).get();
    }
}
