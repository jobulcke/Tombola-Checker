package be.jobulcke.tombolachecker.domain.prize.services

import be.jobulcke.tombolachecker.domain.prize.entities.Prize

interface PrizeService {
    fun getAllPrizes(): List<Prize>
    fun createPrize(prize: Prize)
    fun deletePrizeById(id: String)
}