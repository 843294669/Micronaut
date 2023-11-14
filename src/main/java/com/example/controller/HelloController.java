package com.example.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;

import java.io.File;
import java.io.IOException;

@Controller("/hello")
public class HelloController {
    @Get
    public void index() throws IOException {
        try (Context context = Context.create("js")) {
            Source source = Source.newBuilder("js", new File("src/main/resources/asserts/js/index.js")).build();
            // print "hello world" on console.
            context.eval(source);
        }
    }
}
