package com.github.edsandrof;

import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;

@OpenAPIDefinition(
        info = @Info(
                title = "Movies Service API",
                version = "1.0.0",
                contact = @Contact(name = "edsandrof",
                        url = "https://github.com/edsandrof"
                ),
                license = @License(name = "GNU GPLv3", url = "https://www.gnu.org/licenses/gpl-3.0.txt")
        )
)
public class MoviesServiceApplication extends Application {
}
