package com.example.slackalertmanager.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor

public enum ErrorCode {
    UNEXPECTED_ERROR("unexpected_error");
    final String message;
}
