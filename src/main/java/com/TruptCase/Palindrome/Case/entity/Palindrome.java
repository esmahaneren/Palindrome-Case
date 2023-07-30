package com.TruptCase.Palindrome.Case.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "palindrome")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Palindrome {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="word")
    private String word;

    @Column(name="reverse-word")
    private String reverseWord;

    @Column(name="is-palindrome")
    private Boolean isPalindrome;

}
