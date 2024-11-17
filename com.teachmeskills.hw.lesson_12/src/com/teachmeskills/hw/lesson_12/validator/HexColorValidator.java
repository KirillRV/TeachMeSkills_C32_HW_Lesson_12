package com.teachmeskills.hw.lesson_12.validator;
import com.teachmeskills.hw.lesson_12.constants.Constants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HexColorValidator {
    public static String isValidHexColor(String hexCode) {
            Pattern pattern = Pattern.compile(Constants.Hex_Color_Pattern);
            Matcher matcher = pattern.matcher(hexCode);
            return (matcher.find()? "Yes":"No");
        }
    }