package org.crcaguilerapo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.servers.ServerVariable;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@OpenAPIDefinition(
        info = @Info(
                title = "the title",
                version = "1.0",
                description = "My API",
                license = @io.swagger.v3.oas.annotations.info.License(name = "Apache 2.0")
        ),
        tags = {
                @Tag(name = "Tag 1", description = "desc 1"),
                @Tag(name = "Tag 2", description = "desc 2"),
                @Tag(name = "Tag 3", description = "desc 2")
        },
        servers = {
                @Server(
                        description = "server 1",
                        url = "http://localhost",
                        variables = {
                                @ServerVariable(name = "var1", description = "var 1", defaultValue = "1", allowableValues = {"1", "2"}),
                                @ServerVariable(name = "var2", description = "var 2", defaultValue = "1", allowableValues = {"1", "2"})
                        })
        }
)
@Path("/test")
public class ExampleController {

    @GET
    @Operation(
            summary = "Get",
            responses = {
                    @ApiResponse(
                            description = "test",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = String.class)
                            )
                    ),
                    @ApiResponse(responseCode = "400", description = "not found")
            }
    )
    public String testGet() {
        return "";
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(summary = "Create",
            tags = {"test"},
            responses = {
                    @ApiResponse(
                            responseCode = "201",
                            description = "Resource created",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = String.class))
                    ),
                    @ApiResponse(responseCode = "400", description = "Invalid input")
            }
    )
    public String testPost(String requestBody) {
        return "";
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(summary = "Update",
            tags = {"test"},
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successful update",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = String.class))
                    ),
                    @ApiResponse(responseCode = "400", description = "Invalid"),
                    @ApiResponse(responseCode = "404", description = "Not found"),
                    @ApiResponse(responseCode = "405", description = "Validation exception")
            }
    )
    public String testPut(String requestBody) {
        return "";
    }

    @PATCH
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(summary = "Partial update",
            tags = {"test"},
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Partial update successful",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = String.class))
                    ),
                    @ApiResponse(responseCode = "400", description = "Invalid input"),
                    @ApiResponse(responseCode = "404", description = "Not found")
            }
    )
    public String testPatch(String requestBody) {
        return "";
    }

    @DELETE
    @Operation(summary = "Delete",
            tags = {"test"},
            responses = {
                    @ApiResponse(responseCode = "204", description = "Deleted successfully"),
                    @ApiResponse(responseCode = "404", description = "Not found")
            }
    )
    public void testDelete() {
        // Implement delete functionality here
    }
}
