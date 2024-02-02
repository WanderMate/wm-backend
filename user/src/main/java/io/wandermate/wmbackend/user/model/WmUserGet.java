package io.wandermate.wmbackend.user.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WmUserGet {

    @JsonProperty("wmUserId")
    @NotBlank
    Integer id;

    @JsonProperty("name")
    String name;

    @JsonProperty("email")
    @NotNull
    String email;
}
