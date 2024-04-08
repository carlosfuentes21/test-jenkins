package co.com.rbm.api;

import co.com.rbm.api.dto.JobDto;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@NoArgsConstructor
public class JobController {

    @GetMapping("/jobs")
    @ResponseStatus(HttpStatus.OK)
    public Flux<JobDto> getJobs() {
        log.info("GET /jobs is used");
        return Flux.just(JobDto.builder()
                            .name("Developer")
                            .kind("Engineering")
                            .salary(5000000)
                            .education("Degree")
                            .build(),
                         JobDto.builder()
                            .name("waiter")
                            .kind("attention")
                            .salary(1500000)
                            .education("None")
                            .build()
                );
    }
}


