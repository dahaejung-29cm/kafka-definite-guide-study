package com.kafka.example.interfaces;


import com.kafka.example.infrastructure.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/post-migration")
public class KafkaProducerController {

    private final KafkaProducer kafkaProducer;
    @PostMapping("/produce")
    public ResponseEntity produce() {

        kafkaProducer.sendToKafka();

        return ResponseEntity.ok("OK");
    }
}
