package in.akhilesh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DemoRestController {
	@GetMapping("/demo")
	public String getDemoMsg() {
		
		log.debug("this is debug msg");

		String msg = "This is demo method msg";

		log.info("this is info msg");

		log.warn("this is warn msg");

		log.error("this is error msg");

		return msg;
		
	}

}
