# ADR-002: Spring Boot as Backend Framework

## Status

Accepted

---

## Context

The backend requires a mature framework capable of supporting enterprise-grade REST APIs, security, dependency injection, database integration, and cloud deployment.

---

## Decision

Spring Boot has been selected as the backend framework.

---

## Alternatives Considered

- Node.js (Express)
- ASP.NET Core
- Quarkus

---

## Reasons

- Mature enterprise ecosystem
- Spring Security
- Spring Data JPA
- Dependency Injection
- Excellent documentation
- Large developer community
- Strong cloud support

---

## Consequences

Advantages

- Rapid enterprise application development
- Strong maintainability
- Excellent integration with PostgreSQL

Trade-offs

- Higher memory usage than lightweight frameworks
- Longer startup time