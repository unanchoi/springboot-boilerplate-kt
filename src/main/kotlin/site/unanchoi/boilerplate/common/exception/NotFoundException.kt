package site.unanchoi.boilerplate.common.exception

import org.springframework.http.HttpStatus

class NotFoundException(
    private val exception: BaseException
) : BaseException(exception.status, false, exception.message, HttpStatus.NOT_FOUND) {}