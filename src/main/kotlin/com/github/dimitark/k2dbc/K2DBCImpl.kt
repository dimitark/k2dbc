package com.github.dimitark.k2dbc

import io.r2dbc.spi.ConnectionFactories
import mu.KotlinLogging

internal class K2DBCImpl(connectionString: String): K2DBC {
    private val log = KotlinLogging.logger {}

    private val connectionFactory = ConnectionFactories.get(connectionString)
}
