package com.TruptCase.Palindrome.Case.controller;

import com.TruptCase.Palindrome.Case.types.PalindromeRequest;
import com.TruptCase.Palindrome.Case.types.PalindromeResponse;
import com.TruptCase.Palindrome.Case.service.PalindromeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("palindrome-management")
public class PalindromeRestController {

    private final PalindromeService palindromeService;

    @PostMapping(value = "/palindromes")
    public PalindromeResponse saveIsPalindrome(@RequestBody PalindromeRequest request) {
        return palindromeService.saveIsPalindrome(request);
    }
}
