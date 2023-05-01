package com.app.api.exceptions;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record ResponseException(LocalDateTime timestamp, String message, String details) {
}
