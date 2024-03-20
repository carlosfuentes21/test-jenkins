package co.com.rbm.api;

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
    public Mono<String> getUsers() {
        log.info("GET /users is used");
        return Mono.just("Example of body for de GET /users");
    }

}


