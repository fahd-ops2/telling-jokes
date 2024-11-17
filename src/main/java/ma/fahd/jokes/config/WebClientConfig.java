package ma.fahd.jokes.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${api.rapid-api.jokes-always.api-url}")
    private String url;

    @Value("${api.rapid-api.jokes-always.x-rapidapi-host}")
    private String host;

    @Value("${api.rapid-api.jokes-always.x-rapidapi-key}")
    private String key;

    @Bean
    public WebClient webClient(){
        return WebClient.builder()
                .baseUrl(url)
                .defaultHeader("x-rapidapi-host", host)
                .defaultHeader("x-rapidapi-key", key)
                .build();
    }
}
