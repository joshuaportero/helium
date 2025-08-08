package dev.portero.helium.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/v1/catalog", produces = MediaType.APPLICATION_JSON_VALUE)
public class CatalogController {

    @GetMapping
    public Map<String, Object> ping() {
        Map<String, Object> resp = new HashMap<>();
        resp.put("service", "client");
        resp.put("status", "ok");
        resp.put("timestamp", OffsetDateTime.now().toString());
        return resp;
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
