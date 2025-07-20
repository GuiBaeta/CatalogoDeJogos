package br.com.gbaeta.catalogojogos.service;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class SteamApiService {
	
	private final RestTemplate restTemplate = new RestTemplate();

	public Optional<BigDecimal> buscarPrecoDoJogo(Long appId) {
		String url = "https://store.steampowered.com/api/appdetails?appids=" + appId;

		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

		if (response.getStatusCode().is2xxSuccessful()) {
			try {
				ObjectMapper mapper = new ObjectMapper();
				JsonNode root = mapper.readTree(response.getBody());
				JsonNode data = root.path(String.valueOf(appId)).path("data");

				if (data.has("price_overview")) {
					JsonNode price = data.get("price_overview");
					BigDecimal finalPrice = new BigDecimal(price.get("final").asInt()).divide(BigDecimal.valueOf(100));
					return Optional.of(finalPrice);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return Optional.empty();
	}
}
