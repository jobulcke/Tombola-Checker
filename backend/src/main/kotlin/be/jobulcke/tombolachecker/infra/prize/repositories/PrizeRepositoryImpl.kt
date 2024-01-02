package be.jobulcke.tombolachecker.infra.prize.repositories

import be.jobulcke.tombolachecker.domain.prize.entities.Prize
import be.jobulcke.tombolachecker.domain.prize.repositories.PrizeRepository
import be.jobulcke.tombolachecker.infra.prize.converters.PrizeConverter
import org.springframework.stereotype.Repository

@Repository
class PrizeRepositoryImpl(private val prizeEntityRepository: PrizeEntityRepository) : PrizeRepository {
    private val prizeConverter = PrizeConverter()
    override fun findAll() = prizeEntityRepository.findAll().map(prizeConverter::toPrize)

    override fun save(prize: Prize) {
        prizeEntityRepository.save(prizeConverter.fromPrize(prize))
    }

    override fun deleteById(id: String) = prizeEntityRepository.deleteById(id)

}