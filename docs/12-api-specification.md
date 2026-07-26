# API Specification

## Overview

REST APIs exposed by the Spring Boot backend.

---

# Authentication APIs

POST /api/auth/login

POST /api/auth/logout

POST /api/auth/refresh

---

# Conversation APIs

POST /api/chat/message

GET /api/chat/history

GET /api/chat/session/{id}

---

# Analytics APIs

GET /api/admin/dashboard

GET /api/admin/statistics

---

# User APIs

GET /api/users

POST /api/users

PUT /api/users/{id}

DELETE /api/users/{id}

---

# Request Format

JSON

---

# Response Format

JSON

---

# HTTP Status Codes

200

201

400

401

403

404

500

---

# Authentication

JWT Bearer Token

---

# API Versioning

/api/v1/