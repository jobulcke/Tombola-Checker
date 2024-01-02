package be.jobulcke.tombolachecker.infra.ticket.converters

import be.jobulcke.tombolachecker.domain.ticket.entities.Ticket
import be.jobulcke.tombolachecker.infra.ticket.entities.TicketEntity

class TicketConverter {
    fun fromTicket(ticket: Ticket) = TicketEntity(ticket.number)

    fun toTicket(ticketEntity: TicketEntity) = Ticket(ticketEntity.number)
}