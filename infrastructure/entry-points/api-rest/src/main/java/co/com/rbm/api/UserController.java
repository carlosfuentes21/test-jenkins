package co.com.rbm.api;

import co.com.rbm.api.dto.UserDto;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@NoArgsConstructor
public class UserController {

    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public Mono<UserDto> getUsers() {
        UserDto userDto = UserDto.builder()
                .name("Pedro")
                .lastname("Perez")
                .document("10909991122")
                .phone("3201112233")
                .build();

        log.info("GET /users is used");
        return Mono.just(userDto);
    }
}


