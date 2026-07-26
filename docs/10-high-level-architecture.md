# High-Level Architecture

## Overview

Project Phoenix follows a modular, layered architecture designed to demonstrate how enterprise conversational AI systems integrate conversational interfaces with backend business services.

The platform separates responsibilities across independent components to improve maintainability, scalability, security, and ease of development. Each component has a well-defined responsibility and communicates through standardized interfaces.

The architecture follows a stateless REST-based communication model and is designed for deployment on Google Cloud using containerized services.

---

# Architecture Principles

The following principles guide the overall system architecture.

## Separation of Concerns

Each component is responsible for a single area of functionality.

Examples include:

- Conversation Management
- Business Logic
- Data Persistence
- Authentication
- User Interface
- Deployment

---

## Layered Architecture

The backend follows a layered architecture consisting of:

- Controller Layer
- Service Layer
- Repository Layer
- Database Layer

Each layer communicates only with its immediate neighboring layer.

---

## Modularity

Every major system component can evolve independently without affecting unrelated modules.

Examples include:

- Backend
- Frontend
- Dialogflow CX
- Database
- Deployment

---

## Stateless Communication

Backend services remain stateless.

Every request contains all information required for processing, improving scalability and simplifying deployment.

---

## Security by Design

Authentication, authorization, input validation, and secure communication are considered architectural requirements rather than optional features.

---

# High-Level System Architecture

```text
                           +----------------------+
                           |      Customer        |
                           +----------+-----------+
                                      |
                                      |
                           Chat Interface (React)
                                      |
                                      |
                           +----------v-----------+
                           |    Dialogflow CX     |
                           +----------+-----------+
                                      |
                              Webhook Request
                                      |
                           +----------v-----------+
                           |  Spring Boot Backend |
                           +----------+-----------+
                                      |
         +----------------------------+----------------------------+
         |                            |                            |
         |                            |                            |
+--------v--------+         +---------v---------+        +---------v---------+
| Authentication  |         | Business Services |        | Analytics Service |
+-----------------+         +-------------------+        +-------------------+
                                      |
                               Repository Layer
                                      |
                           +----------v-----------+
                           |     PostgreSQL       |
                           +----------------------+

                    React Admin Dashboard
                             |
                             |
                     REST API Communication
```

---

# Major Components

## React Frontend

Responsibilities:

- User Interface
- Authentication
- Administration Dashboard
- Conversation History
- Analytics Dashboard

---

## Dialogflow CX

Responsibilities:

- Intent Detection
- Entity Recognition
- Conversation State
- Flow Management
- Webhook Invocation

---

## Spring Boot Backend

Responsibilities:

- Business Logic
- REST APIs
- Authentication
- Validation
- Exception Handling
- Integration Services

---

## PostgreSQL

Responsibilities:

- User Management
- Conversation Storage
- Audit Logs
- Analytics Data

---

# Backend Layered Architecture

```text
Controller Layer
        │
        ▼
Service Layer
        │
        ▼
Repository Layer
        │
        ▼
PostgreSQL
```

---

# Request Flow

A typical customer interaction follows the sequence below.

1. User submits a message.
2. Dialogflow CX identifies the intent.
3. Dialogflow invokes the backend webhook.
4. Spring Boot validates the request.
5. Business logic executes.
6. Repository retrieves required data.
7. PostgreSQL returns the requested information.
8. Spring Boot formats the response.
9. Dialogflow generates the final conversational response.
10. User receives the response.

---

# Component Communication

| Source | Destination | Communication |
|---------|-------------|---------------|
| React | Spring Boot | REST API |
| Dialogflow CX | Spring Boot | Webhook |
| Spring Boot | PostgreSQL | JPA / Hibernate |
| Spring Boot | React | JSON over HTTPS |

---

# External Integrations

The first version integrates with:

- Dialogflow CX
- PostgreSQL
- Google Cloud Run

Future versions may integrate with:

- External Enterprise APIs
- CRM Systems
- ERP Systems
- Notification Services
- Authentication Providers

---

# Scalability Considerations

The architecture is designed to support future enhancements including:

- Additional conversational flows
- New REST APIs
- Multiple business domains
- Horizontal scaling
- Cloud-native deployment
- Microservice migration (future)

---

# Future Evolution

The initial implementation uses a modular monolithic architecture.

As the application grows, individual components such as authentication, analytics, and conversation management can be extracted into independent microservices if required.

This approach keeps the initial implementation simple while allowing future scalability without significant architectural redesign.