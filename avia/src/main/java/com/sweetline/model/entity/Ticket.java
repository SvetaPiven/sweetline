package com.sweetline.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {
        "airlines", "ticketStatus", "ticketClass", "flights", "passengers"
})
@ToString(exclude = {
        "airlines", "ticketStatus", "ticketClass", "flights", "passengers"
})
@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ticket")
    private Long idTicket;

    @Column(name = "id_pass", insertable=false, updatable=false)
    private Long idPass;

    @Column(name = "id_ticket_status", insertable=false, updatable=false)
    private Long idTicketStatus;

    @Column(name = "id_ticket_class", insertable=false, updatable=false)
    private Long idTicketClass;

    @Column(name = "id_flight", insertable=false, updatable=false)
    private Long idFlight;

    @Column(name = "id_airline", insertable=false, updatable=false)
    private Long idAirline;

    @Column(name = "id_place")
    private String idPlace;

    @Column
    private BigDecimal price;

    @Column
    private Timestamp created;

    @Column
    private Timestamp changed;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @ManyToOne
    @JoinColumn(name = "id_airline")
    @JsonBackReference
    private Airline airlines;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ticket_status")
    @JsonBackReference
    private TicketStatus ticketStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ticket_class")
    @JsonBackReference
    private TicketClass ticketClass;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_flight")
    @JsonBackReference
    private Flight flights;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pass")
    @JsonBackReference
    private Passenger passengers;

}
