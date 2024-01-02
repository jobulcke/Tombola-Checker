package be.jobulcke.tombolachecker.infra.ticket.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity(name = "tickets")
class TicketEntity(@Id val number: Int)