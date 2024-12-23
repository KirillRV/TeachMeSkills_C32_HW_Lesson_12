package com.teachmeskills.hw.lesson_12.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.teachmeskills.hw.lesson_12.constants.Constants.URL_PATTERN;

public class URL_validator {
    public static String isValidURL(String url) {
            Pattern pattern = Pattern.compile(URL_PATTERN);
            Matcher matcher = pattern.matcher(url);
            return (matcher.find()? "Yes":"No");
        }
}
