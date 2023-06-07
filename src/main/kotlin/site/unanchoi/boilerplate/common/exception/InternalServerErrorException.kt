package site.unanchoi.boilerplate.common.exception

import org.springframework.http.HttpStatus

class InternalServerErrorException(
    private val exception: BaseException
) : BaseException(exception.status, false, exception.message, HttpStatus.INTERNAL_SERVER_ERROR) {
}