package co.com.rbm.api.config;

import co.com.rbm.api.JobController;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureBefore({ValidationAutoConfiguration.class})
@ComponentScan(basePackageClasses = {JobController.class})
public class RestAutoConfiguration {

}
