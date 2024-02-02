package io.wandermate.wmbackend.user.service;

import static java.util.stream.Collectors.joining;

import io.wandermate.wmbackend.user.model.WmUserCreateRequest;
import jakarta.validation.Validation;
import jakarta.validation.ValidationException;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.springframework.stereotype.Service;

@Service
public class WmUserValidatorService {

    public void validateWmUserCreateRequest(WmUserCreateRequest request) {
        try (final ValidatorFactory factory = Validation.buildDefaultValidatorFactory()) {
            final Validator validator = factory.getValidator();
            final var violations = validator.validate(request);
            if (!violations.isEmpty()) {
                throw new ValidationException(
                    violations.stream().map(v -> "%s %s".formatted(v.getPropertyPath().toString(), v.getMessage()))
                              .collect(joining("\n")));
            }
        }
    }
}
