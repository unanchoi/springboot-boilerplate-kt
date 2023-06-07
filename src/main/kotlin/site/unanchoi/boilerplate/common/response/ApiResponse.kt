package site.unanchoi.boilerplate.common.response

import site.unanchoi.boilerplate.common.exception.BaseException

class ApiResponse<T> (
    val status: Int,
    val success: Boolean,
    val message: String,
    val data: T?
) {
    constructor(exception: BaseException, data: T?) : this(exception.status, exception.success, exception.message, data)
}