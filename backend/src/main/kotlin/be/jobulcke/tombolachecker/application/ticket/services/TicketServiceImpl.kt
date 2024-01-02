package be.jobulcke.tombolachecker.application.ticket.services

import be.jobulcke.tombolachecker.domain.ticket.entities.Ticket
import be.jobulcke.tombolachecker.domain.ticket.repositories.TicketRepository
import be.jobulcke.tombolachecker.domain.ticket.services.TicketService
import org.springframework.stereotype.Service

@Service
class TicketServiceImpl(private val ticketRepo: TicketRepository) : TicketService {
    override fun findAllTickets() = ticketRepo.findAll()

    override fun createTicket(ticket: Ticket) = ticketRepo.insert(ticket)

    override fun createTicketsFromRange(ticketRange: IntRange) =
        ticketRange.map(::Ticket).let { ticketRepo.insertAll(it) }

    override fun deleteTicketByNumber(number: Int) = ticketRepo.deleteById(number)
}