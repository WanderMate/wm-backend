package io.wandermate.backend.wmbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WmBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WmBackendApplication.class, args);
	}

}
// TODO: 0. Create Jackson ObjectMapper bean
// TODO: 1. Create model class for UserCreateRequest
// TODO: 2. Create model class for UserCreateResponse
// TODO: 3. Create model class for GetUserResponse
// TODO: 4. Create model class for UpdateUserRequest
// TODO: Add request validator
// TODO: Add exception handler
// TODO: 5. Configure Swagger
// TODO: 6. Write basic tests
// TODO: 7. Create docker image of the application
// TODO - Optional: 8. Add integration tests using TestContainers

