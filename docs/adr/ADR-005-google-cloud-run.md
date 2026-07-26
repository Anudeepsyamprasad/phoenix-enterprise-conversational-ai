# ADR-005: Google Cloud Run for Deployment

## Status

Accepted

---

## Context

Project Phoenix requires a deployment platform that supports containerized applications with minimal infrastructure management.

---

## Decision

Google Cloud Run will host the application.

---

## Alternatives Considered

- Google Kubernetes Engine
- Compute Engine
- AWS ECS

---

## Reasons

- Serverless deployment
- Native Docker support
- Automatic scaling
- Pay-per-use pricing
- Minimal operational overhead

---

## Consequences

Advantages

- Simplified deployment
- Lower infrastructure management effort
- Fast iteration during development

Trade-offs

- Less infrastructure customization compared to Kubernetes.