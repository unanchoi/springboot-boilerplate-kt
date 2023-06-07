package site.unanchoi.boilerplate.common.exception

import org.springframework.http.HttpStatus

class UnauthorizedException(
    private val exception: BaseException
) : BaseException(exception.status, false, exception.message, HttpStatus.UNAUTHORIZED)