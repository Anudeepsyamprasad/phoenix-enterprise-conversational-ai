# Deployment Architecture

## Overview

Phoenix is deployed using Docker containers on Google Cloud Run.

---

# Deployment Flow

Developer

↓

GitHub

↓

Docker Build

↓

Container Image

↓

Google Cloud Run

↓

Users

---

# Infrastructure

React

↓

Spring Boot

↓

PostgreSQL

---

# Environment Variables

Database
JWT Secret
Dialogflow Credentials

---

# Logging

Application Logs
Error Logs
Cloud Logs

---

# Monitoring

Health Checks
Metrics
Alerts

---

# Future Deployment

CI/CD
GitHub Actions
Artifact Registry