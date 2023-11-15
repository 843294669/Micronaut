package com.example;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.graalvm.polyglot.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;

@MicronautTest
class MicronautDemoTest {

    @Inject
    EmbeddedApplication<?> application;

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
    }

    @Test
    void testJS() {
        try (Context context = Context.create()) {
            Source source = Source.create("js", "42");
            Value value;
            try {
                value = context.parse(source);
                // parsing succeeded
            } catch (PolyglotException e) {
                if (e.isSyntaxError()) {
                    SourceSection location = e.getSourceLocation();
                    // syntax error detected at location
                } else {
                    // other guest error detected
                }
                throw e;
            }
            // evaluate the parsed script
            System.out.println(value.execute());
        }
    }

}
