
package Collections;

import java.util.TreeSet;
public class URLsSort {
    public static void main(String[] args) {
        String str =
                "www.fb.com,www.insta.com,www.google.com,www.fb.com,www.youtube.com";
        String[] urls = str.split(",");
        TreeSet<String> set = new TreeSet<>();
        for (String url : urls) {
            set.add(url);
        }
        System.out.println(set);
        for (String url : set) {
            String[] names = url.split("\\.");
            System.out.println(names[1]);
        }
    }
}

o/p:

fb
google
insta
youtube
