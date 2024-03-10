package com.dpp.citizenService.controller;

import com.dpp.citizenService.entity.Citizen;
import com.dpp.citizenService.repository.CitizenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citizen")
@RequiredArgsConstructor
public class CitizenController {

    private final CitizenRepository citizenRepository;

    @GetMapping("/vaccinationId/{vaccinationId}")
    public ResponseEntity<List<Citizen>> getCitizen(@PathVariable Integer vaccinationId) {
        return ResponseEntity.status(HttpStatus.OK).body(citizenRepository.findByVaccinationId(vaccinationId));
    }
    @PostMapping
    public ResponseEntity<Citizen> createCitizen(@RequestBody Citizen citizen){
        Citizen savedCitizen =  citizenRepository.save(citizen);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCitizen);
    }
}
