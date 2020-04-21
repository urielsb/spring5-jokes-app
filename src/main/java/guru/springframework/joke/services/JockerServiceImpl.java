package guru.springframework.joke.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JockerServiceImpl implements JockerServices {

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public JockerServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
		super();
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	@Override
	public String getJocke() {
		return this.chuckNorrisQuotes.getRandomQuote();
	}

}
