package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by admin on 2017/4/18.
 */
public class RegexExample1 {
    public static void main(String[] args){
        String content = "I am noob " +
                "from runoob.com.";

        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);


        Pattern p = Pattern.compile("dog");
        Matcher m = p.matcher("The dog says meow. All dogs say wo");
        System.out.println(m.replaceAll("cat"));
    }
}
