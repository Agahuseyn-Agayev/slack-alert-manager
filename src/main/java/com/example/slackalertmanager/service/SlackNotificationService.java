package com.example.slackalertmanager.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SlackNotificationService {

    @Value("${slack.webhook.url}")
    private String slackWebhookUrl;

    public void sendErrorNotification(String errorMessage) {
        String message = "{\"text\":\"Error occurred: " + errorMessage + "\"}";

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        HttpEntity<String> entity = new HttpEntity<>(message, headers);

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.exchange(slackWebhookUrl, HttpMethod.POST, entity, String.class);
    }
}
