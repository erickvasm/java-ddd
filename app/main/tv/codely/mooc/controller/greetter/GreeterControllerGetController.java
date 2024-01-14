package tv.codely.mooc.controller.greetter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public final class GreeterControllerGetController {

    @GetMapping("/greeter")
    public HashMap<String , String> greeter(String name) {
        HashMap<String, String> status = new HashMap<>();
        status.put("message", "Hello " + name);
        return status;
    }

}
