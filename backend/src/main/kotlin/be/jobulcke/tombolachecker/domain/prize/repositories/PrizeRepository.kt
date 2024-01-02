package be.jobulcke.tombolachecker.domain.prize.repositories

import be.jobulcke.tombolachecker.domain.prize.entities.Prize

interface PrizeRepository {
    fun findAll(): List<Prize>
    fun save(prize: Prize)
    fun deleteById(id: String)
}