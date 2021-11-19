package com.github.dimitark.k2dbc

import mu.KotlinLogging

/**
 * Factory function for the K2DBC client
 */
fun K2DBC(connectionString: String, failOnError: Boolean = false): K2DBC? {
    val log = KotlinLogging.logger {}

    val client = try {
        K2DBCImpl(connectionString)
    } catch (t: Throwable) {
        log.error(t) { "Couldn't init the K2DBC client!" }
        null
    }

    if (client == null && failOnError) {
        throw RuntimeException("Couldn't init the K2DBC client!")
    }

    return client
}
