
package com.qaschool.validators;
public class PostValidator {

    public String getPostStatus(String postBody) {

        // 1. Verifică dacă este null sau gol
        if (postBody == null || postBody.isEmpty()) {
            return "ERROR_EMPTY";
        }

        // 2. Verifică dacă depășește 250 caractere
        if (postBody.length() > 250) {
            return "ERROR_TOO_LONG";
        }

        // 3. Verifică dacă conține cuvântul "politică" (lowercase exact cum ai cerut)
        if (postBody.contains("politică")) {
            return "ERROR_FORBIDDEN";
        }

        // 4. În orice alt caz
        return "POST_VALID";
    }
}

