package ru.miit.kisproject.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Приложение для работы с Базой Данных")
                                .version("2.0.1")
                                .contact(
                                        new Contact()
                                                .email("1027914@edu.rut-miit.ru")
                                                .url("")
                                                .name("Darya")
                                )
                );

    }

}
