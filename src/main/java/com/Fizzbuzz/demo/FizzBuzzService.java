package com.Fizzbuzz.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FizzBuzzService {



    public List<String> execute(int input)
    {
        List<String> result = new ArrayList<>();
        if(input>=0) {
            for (int i = 0; i <= input; i++)
                result.add(DefineRules(i));
        }
        else
        {
            for(int i=0;i>=input;i--)
                result.add(DefineRules(i));
        }
        return result;
    }

    public String DefineRules(int input)
    {
        if(input%3==0 && input%5==0)
            return Integer.toString(input)+ " ist FizzBuzz";
        else if(input%3==0)
            return Integer.toString(input) + " ist Fizz";
        else if(input%5==0)
            return Integer.toString(input)+ " ist Buzz";
        else
            return Integer.toString(input);
    }
}
