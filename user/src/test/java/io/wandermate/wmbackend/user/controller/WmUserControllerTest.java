package io.wandermate.wmbackend.user.controller;

import static org.mockito.Mockito.when;

import io.wandermate.wmbackend.user.model.WmUserGet;
import io.wandermate.wmbackend.user.service.WmUserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class WmUserControllerTest {

    @Mock
    private WmUserService wmUserService;

    @InjectMocks
    private WmUserController wmUserController;

//    @Test
//    void getWmUsers() {
//        // Given
//        WmUserGet wmUser1 = WmUserGet.builder()
//                                     .id(1)
//                                     .name("Test")
//                                     .build();
//        WmUserGet wmUser2 = WmUserGet.builder()
//                                     .id(2)
//                                     .name("Test2")
//                                     .email("someemail@gmail.com")
//                                     .build();
//        when(wmUserService.getWmUsers()).thenReturn(List.of(wmUser1, wmUser2));
//
//        // When
//        var response = wmUserController.getWmUsers();
//
//    }
}