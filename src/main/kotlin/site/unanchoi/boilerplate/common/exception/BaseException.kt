package site.unanchoi.boilerplate.common.exception

import org.springframework.http.HttpStatus

open class BaseException (
    val status: Int,
    val success: Boolean,
    override val message: String,
    val httpStatus: HttpStatus
) : RuntimeException()