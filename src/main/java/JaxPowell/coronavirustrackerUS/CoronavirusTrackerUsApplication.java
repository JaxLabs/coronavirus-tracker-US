package JaxPowell.coronavirustrackerUS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronavirusTrackerUsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronavirusTrackerUsApplication.class, args);
	}

}
