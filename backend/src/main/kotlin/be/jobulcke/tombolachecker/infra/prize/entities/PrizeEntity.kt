package be.jobulcke.tombolachecker.infra.prize.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id
import org.hibernate.annotations.UuidGenerator

@Entity(name = "prizes")
class PrizeEntity(
    val description: String,
    val ticketNumber: Int?,
    val firstSpareNumber: Int?,
    val secondSpareNumber: Int?,
    @Id
    @UuidGenerator
    val id: String?
)