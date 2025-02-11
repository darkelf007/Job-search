package ru.practicum.android.diploma.common.data.network.response

import ru.practicum.android.diploma.common.data.dto.Response
import ru.practicum.android.diploma.common.data.dto.VacancyItemDto

data class VacancyDetailResponse(
    val vacancy: VacancyItemDto
) : Response()
