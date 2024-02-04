package io.wandermate.wmbackend.user.controller;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

import io.wandermate.wmbackend.user.model.WmUserCreateRequest;
import io.wandermate.wmbackend.user.model.WmUserCreateResponse;
import io.wandermate.wmbackend.user.model.WmUserGet;
import io.wandermate.wmbackend.user.service.WmUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/resources") // TODO: move this to application.yaml
@Slf4j
public class WmUserController {

    private final WmUserService wmUserService;

    // TODO: Add swagger documentation
    @GetMapping(value = "/wmusers", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<WmUserGet>> getWmUsers() {
        return ResponseEntity.ok(wmUserService.getWmUsers());
    }

    @PostMapping("/wmusers")
    public ResponseEntity<WmUserCreateResponse> createWmUser(@RequestBody WmUserCreateRequest wmUserCreateRequest) {
        log.info("Creating user with email: {}", wmUserCreateRequest.getEmail());
        return ResponseEntity.ok(wmUserService.createWmUser(wmUserCreateRequest));
    }
}
