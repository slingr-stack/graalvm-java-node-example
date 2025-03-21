package com.example;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

public class NodeJsExample {
    public static void main(String[] args) {
        try (Context context = Context.newBuilder("js")
                .allowAllAccess(true)
                .option("js.foreign-object-prototype", "true")
                .option("js.commonjs-require", "true")
                .option("js.commonjs-require-cwd", "src/main/resources")
                .build()) {
            // Load the Node.js library (e.g., lodash)
            context.eval("js", "var lodashLib = require('lodash');");
            // Call a function from the Node.js library
            Value result = context.eval("js", "lodashLib.camelCase('hello world');");
            System.out.println(result.asString());
        }
    }
}