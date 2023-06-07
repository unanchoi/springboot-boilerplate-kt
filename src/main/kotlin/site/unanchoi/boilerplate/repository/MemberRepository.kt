package site.unanchoi.boilerplate.repository

import org.springframework.data.jpa.repository.JpaRepository
import site.unanchoi.boilerplate.entity.Member

interface MemberRepository : JpaRepository<Member, Long> {
}