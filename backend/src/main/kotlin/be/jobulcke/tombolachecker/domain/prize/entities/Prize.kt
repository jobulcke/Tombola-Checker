package be.jobulcke.tombolachecker.domain.prize.entities

class Prize(
    val description: String,
    val id: String? = null,
    val ticketNumber: Int? = null,
    val firstSpareNumber: Int?,
    val secondSpareNumber: Int?
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Prize

        return id == other.id
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }
}