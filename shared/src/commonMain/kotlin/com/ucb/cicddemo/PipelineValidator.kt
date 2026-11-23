package com.ucb.cicddemo

class PipelineValidator {

    fun buildAppBanner(projectTitle: String, environment: String): String {
        val cleanTitle = projectTitle.trim()
        val cleanEnv = environment.trim().uppercase()
        return "$cleanTitle | Entorno: $cleanEnv"
    }

    fun isValidSemanticVersion(version: String): Boolean {
        val regex = Regex("^\\d+\\.\\d+\\.\\d+$")
        return regex.matches(version.trim())
    }

    fun calculatePassPercentage(passedTests: Int, totalTests: Int): Int {
        if (totalTests <= 0 || passedTests < 0) return 0
        if (passedTests >= totalTests) return 100
        return (passedTests * 100) / totalTests
    }
}