package com.gwi.springdoc.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfiguration {

    @Bean
    public OpenAPI springDocOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Spring Doc Example API")
                        .description("Example application to test out spring-doc")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org"))
                ).externalDocs(new ExternalDocumentation()
                        .description("GitHub link")
                        .url("https://github.com/GertWittouck/spring-doc-example")
                );
    }
}
