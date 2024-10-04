package com.eazybytes;

import org.springframework.http.*;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

public class HttpClientApplicationTest {

    public static void main(String[] args) {
        sendTokenRequest();
    }


    public static void sendTokenRequest() {
        String url = "http://localhost:8180/realms/eazybankdev/protocol/openid-connect/token";

        WebClient webClient = WebClient.create();
        String responseBody = webClient.post()
                .uri(url)
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .body(BodyInserters.fromFormData("client_id", "eazybankapi")
                        .with("client_secret", "6MRpLPSCca0GgZffmRICEc1JiNtJz03j")
                        .with("scope", "openid email profile address")
                        .with("grant_type", "client_credentials"))
                .retrieve()
                .bodyToMono(String.class)
                .block();

        System.out.println("Resposta: " + responseBody);
    }
}
