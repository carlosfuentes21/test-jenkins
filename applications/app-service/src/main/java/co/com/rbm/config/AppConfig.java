package co.com.rbm.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * AppConfig configuration required in driven adapters
 */
@Slf4j
@Configuration
@ComponentScan("co.com.rbm")
public class AppConfig {

}
