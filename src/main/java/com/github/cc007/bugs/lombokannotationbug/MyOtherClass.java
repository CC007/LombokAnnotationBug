package com.github.cc007.bugs.lombokannotationbug;

import com.github.cc007.bugs.lombokannotationbug.somestuff.SomeAnnotation;
import com.github.cc007.bugs.lombokannotationbug.somestuff.SomeInput;
import com.github.cc007.bugs.lombokannotationbug.somestuff.SomeResult;

public interface MyOtherClass {
    @SomeAnnotation(someString = MyUtilClass.MY_PSF_STRING + "stringPostfix")
    SomeResult someMethod(SomeInput someInput);

    @SomeAnnotation(someString = MyUtilClassNoLombok.MY_PSF_STRING + "stringPostfix")
    SomeResult someOtherMethod(SomeInput someInput);
}