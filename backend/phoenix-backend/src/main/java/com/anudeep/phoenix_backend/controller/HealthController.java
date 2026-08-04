package com.anudeep.phoenix_backend.controller;

import com.anudeep.phoenix_backend.common.ApiResponse;
import com.anudeep.phoenix_backend.service.HealthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

    private final HealthService healthService;

    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping("api/v1/health")
    public ApiResponse<Map<String, String>> healthCheck() {
        return new ApiResponse<>(true, 
            "Health check successful", 
            healthService.getHealthStatus());
    }

}
