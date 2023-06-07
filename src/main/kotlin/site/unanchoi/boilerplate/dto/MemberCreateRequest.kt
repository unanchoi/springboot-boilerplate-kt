package site.unanchoi.boilerplate.dto

import site.unanchoi.boilerplate.entity.Member

data class MemberCreateRequest(val name: String) {
    companion object {
        fun from(request: MemberCreateRequest): Member {
            return Member(name = request.name)
        }
    }
}