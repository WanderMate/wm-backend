package io.wandermate.wmbackend.user.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ApiExceptionResponse {

    private String message;

    public ApiExceptionResponse(String message) {
        this.message = message;
    }
}
