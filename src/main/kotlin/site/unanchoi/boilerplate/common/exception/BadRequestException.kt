package site.unanchoi.boilerplate.common.exception

import org.springframework.http.HttpStatus

class BadRequestException(
    private val exception: BaseException
) : BaseException(exception.status, false, exception.message, HttpStatus.BAD_REQUEST) {
}