package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }

    @RequestMapping(value = "/id")
    String getIdByValue(@RequestParam("id") int personId){
        System.out.println("ID squared is "+ (personId * personId));
        return "Get ID from query string of URL with value element";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

