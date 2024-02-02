package io.wandermate.wmbackend.user.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WmUserCreateResponse {
    @JsonProperty("message")
    String message;

    @JsonProperty("wmUser")
    WmUserGet wmUser;
}
