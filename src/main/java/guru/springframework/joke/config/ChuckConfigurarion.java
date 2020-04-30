package guru.springframework.joke.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class ChuckConfigurarion {

	@Bean
	public ChuckNorrisQuotes getChuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}
}
