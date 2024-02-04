package io.wandermate.wmbackend.user.service;


import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.Mockito.when;

import io.wandermate.wmbackend.user.entity.WmUser;
import io.wandermate.wmbackend.user.model.WmUserGet;
import io.wandermate.wmbackend.user.repository.WmUserDAO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class WmUserServiceTest {

    @Mock
    private WmUserDAO wmUserDAO;

    @Mock
    private WmUserValidatorService wmUserValidatorService;

    @InjectMocks
    private WmUserService wmUserService;

    @Test
    void getWmUsers() {
        // Given
        WmUser wmUser1 = WmUser.builder()
            .name("test1").wmUserId(2).email("someemail@gmail.com").build();
        WmUser wmUser2 = WmUser.builder()
                               .wmUserId(3).email("someemail2@gmail.com").build();
        when(wmUserDAO.findAll()).thenReturn(List.of(wmUser1, wmUser2));

        // When
        List <WmUserGet> response = wmUserService.getWmUsers();

        // Then
        assertThat(response).hasSize(2);
        assertThat(response.get(0).getName()).isEqualTo("test1");
        assertThat(response.get(0).getEmail()).isEqualTo("someemail@gmail.com");
        assertThat(response.get(1).getName()).isNull();
        assertThat(response.get(1).getEmail()).isEqualTo("someemail2@gmail.com");
    }

}