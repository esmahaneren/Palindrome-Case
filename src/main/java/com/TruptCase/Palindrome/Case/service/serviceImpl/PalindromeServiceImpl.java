package com.TruptCase.Palindrome.Case.service.serviceImpl;

import com.TruptCase.Palindrome.Case.entity.Palindrome;
import com.TruptCase.Palindrome.Case.repository.PalindromeRepository;
import com.TruptCase.Palindrome.Case.types.PalindromeRequest;
import com.TruptCase.Palindrome.Case.types.PalindromeResponse;
import com.TruptCase.Palindrome.Case.service.PalindromeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PalindromeServiceImpl implements PalindromeService {

    private final PalindromeRepository palindromeRepository;

    @Override
    public PalindromeResponse saveIsPalindrome(PalindromeRequest request) {
        PalindromeResponse response = new PalindromeResponse();
        response.setIsPalindrome(isPalindrome(request.getWord()));

        savePalindrome(request);

        return response;
    }

    private void savePalindrome(PalindromeRequest request) {
        Palindrome palindromeEntity = new Palindrome();
        palindromeEntity.setWord(request.getWord());
        palindromeEntity.setReverseWord(getReverse(request.getWord()));
        palindromeEntity.setIsPalindrome(isPalindrome(request.getWord()));
        palindromeRepository.save(palindromeEntity);
    }

    public String getReverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public Boolean isPalindrome(String word) {
        boolean isPalindrome = Boolean.FALSE;
        if (word.equalsIgnoreCase(getReverse(word))) {
            isPalindrome = Boolean.TRUE;
        }
        return isPalindrome;
    }
}
