package site.unanchoi.boilerplate.service

import org.springframework.stereotype.Service
import site.unanchoi.boilerplate.dto.MemberCreateRequest
import site.unanchoi.boilerplate.dto.MemberGetResponse
import site.unanchoi.boilerplate.entity.Member
import site.unanchoi.boilerplate.repository.MemberRepository

@Service
class MemberService(private val memberRepository: MemberRepository) {

    fun getMember(memberId: Long): MemberGetResponse {
        val member: Member = memberRepository.findById(memberId).orElseThrow { throw Exception("Member not found") };
        return MemberGetResponse.of(member)
    }

    fun createMember(requestDto: MemberCreateRequest) {
        memberRepository.save(Member(name = requestDto.name))
    }

    fun deleteMember(memberId: Long) {
        memberRepository.deleteById(memberId)
    }
}