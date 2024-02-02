package io.wandermate.wmbackend.user.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class WmUserCreateRequest {

    @NotBlank
    String email;

    String name;
}
