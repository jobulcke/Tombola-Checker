package be.jobulcke.tombolachecker.application.prize.services

import be.jobulcke.tombolachecker.domain.prize.entities.Prize
import be.jobulcke.tombolachecker.domain.prize.repositories.PrizeRepository
import be.jobulcke.tombolachecker.domain.prize.services.PrizeService
import org.springframework.stereotype.Service

@Service
class PrizeServiceImpl(private val prizeRepo: PrizeRepository) : PrizeService {
    override fun getAllPrizes() = prizeRepo.findAll()
    override fun createPrize(prize: Prize) = prizeRepo.save(prize)
    override fun deletePrizeById(id: String) = prizeRepo.deleteById(id)
}