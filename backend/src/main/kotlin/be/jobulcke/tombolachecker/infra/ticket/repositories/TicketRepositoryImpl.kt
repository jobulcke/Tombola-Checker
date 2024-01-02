package be.jobulcke.tombolachecker.infra.ticket.repositories

import be.jobulcke.tombolachecker.domain.ticket.entities.Ticket
import be.jobulcke.tombolachecker.domain.ticket.repositories.TicketRepository
import be.jobulcke.tombolachecker.infra.ticket.converters.TicketConverter
import org.springframework.stereotype.Repository

@Repository
class TicketRepositoryImpl(private val ticketEntityRepository: TicketEntityRepository) : TicketRepository {
    private val ticketConverter = TicketConverter()
    override fun findAll() = ticketEntityRepository.findAll().map(ticketConverter::toTicket)

    override fun insert(ticket: Ticket) {
        ticketEntityRepository.save(ticketConverter.fromTicket(ticket))
    }

    override fun insertAll(tickets: List<Ticket>) {
        tickets.map(ticketConverter::fromTicket).also { ticketEntityRepository.saveAll(it) }
    }

    override fun deleteById(number: Int) {
        ticketEntityRepository.deleteById(number)
    }
}