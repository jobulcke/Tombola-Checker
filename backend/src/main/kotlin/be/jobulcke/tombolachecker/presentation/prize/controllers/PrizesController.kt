package be.jobulcke.tombolachecker.presentation.prize.controllers

import be.jobulcke.tombolachecker.domain.prize.services.PrizeService
import be.jobulcke.tombolachecker.domain.prize.entities.Prize
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/prizes")
class PrizesController(val prizeService: PrizeService) {
    @GetMapping
    fun getPrizes() = prizeService.getAllPrizes()

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    fun postPrize(@RequestBody prize: Prize) = prizeService.createPrize(prize)

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    fun deletePrize(@PathVariable id: String) = prizeService.deletePrizeById(id)
}