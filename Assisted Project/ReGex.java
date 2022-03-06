package com.company;
import java.util.regex.*;
public class ReGex {

        public static void main(String[] args) {

            String pattern = "[a-z,A-Z,]+";
            String check = "Sumit Mishra is working at Mphasis";

            Pattern p = Pattern.compile(pattern);
            Matcher c = p.matcher(check);

            while (c.find())
                System.out.println( check.substring( c.start(), c.end() ) );
        }
}
