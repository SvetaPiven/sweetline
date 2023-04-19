package com.sweetline.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.Collections;
import java.util.Set;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {
        "tickets", "flightStatus", "departure", "arrival", "planeTypes"
})
@ToString(exclude = {
        "tickets", "flightStatus", "departure", "arrival", "planeTypes"
})
@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_flight")
    private Long idFlight;

    @Column(name = "flight_number")
    private String flightNumber;

    @Column(name = "id_plane_type")
    private Long idPlaneType;

    @Column(name = "id_departure_airport", insertable=false, updatable=false)
    private Long idDepartureAirport;

    @Column(name = "id_arrival_airport", insertable=false, updatable=false)
    private Long idArrivalAirport;

    @Column(name = "id_flight_status")
    private Long idFlightStatus;

    @Column(name = "departure_time")
    private Timestamp departureTime;

    @Column(name = "arrival_time")
    private Timestamp arrivalTime;

    @Column
    private Timestamp created;

    @Column
    private Timestamp changed;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @OneToMany(mappedBy = "flights", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private Set<Ticket> tickets = Collections.emptySet();

    @ManyToOne
    @JoinColumn(name = "id_flight_status", insertable = false, updatable = false)
    @JsonBackReference
    private FlightStatus flightStatus;

    @ManyToOne
    @JoinColumn(name = "id_departure_airport", referencedColumnName = "id_airport")
    @JsonBackReference
    private Airport departure;

    @ManyToOne
    @JoinColumn(name = "id_arrival_airport", referencedColumnName = "id_airport")
    @JsonBackReference
    private Airport arrival;

    @ManyToOne
    @JoinColumn(name = "id_plane_type", insertable = false, updatable = false)
    @JsonBackReference
    private PlaneType planeTypes;
}
