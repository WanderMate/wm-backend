package io.wandermate.wmbackend.user.service;

import io.wandermate.wmbackend.user.entity.WmUser;
import io.wandermate.wmbackend.user.model.WmUserCreateRequest;
import io.wandermate.wmbackend.user.model.WmUserCreateResponse;
import io.wandermate.wmbackend.user.model.WmUserGet;
import io.wandermate.wmbackend.user.repository.WmUserDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class WmUserService {

    private final WmUserDAO wmUserDAO;

    private final WmUserValidatorService wmUserValidatorService;

    public List <WmUserGet> getWmUsers() {
        List<WmUser> wmUsers = wmUserDAO.findAll();
        return wmUsers.stream().map(user -> WmUserGet.builder()
                    .id(user.getWmUserId())
                    .email(user.getEmail())
                    .name(user.getName())
                    .build())
          .collect(Collectors.toList());
    }

    public WmUserCreateResponse createWmUser(WmUserCreateRequest wmUserCreateRequest) {
        wmUserValidatorService.validateWmUserCreateRequest(wmUserCreateRequest);
        WmUser wmUser = WmUser.builder()
                        .email(wmUserCreateRequest.getEmail())
                        .name(wmUserCreateRequest.getName()).build();
        wmUserDAO.save(wmUser);
        return WmUserCreateResponse.builder()
            .message("User created successfully")
            .wmUser(WmUserGet.builder()
                        .id(wmUser.getWmUserId())
                        .email(wmUser.getEmail())
                        .name(wmUser.getName()).build())
            .build();
    }
}
