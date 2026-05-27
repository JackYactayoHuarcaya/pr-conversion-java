package app.infrastructure.model;

import jakarta.ws.rs.QueryParam;

public record CelsiusQuery(@QueryParam("celsiusP") float celsiusP) {}
