package co.grandcircus.DonutAPI;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.DonutAPI.entity.Details;
import co.grandcircus.DonutAPI.entity.DonutsResponse;
import co.grandcircus.DonutAPI.entity.Results;

//<- identify this as an autowirable Spring bean
@Component
public class ApiService {

	private RestTemplate restTemplate = new RestTemplate();

	// This is an instance initialization block. It runs when a new instance of the
	// class is created--
	// right before the constructor.
	{
		// This configures the restTemplateWithUserAgent to include a User-Agent header
		// with every HTTP
		// request. Some of the APIs in this demo have a bug where User-Agent is
		// required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	public DonutsResponse getDonuts() {

		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
		
		return restTemplate.getForObject(url, DonutsResponse.class);
	}

	public Details getById(Long id) {
		
		String url = "https://grandcircusco.github.io/demo-apis/donuts/"+id+".json";
		return restTemplate.getForObject(url, Details.class);


	}

}