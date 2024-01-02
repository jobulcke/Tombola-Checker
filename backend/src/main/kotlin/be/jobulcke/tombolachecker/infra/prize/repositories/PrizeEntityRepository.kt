package be.jobulcke.tombolachecker.infra.prize.repositories

import be.jobulcke.tombolachecker.infra.prize.entities.PrizeEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PrizeEntityRepository: JpaRepository<PrizeEntity, String>