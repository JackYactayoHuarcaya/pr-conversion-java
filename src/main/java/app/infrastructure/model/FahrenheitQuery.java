package app.infrastructure.model;

import jakarta.ws.rs.QueryParam;

public record FahrenheitQuery(@QueryParam("fahrenheitP") float fahrenheitP) {}
