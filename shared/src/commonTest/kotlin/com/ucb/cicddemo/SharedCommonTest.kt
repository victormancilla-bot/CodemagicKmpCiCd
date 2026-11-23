package com.ucb.cicddemo

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SharedCommonTest {

    private val validator = PipelineValidator()

    @Test
    fun bannerFormatsTitleAndUppercaseEnvironment() {
        val result = validator.buildAppBanner("  UCB CI/CD  ", "release")
        assertEquals("UCB CI/CD | Entorno: RELEASE", result)
    }

    @Test
    fun validSemanticVersionReturnsTrue() {
        assertTrue(validator.isValidSemanticVersion("1.0.24"))
    }

    @Test
    fun invalidSemanticVersionReturnsFalse() {
        assertFalse(validator.isValidSemanticVersion("v1.0"))
        assertFalse(validator.isValidSemanticVersion("1.0"))
    }

    @Test
    fun passPercentageCalculatesCorrectly() {
        assertEquals(99, validator.calculatePassPercentage(4, 5))
    }

    @Test
    fun passPercentageHandlesZeroTotalSafely() {
        assertEquals(0, validator.calculatePassPercentage(3, 0))
    }
}