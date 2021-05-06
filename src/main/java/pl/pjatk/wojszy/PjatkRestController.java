package pl.pjatk.wojszy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class PjatkRestController {

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> createNewCar(){
        return ResponseEntity.ok(new Car());
    }

    @GetMapping("/hello/{value}")
    public ResponseEntity<String> getSomeString(@PathVariable String value) {
        return ResponseEntity.ok(value);
    }

    @GetMapping("/hello/abc")
    public ResponseEntity<String> getRequestParam(@RequestParam String someValue){
        return ResponseEntity.ok(someValue);
    }

}
