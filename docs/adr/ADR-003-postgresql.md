# ADR-003: PostgreSQL as Primary Database

## Status

Accepted

---

## Context

Project Phoenix stores structured application data including users, conversations, messages, intents, and audit logs.

---

## Decision

PostgreSQL will serve as the primary relational database.

---

## Alternatives Considered

- MongoDB
- MySQL

---

## Reasons

- ACID compliance
- Strong relational modeling
- Excellent indexing
- Native support for Spring Data JPA
- Mature ecosystem

---

## Consequences

Advantages

- Reliable transactions
- Strong data integrity
- Excellent reporting capabilities

Trade-offs

- Less flexible for highly dynamic schemas compared to document databases.