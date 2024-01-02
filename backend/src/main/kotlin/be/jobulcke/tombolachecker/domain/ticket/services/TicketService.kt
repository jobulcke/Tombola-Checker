package be.jobulcke.tombolachecker.domain.ticket.services

import be.jobulcke.tombolachecker.domain.ticket.entities.Ticket

interface TicketService {
    fun findAllTickets(): List<Ticket>
    fun createTicket(ticket: Ticket)
    fun createTicketsFromRange(ticketRange: IntRange)
    fun deleteTicketByNumber(number: Int)
}