# Cost Sharing API

A Spring Boot REST API for managing shared costs.

## Running the API

```bash
cd api
./mvnw spring-boot:run
```

The API starts on `http://localhost:8080`.

## Development Tools

### Swagger UI

Interactive API documentation and testing interface:

[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

OpenAPI JSON spec:

[http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)

### H2 Console

In-memory database browser for inspecting data during development:

[http://localhost:8080/h2-console](http://localhost:8080/h2-console)

Connection settings:
- **JDBC URL:** `jdbc:h2:mem:testdb`
- **Username:** `sa`
- **Password:** *(leave blank)*
