package org.crcaguilerapo;


import io.swagger.v3.core.util.Yaml;
import io.swagger.v3.jaxrs2.Reader;
import io.swagger.v3.oas.integration.SwaggerConfiguration;
import io.swagger.v3.oas.models.OpenAPI;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader(new SwaggerConfiguration());
        OpenAPI openAPI = reader
                .read(Stream.of(ExampleController.class).collect(Collectors.toSet()));
        String yamlString = Yaml.pretty(openAPI);
        System.out.println(yamlString);
    }
}