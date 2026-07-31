# Development Journal

# Day 1 – Repository Foundation

**Date:** 24 July 2026

## Objective

Establish the initial repository structure and define a documentation-first development workflow.

## Completed

- Created the GitHub repository.
- Organized the project into backend, frontend, database, dialogflow, deployment, docker, docs, postman, and screenshots modules.
- Added README files for each directory.
- Configured the initial project structure.
- Created the primary project README.

## Decisions Made

- Follow a documentation-first approach before implementation.
- Use a modular project structure.
- Maintain descriptive Git commits throughout development.

## Next Steps

- Define the business problem.

# Day 2 – Product Discovery

**Date:** 26 July 2026

## Objective

Define the business context, vision, and primary users of Project Phoenix before beginning technical design.

## Completed

- Created the Business Problem Statement.
- Defined the Product Vision.
- Identified project stakeholders.
- Created initial user personas.
- Documented the primary user journey.

## Decisions Made

- Phoenix will be developed as an enterprise conversational AI platform.
- The project will follow an MVP-first approach.
- Dialogflow CX will serve as the conversational layer.
- Spring Boot will expose secure REST APIs.
- PostgreSQL will be used for persistent storage.
- React will be used for the administration interface.

## Challenges

- Balancing enterprise-level architecture with a realistic two-month implementation timeline.
- Defining the scope of the MVP while keeping future extensibility in mind.

## Lessons Learned

Clearly defining business requirements before implementation provides better architectural direction and reduces unnecessary rework.

## Next Steps

- Functional Requirements
- Non-Functional Requirements
- Use Cases
- MVP Definition
- High-Level Architecture


## Overall Project Progress

### Product Discovery

- [x] Repository Setup
- [x] Business Problem
- [x] Product Vision
- [x] Stakeholders
- [x] User Personas
- [x] User Journey

### Requirements Engineering

- [ ] Functional Requirements
- [ ] Non-Functional Requirements
- [ ] Use Cases
- [ ] MVP Definition

### System Design

- [ ] High-Level Architecture
- [ ] Database Design
- [ ] API Design

### Development

- [ ] Spring Boot Backend
- [ ] Authentication
- [ ] Dialogflow CX Integration
- [ ] React Frontend
- [ ] Docker
- [ ] Google Cloud Run Deployment

### Testing

- [ ] Unit Testing
- [ ] Integration Testing
- [ ] End-to-End Testing

### Documentation

- [ ] API Documentation
- [ ] Deployment Guide
- [ ] User Guide

## Day 3 - Local Development Environment Setup
**Date:** 30 July 2026

### Completed
- Installed Apache Maven 3.9.16 and configured MAVEN_HOME.
- Verified Java 21 and Maven installation.
- Installed PostgreSQL 18 and configured the psql command-line tool.
- Created the project database `phoenix_db`.
- Created the application database user `phoenix_user`.
- Granted required privileges on the project database.
- Installed Docker Desktop.
- Configured Docker with WSL2.
- Verified Docker Engine using the `hello-world` container.
- Verified Docker Compose installation.

### Outcome
The local development environment is fully configured and ready for backend implementation.

### Next Steps
- Generate the Spring Boot project.
- Configure the backend project structure.
- Connect Spring Boot to PostgreSQL.
- Implement the first REST API endpoint.

### Day 4 - Backend Initialization

**Date:** 31 July 2026

Completed the initial backend setup for Project Phoenix.

Achievements:
- Generated Spring Boot project
- Installed and configured Maven
- Installed PostgreSQL and created phoenix_db
- Created dedicated phoenix_user
- Configured datasource
- Installed Docker Desktop
- Verified Docker installation
- Successfully started embedded Tomcat
- Verified backend startup on localhost:8080

Current Status:
Backend foundation completed successfully.
Ready to begin domain-driven implementation.