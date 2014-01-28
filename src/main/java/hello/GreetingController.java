package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/gretting")
	public @ResponseBody Gretting gretting(
			@RequestParam(value="name", required=false, defaultValue="World") String name
			){
		return new Gretting(counter.incrementAndGet(), String.format(template, name)); 
	}
}

