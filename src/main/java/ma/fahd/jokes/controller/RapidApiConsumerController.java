package ma.fahd.jokes.controller;

import lombok.RequiredArgsConstructor;
import ma.fahd.jokes.dto.RapidApiDTO;
import ma.fahd.jokes.service.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jokes")
@RequiredArgsConstructor
public class RapidApiConsumerController {

    private final ConsumerService<RapidApiDTO> rapidApiConsumerService;

    @GetMapping
    public RapidApiDTO getJoke() {
        return rapidApiConsumerService.consume();
    }
}
