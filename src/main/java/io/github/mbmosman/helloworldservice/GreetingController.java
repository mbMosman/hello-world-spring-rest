package io.github.mbmosman.helloworldservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  private static final String messageTemplate = "Hello, %s";
  private static final String DEFAULT_NAME = "World";
	private final AtomicLong counter = new AtomicLong();

  @GetMapping("/greeting")
  public Greeting greeting( 
      @RequestParam(value = "name", defaultValue = DEFAULT_NAME) 
      String name ){
    String message = String.format(messageTemplate, name);
    // This object will be converted automatically to JSON
    return new Greeting(counter.incrementAndGet(), message);
  }

}