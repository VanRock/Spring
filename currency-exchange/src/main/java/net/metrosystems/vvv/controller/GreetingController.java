package net.metrosystems.vvv.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.metrosystems.vvv.model.Greeting;

@RestController
public class GreetingController {
	private static final String template = "hello %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping(name="/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "lume") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
