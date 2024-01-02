package be.jobulcke.tombolachecker.infra.ticket.repositories

import be.jobulcke.tombolachecker.infra.ticket.entities.TicketEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TicketEntityRepository: JpaRepository<TicketEntity, Int>