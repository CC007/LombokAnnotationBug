package com.github.cc007.bugs.lombokannotationbug;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.experimental.UtilityClass;

@UtilityClass
@FieldDefaults(makeFinal = true, level = AccessLevel.PUBLIC)
public class MyUtilClass {
    String MY_PSF_STRING= "SomeString";
}
