package com.chuckerteam.chucker.api

import io.grpc.Metadata
import io.grpc.Status

/**
 * Обработка ошибки исходя из переменных Status и Metadata
 * Необходимо из-за того, что модель ошибки индивидуальна для конкретного API
 */
public interface OnErrorMapper {

    public fun mapErrorMessageToString(status: Status, metadata: Metadata): String

}