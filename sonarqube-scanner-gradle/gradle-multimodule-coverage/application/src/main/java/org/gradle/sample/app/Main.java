package org.gradle.sample.app;

import org.gradle.sample.list.LinkedList;

import static org.gradle.sample.utilities.StringUtils.join;
import static org.gradle.sample.utilities.StringUtils.split;
import static org.gradle.sample.app.MessageUtils.getMessage;

public class Main {
    public static void main(String[] args) {
        int test;
            test = 0;
            test += 1;
        int test2 = 0;
        System.out.println(test);
        LinkedList tokens;
        
                tokens = split(getMessage());
        System.out.println(join(tokens));
    }
}
