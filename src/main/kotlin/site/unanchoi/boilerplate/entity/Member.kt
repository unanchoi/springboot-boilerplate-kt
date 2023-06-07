package site.unanchoi.boilerplate.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Member(
    @Id @GeneratedValue
    val id: Long? = null,
    val name: String
) {
}