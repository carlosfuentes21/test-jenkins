package co.com.rbm.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Redeban Micro Servicio Dashboard - Corresponsalía")
                        .description("Microservicio responsable de exponer los servicios relacionados con transacciones y cierres.")
                        .version("v1.0.0"));
    }

}
