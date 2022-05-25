package com.Fizzbuzz.demo;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class FizzBuzzServiceTest {

    @Autowired
    private FizzBuzzService FBservice;

    @ParameterizedTest
    @CsvSource(value = {
             "1, 1",
             "4, 4",
    })
    void testNormalNumbers(int input,String result)
    {
        assertThat(FBservice.DefineRules(input)).isEqualTo(result);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "3, 3 ist Fizz",
            "6, 6 ist Fizz",
            "9, 9 ist Fizz",
    })
    void testFizzNumbers(int input,String result)
    {
        assertThat(FBservice.DefineRules(input)).isEqualTo(result);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "5, 5 ist Buzz",
            "10, 10 ist Buzz",
    })
    void testBuzzNumbers(int input,String result)
    {
        assertThat(FBservice.DefineRules(input)).isEqualTo(result);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "15, 15 ist FizzBuzz",
            "30, 30 ist FizzBuzz",
    })
    void testFizzBuzzNumbers(int input,String result)
    {
        assertThat(FBservice.DefineRules(input)).isEqualTo(result);
    }
}
