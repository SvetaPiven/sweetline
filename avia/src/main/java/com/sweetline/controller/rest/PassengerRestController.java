package com.sweetline.controller.rest;

import com.sweetline.model.entity.Passenger;
import com.sweetline.repository.PassengerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest/passengers")
@RequiredArgsConstructor
public class PassengerRestController {
    private final PassengerRepository passengerRepository;

    @GetMapping()
    public ResponseEntity<List<Passenger>> getAllPassengers() {
        return new ResponseEntity<>(passengerRepository.findAll(), HttpStatus.OK);
    }

//    @GetMapping
//    public List<Passenger> getAllPassengers() {
//        return passengerServiceImpl.findAll();
//    }

//    @PostMapping
//    public ResponseEntity<Passenger> createPassenger(@RequestBody PassengerCreateRequest request) {
//
//        Passenger build = Passenger.builder()
//                .fullName(request.getFullName())
//                .personalId(request.getPersonalId())
//                .build();
//
//        Passenger createdPassenger = passengerService.create(build);
//
//        return new ResponseEntity<>(createdPassenger, HttpStatus.CREATED);
//    }
//
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Passenger>> findPassById(@PathVariable("id") Long id) {

        return new ResponseEntity<>(Optional.of(passengerRepository.findById(id).get()), HttpStatus.OK);
    }
//
//    @PutMapping
//    public ResponseEntity<Passenger> updatePassenger(@RequestBody PassengerCreateRequest request) {
//
//        Passenger passenger = passengerService.update(Passenger.builder()
//                .idPass(request.getIdPass())
//                .fullName(request.getFullName())
//                .personalId(request.getPersonalId())
//                .build());
//
//        return new ResponseEntity<>(passenger, HttpStatus.OK);
//    }
//
//    @PatchMapping
//    public ResponseEntity<Passenger> partialUpdatePassenger(@RequestBody PassengerCreateRequest request) {
//
//        Passenger passenger = passengerService.update(Passenger.builder()
//                .idPass(request.getIdPass())
//                .fullName(request.getFullName())
//                .personalId(request.getPersonalId())
//                .build());
//
//        return new ResponseEntity<>(passenger, HttpStatus.OK);
//    }
//
//    @DeleteMapping
//    public ResponseEntity<Optional<Passenger>> deletePassenger(@RequestBody PassengerCreateRequest request) {
//
//        Optional<Passenger> passenger = passengerService.deleteById(request.getIdPass());
//
//        return new ResponseEntity<>(passenger, HttpStatus.OK);
//    }
//
//    @GetMapping("/search")
//    public ResponseEntity<List<Passenger>> searchPassenger(@RequestParam(value = "query") String query) {
//
//        List<Passenger> passengers = passengerRepositoryJdbcTemplate.searchPassSurname(query);
//
//        return new ResponseEntity<>(passengers, HttpStatus.OK);
//    }
//
//    @GetMapping("/search/woman")
//    public ResponseEntity<List<Passenger>> searchAllWoman() {
//
//        List<Passenger> passengers = passengerRepositoryJdbcTemplate.findAllWoman();
//
//        return new ResponseEntity<>(passengers, HttpStatus.OK);
//    }
//
//    @GetMapping("/search/belarus")
//    public ResponseEntity<List<Passenger>> searchPassCitizenBelarus() {
//
//        List<Passenger> passengers = passengerRepositoryJdbcTemplate.searchPassengerCitizenBelarus();
//
//        return new ResponseEntity<>(passengers, HttpStatus.OK);
//    }
}