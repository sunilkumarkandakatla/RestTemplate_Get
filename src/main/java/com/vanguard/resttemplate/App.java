package com.vanguard.resttemplate;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		String address = "https://www.google.co.in";
		try {
			RestTemplate template = new RestTemplate();

			HttpHeaders headers = new HttpHeaders();
//			headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			
			HttpEntity<String> request = new HttpEntity<String>(headers);
			HttpEntity<String> response = template.exchange(address, HttpMethod.GET, request, String.class);
			System.out.println(response.getBody());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
//			Uncomment below lines add your proxy settings and try
//			System.setProperty("https.proxyHost", "https://proxy.memorynotfound.com");
//			System.setProperty("https.proxyPort", "443");
			
			RestTemplate template = new RestTemplate();

			HttpHeaders headers = new HttpHeaders();
//			headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			
			HttpEntity<String> request = new HttpEntity<String>(headers);
			HttpEntity<String> response = template.exchange(address, HttpMethod.GET, request, String.class);
			System.out.println(response.getBody());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
