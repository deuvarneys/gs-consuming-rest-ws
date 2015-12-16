package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class QuoteController {

	@RequestMapping(value="/quote", method = RequestMethod.GET)
	public Quote getQuote(){
		 RestTemplate restTemplate = new RestTemplate();
		 Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		 return quote;
		 //return "Sup";
	}
	
}
