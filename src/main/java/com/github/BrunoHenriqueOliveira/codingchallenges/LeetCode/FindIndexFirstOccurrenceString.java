package com.github.BrunoHenriqueOliveira.codingchallenges.LeetCode;

public class FindIndexFirstOccurrenceString {
    public int strStr(String haystack, String needle) {
        // Se needle é vazia, por definição a resposta é 0 (opcional: checar).
        if (needle.isEmpty()) return 0;
        return haystack.indexOf(needle);// retorna -1 se não encontrar
    }
}
