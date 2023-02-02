package org.example;

import jdk.jfr.Name;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import org.hamcrest.*;

class MainTest {
    public static Matcher<String> isEightChar(Matcher<Integer> myMatcher){
        return new FeatureMatcher<>(myMatcher,"Is word 8 characters long","Something went wrong! Word length:"){
            @Override
            protected Integer featureValueOf(String sentence) {
                int length = sentence.length();
                return length;
            }
        };
    }


    @Test
    @Name("counts the number of characters of the String sentence and compares it to number 8")
    void charactersNumber() {
  //      String sentence = "Mordor";
      String sentence = "isMordor";// used to check if it passes the test
        assertThat(sentence, isEightChar(is(equalTo(8))));
    }
}