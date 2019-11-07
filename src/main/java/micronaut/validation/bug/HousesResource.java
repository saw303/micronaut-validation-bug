package micronaut.validation.bug;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.annotation.QueryValue;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Collection;

@Controller("/houses")
@Introspected
public class HousesResource {

    @Get
    @Produces("application/json")
    public Collection<String> getCollection(@Valid @NotNull @QueryValue String q) {
        return Arrays.asList("Hello", "World");
    }
}

