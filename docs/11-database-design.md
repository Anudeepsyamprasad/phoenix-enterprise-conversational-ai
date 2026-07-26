# Database Design

## Overview

Project Phoenix uses PostgreSQL as the primary relational database.

The database is responsible for storing application users, conversation history, chatbot interactions, audit information, and administrative data.

---

# Database Design Principles

- Normalized schema
- ACID compliance
- Referential integrity
- Indexed search
- Auditability

---

# Core Entities

1. User
2. Conversation
3. Message
4. Intent
5. AuditLog

---

# Entity Relationship Diagram

[ER Diagram Placeholder]

---

# Entity Definitions

## User

Purpose

Stores administrator information.

Fields

- id
- username
- password
- email
- role
- created_at

---

## Conversation

Purpose

Stores chatbot sessions.

Fields

- id
- session_id
- user_id
- started_at
- ended_at

---

## Message

Purpose

Stores every exchanged message.

Fields

- id
- conversation_id
- sender
- message
- timestamp

---

## Intent

Purpose

Stores recognized Dialogflow intents.

---

## AuditLog

Purpose

Stores security and administrative events.

---

# Relationships

User
↓

Conversation

↓

Messages

↓

Intent

---

# Indexing Strategy

- session_id
- created_at
- user_id

---

# Future Tables

- Notifications
- Feedback
- Attachments
- Roles