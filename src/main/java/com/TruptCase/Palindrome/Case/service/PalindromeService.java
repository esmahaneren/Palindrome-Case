package com.TruptCase.Palindrome.Case.service;

import com.TruptCase.Palindrome.Case.types.PalindromeRequest;
import com.TruptCase.Palindrome.Case.types.PalindromeResponse;

public interface PalindromeService {

    PalindromeResponse saveIsPalindrome(PalindromeRequest request);

}
