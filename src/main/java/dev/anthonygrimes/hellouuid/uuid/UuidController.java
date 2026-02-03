package dev.anthonygrimes.hellouuid.uuid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/uuid")
@RestController
public class UuidController {

    private static final Logger LOG = LoggerFactory.getLogger(UuidController.class);

    private static final UUID RANDOM_UUID = UUID.randomUUID();

    @GetMapping
    public ResponseEntity<UUID> retrieveUuid() {
        LOG.info("Received request to retrieve UUID.");

        return ResponseEntity.ok(RANDOM_UUID);
    }
}
