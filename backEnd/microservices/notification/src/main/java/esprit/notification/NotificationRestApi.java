package esprit.notification;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mic5/notification")
public class NotificationRestApi {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
