package ma.fahd.jokes.service;

import lombok.RequiredArgsConstructor;
import ma.fahd.jokes.dto.RapidApiDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class RapidApiConsumerService implements ConsumerService<RapidApiDTO>{

    private final WebClient webClient;


    @Override
    public RapidApiDTO consume() {
        return webClient.get().retrieve().bodyToMono(RapidApiDTO.class).block();
    }
}
