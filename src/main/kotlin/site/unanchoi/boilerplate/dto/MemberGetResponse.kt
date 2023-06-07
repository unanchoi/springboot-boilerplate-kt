package site.unanchoi.boilerplate.dto

import site.unanchoi.boilerplate.entity.Member

data class MemberGetResponse(
    val id: Long?,
    val name: String
) {
    companion object {
        fun of(member: Member): MemberGetResponse {
            return MemberGetResponse(member.id, member.name)
        }
    }
}
