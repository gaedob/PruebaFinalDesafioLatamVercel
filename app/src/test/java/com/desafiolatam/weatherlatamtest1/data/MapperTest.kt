package com.desafiolatam.weatherlatamtest1.data

import junit.framework.TestCase.assertEquals
import org.junit.Test

class MapperTest {

    @Test
    fun `transform weatherDto to weatherEntity`() {
        // tipo DTO, usamos el mapper para transformar la clase a Entity
        val dtoToEntity = weatherDtoDummyData().toEntity()

        // tipo Entity
        val entity = weatherEntityDummyData()

        // Comparamos que sean del mismo tipo sin importar los datos contenidos en las data class
        // para esto usamos `canonicalName`
        assertEquals(dtoToEntity.javaClass.canonicalName, entity.javaClass.canonicalName)
    }

    @Test
    fun `transform weatherEntity to weatherDto`() {

        // tipo Entity
        val entity = weatherEntityDummyData()
        val dto = entityToDto(entity)

        // tipo DTO
        val dummyDto = weatherDtoDummyData()

        assertEquals(dto.javaClass.canonicalName, dummyDto.javaClass.canonicalName)
    }
}