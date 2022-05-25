package com.Fizzbuzz.demo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bound")
@Data@NoArgsConstructor
public class FizzBuzzController {
    private FizzBuzzService FBService;

    @Autowired
    public FizzBuzzController(FizzBuzzService FBService)
    {
        this.FBService = FBService;
    }

    @GetMapping("/{input}")
    public String  getBound(@PathVariable int input)
    {
        return FBService.execute(input);
    }
}
