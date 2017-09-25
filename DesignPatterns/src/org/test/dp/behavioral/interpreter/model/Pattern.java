package org.test.dp.behavioral.interpreter.model;

import java.util.Arrays;
import java.util.List;

public interface Pattern
{
    List<Character> OPERATORS = Arrays.asList('+', '-', '*', '/', '%');

    // j8
    default String convert(final String exp)
    {
        throw new RuntimeException("Should be overridden");
    }
}
