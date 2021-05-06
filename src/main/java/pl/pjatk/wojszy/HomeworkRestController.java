package pl.pjatk.wojszy;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkRestController {

    @GetMapping("/pierwszy/{value}")
    public ResponseEntity<String> getSomeString(@PathVariable String value){
        return ResponseEntity.ok(value);
    }

    @GetMapping("/drugi/abc")
    public ResponseEntity<String> getRequestParam(@RequestParam String someValue){
        return ResponseEntity.ok(someValue);
    }

    @PutMapping("/put/path/{value}")
    public ResponseEntity<String> putValue(@PathVariable String value){
        return ResponseEntity.ok(value);
    }

    @PostMapping("/post/car")
    public ResponseEntity<Car> postBody(@RequestBody Car car){
        return ResponseEntity.ok(car);
    }

    @PutMapping("/put/car")
    public ResponseEntity<Car> putBody(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }

    @DeleteMapping("/delete/{value}")
    public ResponseEntity<String> deleteValue(@PathVariable String value){
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
