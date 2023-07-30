package com.TruptCase.Palindrome.Case.repository;

import com.TruptCase.Palindrome.Case.entity.Palindrome;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PalindromeRepository  extends JpaRepository<Palindrome, Long> {

}
