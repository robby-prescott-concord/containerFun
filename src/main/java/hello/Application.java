package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker Carrots";
    }

    @RequestMapping(value = "/{number}", method = GET)
    public String get(@PathVariable Long number) {
        return "The number squared is: " + (number * number) + System.getProperty("line.separator");
    }

    @RequestMapping(value = "/{word}", method = GET)
    public String getWord(@PathVariable String word) {
        return "Stop being so " + word.toLowerCase() + ". \n";
    }

    @RequestMapping(value = "/{a}/{b}", method = GET)
    public String get(@PathVariable Long a, Long b) {
        return "The hypotenuse is: " + Math.sqrt((a * a) + (b * b)) + System.getProperty("line.separator");
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

