package be.jobulcke.tombolachecker.presentation.ticket.controllers

import be.jobulcke.tombolachecker.domain.ticket.entities.Ticket
import be.jobulcke.tombolachecker.domain.ticket.services.TicketService
import be.jobulcke.tombolachecker.presentation.ticket.valueobjects.TicketRangeDto
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/tickets")
class TicketsController(private val ticketService: TicketService) {

    @GetMapping
    fun getTickets() = ticketService.findAllTickets()

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun postTicket(@RequestBody ticket: Ticket) = ticketService.createTicket(ticket)

    @PostMapping("/range")
    @ResponseStatus(HttpStatus.CREATED)
    fun postTicketRange(@RequestBody ticketRange: TicketRangeDto) =
        ticketService.createTicketsFromRange(ticketRange.start..ticketRange.endInclusive)

}