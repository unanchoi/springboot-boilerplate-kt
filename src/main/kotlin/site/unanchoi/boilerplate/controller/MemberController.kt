package site.unanchoi.boilerplate.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import site.unanchoi.boilerplate.dto.MemberCreateRequest
import site.unanchoi.boilerplate.dto.MemberGetResponse
import site.unanchoi.boilerplate.service.MemberService

@ApiController
class MemberController(private val memberService: MemberService) {

    @GetMapping("/members/{memberId}")
    fun getMember(@PathVariable memberId: Long) : ResponseEntity<MemberGetResponse> {
        return ResponseEntity.ok(memberService.getMember(memberId))
    }

    @PostMapping("/members")
    fun createMember(request: MemberCreateRequest) : ResponseEntity<String> {
        memberService.createMember(request)
        return ResponseEntity.ok("OK")
    }

    @DeleteMapping("/members/{memberId}")
    fun deleteMember(@PathVariable memberId: Long) : ResponseEntity<String> {
        memberService.deleteMember(memberId)
        return ResponseEntity.ok("OK")
    }

}