package be.jobulcke.tombolachecker.domain.ticket.repositories

import be.jobulcke.tombolachecker.domain.ticket.entities.Ticket

interface TicketRepository {
    fun findAll(): List<Ticket>
    fun insert(ticket: Ticket)
    fun insertAll(tickets: List<Ticket>)
    fun deleteById(number: Int)
}