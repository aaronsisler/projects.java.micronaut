package com.ebsolutions

import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import jakarta.inject.Inject

@MicronautTest
class PaperTrailSpec extends Specification {

    @Inject
    EmbeddedApplication<?> application

    void 'test main application can starts correctly'() {
        expect:
        application.running
    }

}
