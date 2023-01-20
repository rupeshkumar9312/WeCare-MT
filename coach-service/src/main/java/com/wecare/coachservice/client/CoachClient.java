package com.wecare.coachservice.client;

import com.wecare.coachservice.dto.CoachDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@FeignClient(name = "coach-service")
public interface CoachClient {

    @PostMapping("/api/coaches")
    CoachDTO create(@RequestBody @Valid CoachDTO coach);

    @GetMapping("/api/coaches")
    public String get();

    @GetMapping("/api/coaches/{coachId}")
    public CoachDTO getCoach(@PathVariable String coachId);

}