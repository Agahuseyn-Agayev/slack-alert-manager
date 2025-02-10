package com.example.slackalertmanager.error;

import static com.example.slackalertmanager.error.ErrorCode.UNEXPECTED_ERROR;

import com.example.slackalertmanager.service.SlackNotificationService;
import io.micrometer.core.instrument.Counter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    private final SlackNotificationService slackNotificationService;
    private final Counter errorCounter;

    public GlobalExceptionHandler(Counter errorCounter, SlackNotificationService notificationService) {
        this.errorCounter = errorCounter;
        this.slackNotificationService = notificationService;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleException(Exception exception) {
        log.error("ActionLog.handle.error: ", exception);
        errorCounter.increment();
        return new ErrorResponse(UNEXPECTED_ERROR.getMessage());
    }
}

