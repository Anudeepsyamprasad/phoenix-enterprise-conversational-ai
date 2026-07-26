# ADR-001: Modular Monolithic Architecture

## Status

Accepted

---

## Context

Project Phoenix is being developed by a single engineer within a limited timeline while aiming to demonstrate enterprise software engineering practices.

The application requires clear separation of responsibilities without introducing unnecessary operational complexity.

---

## Decision

Project Phoenix will adopt a Modular Monolithic Architecture.

The system will be organized into independent modules including:

- Backend
- Frontend
- Database
- Dialogflow CX
- Deployment

These modules will remain within a single deployable application while maintaining clear separation of concerns.

---

## Alternatives Considered

- Microservices
- Service-Oriented Architecture (SOA)

---

## Consequences

### Advantages

- Simpler deployment
- Faster development
- Easier debugging
- Lower infrastructure complexity
- Well suited for a single development team

### Trade-offs

- Independent scaling of individual modules is limited.
- Future migration to microservices may require refactoring.

---

## Review

This decision should be revisited if the application grows significantly in complexity or scale.