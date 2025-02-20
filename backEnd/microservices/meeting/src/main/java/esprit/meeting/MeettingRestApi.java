package esprit.meeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mic4/meetings")
public class MeettingRestApi {

    @GetMapping
    public String hello() {
        return "Hello World";
    }
}
