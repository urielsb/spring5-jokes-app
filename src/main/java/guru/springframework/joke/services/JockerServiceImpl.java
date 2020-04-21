package guru.springframework.joke.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JockerServiceImpl implements JockerServices {

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public JockerServiceImpl() {
		super();
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJocke() {
		return this.chuckNorrisQuotes.getRandomQuote();
	}

}
