package be.jobulcke.tombolachecker.infra.prize.converters

import be.jobulcke.tombolachecker.domain.prize.entities.Prize
import be.jobulcke.tombolachecker.infra.prize.entities.PrizeEntity

class PrizeConverter {
    fun fromPrize(prize: Prize) =
        PrizeEntity(prize.description, prize.ticketNumber, prize.firstSpareNumber, prize.secondSpareNumber, prize.id)

    fun toPrize(prizeEntity: PrizeEntity) = Prize(
        prizeEntity.description,
        prizeEntity.id,
        prizeEntity.ticketNumber,
        prizeEntity.firstSpareNumber,
        prizeEntity.secondSpareNumber
    )
}