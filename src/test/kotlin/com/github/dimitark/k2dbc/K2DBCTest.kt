package com.github.dimitark.k2dbc

import kotlin.test.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class K2DBCTest {

    @Test
    fun `Test failing creating the client for a non-existing driver`() {
        val connectionString = "r2dbcs:mysql://root:database-password-in-here@127.0.0.1:3306/r2dbc"

        val k2dbc = K2DBC(connectionString)
        assertNull(k2dbc)

        assertFailsWith<RuntimeException> {
            K2DBC(connectionString, failOnError = true)
        }
    }

    @Test
    fun `Test successfully creating the client`() {
        val k2dbc = K2DBC("r2dbc:h2:mem:///testdb")
        assertNotNull(k2dbc)
    }
}
