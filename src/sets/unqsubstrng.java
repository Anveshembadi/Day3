package sets;

import java.util.HashSet;
import java.util.Set;

public class unqsubstrng {
    public int uinq(String s) {
        Set<String> st = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            String str = "";
            for (int j = i; j < s.length(); j++) {
                str = str + s.charAt(j);
                st.add(str);
            }
        }
        return st.size();

    }

    public static void main(String[] args) {
        String s = "abcd";
        unqsubstrng us = new unqsubstrng();
        System.out.println(us.uinq(s));
    }
}
